package net.fabricmc.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;

public class ExampleMod implements ModInitializer {
	public static final Item MUD_BALL = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("persona","arsend"), MUD_BALL);
	}

}

