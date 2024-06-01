
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemEggsAnurognathidAnurognathus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_anurognathid_anurognathus")
	public static final Item block = null;
	public ItemEggsAnurognathidAnurognathus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_anurognathid_anurognathus);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_anurognathid_anurognathus", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("bakingEgg", ItemEggsAnurognathidAnurognathus.block);
		OreDictionary.registerOre("egg", ItemEggsAnurognathidAnurognathus.block);
		OreDictionary.registerOre("eggCookable", ItemEggsAnurognathidAnurognathus.block);
		OreDictionary.registerOre("foodSimpleEgg", ItemEggsAnurognathidAnurognathus.block);
		OreDictionary.registerOre("ingredientEgg", ItemEggsAnurognathidAnurognathus.block);
		OreDictionary.registerOre("listAllegg", ItemEggsAnurognathidAnurognathus.block);
		OreDictionary.registerOre("objectEgg", ItemEggsAnurognathidAnurognathus.block);
	}

	public static class ItemCustom extends ItemEggsPF {
		public ItemCustom() {
			super();
			setTranslationKey("pf_eggs_anurognathid_anurognathus");
			setRegistryName("eggs_anurognathid_anurognathus");
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		@Override
		public String getMobString() {
			return LepidodendronMod.MODID + ":prehistoric_flora_anurognathid@anurognathus";
		}

	}

}
