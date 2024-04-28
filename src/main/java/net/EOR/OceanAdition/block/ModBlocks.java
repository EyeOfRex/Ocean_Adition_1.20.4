package net.EOR.OceanAdition.block;

import net.EOR.OceanAdition.Item.Mod_Item;
import net.EOR.OceanAdition.OceanAdition;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OceanAdition.MOD_ID);


    public static final RegistryObject<Block> POLISHED_PRISMARINE_BLOCK = registerBlock("polished_prismarine_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops().strength(5.0F, 6.0F).lightLevel((p_152605_) -> {
                return 3;
            })));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Mod_Item.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
