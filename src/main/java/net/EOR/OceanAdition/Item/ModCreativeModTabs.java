package net.EOR.OceanAdition.Item;

import net.EOR.OceanAdition.OceanAdition;
import net.EOR.OceanAdition.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OceanAdition.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OCEAN_TAB = CREATIVE_MODE_TABS.register("ocean_adition",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.PRISMARINE_SHARD))
                    .title(Component.translatable("creativetab.ocean_adition"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Mod_Item.PRISMARINE_STICK.get());
                        pOutput.accept(Mod_Item.POLISHED_PRISMARINE_SHARD.get());
                        pOutput.accept(ModBlocks.POLISHED_PRISMARINE_BLOCK.get());
                    })
                    .build());


    public static  void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
