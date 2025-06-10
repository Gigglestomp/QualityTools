package net.dungeondesk.qualitytools.block.entity.custom;

import net.dungeondesk.qualitytools.block.entity.ModBlockEntities;
import net.dungeondesk.qualitytools.screen.custom.BackpackScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class BackpackBlockEntity extends LootableContainerBlockEntity implements SidedInventory, ExtendedScreenHandlerFactory<BlockPos> {
    private DefaultedList<ItemStack> inventory = DefaultedList.ofSize(27, ItemStack.EMPTY);
    private int viewerCount;

    public BackpackBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BACKPACK_BE, pos, state);
    }

    @Override
    public BlockPos getScreenOpeningData(ServerPlayerEntity player) {
        return this.pos;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Backpack");
    }

    @Override
    protected Text getContainerName() {
        return null;
    }

    @Override
    public void onBlockReplaced(BlockPos pos, BlockState oldState) {
    }

    @Override
    protected DefaultedList<ItemStack> getHeldStacks() {
        return this.inventory;
    }


    @Override
    protected void setHeldStacks(DefaultedList<ItemStack> inventory) {

    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new BackpackScreenHandler(syncId, playerInventory, this.pos);
    }

    @Override
    public void onOpen(PlayerEntity player) {
        if (!this.removed && !player.isSpectator()) {
            if (this.viewerCount < 0) {
                this.viewerCount = 0;
            }

            this.viewerCount++;
            this.world.addSyncedBlockEvent(this.pos, this.getCachedState().getBlock(), 1, this.viewerCount);
            if (this.viewerCount == 1) {
                this.world.emitGameEvent(player, GameEvent.CONTAINER_OPEN, this.pos);
                this.world.playSound(null, this.pos, SoundEvents.ITEM_BUNDLE_INSERT, SoundCategory.BLOCKS, 0.5F, this.world.random.nextFloat() * 0.1F + 0.9F);
            }
        }
    }

    @Override
    public void onClose(PlayerEntity player) {
        if (!this.removed && !player.isSpectator()) {
            this.viewerCount--;
            this.world.addSyncedBlockEvent(this.pos, this.getCachedState().getBlock(), 1, this.viewerCount);
            if (this.viewerCount <= 0) {
                this.world.emitGameEvent(player, GameEvent.CONTAINER_CLOSE, this.pos);
                this.world.playSound(null, this.pos, SoundEvents.ITEM_BUNDLE_INSERT, SoundCategory.BLOCKS, 0.5F, this.world.random.nextFloat() * 0.1F + 0.9F);
            }
        }
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        super.readNbt(nbt, registries);
        this.readInventoryNbt(nbt, registries);
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        super.writeNbt(nbt, registries);
        if (!this.writeLootTable(nbt)) {
            Inventories.writeNbt(nbt, this.inventory, false, registries);
        }
    }

    public void readInventoryNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registries) {
        this.inventory = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if (!this.readLootTable(nbt)) {
            Inventories.readNbt(nbt, this.inventory, registries);
        }
    }

    public boolean writeLootTable(NbtCompound nbt) {
        RegistryKey<LootTable> registryKey = this.getLootTable();
        if (registryKey == null) {
            return false;
        } else {
            nbt.put("LootTable", LootTable.TABLE_KEY, registryKey);
            long l = this.getLootTableSeed();
            if (l != 0L) {
                nbt.putLong("LootTableSeed", l);
            }

            return true;
        }
    }

    @Override
    public int[] getAvailableSlots(Direction side) {
        return new int[0];
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return false;
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        return false;
    }

    @Override
    public int size() {
        return this.inventory.size();
    }

}