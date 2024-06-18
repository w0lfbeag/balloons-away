package wolfbeag.balloonsaway;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static wolfbeag.balloonsaway.ItemGroups.ITEM_GROUP;
import static wolfbeag.balloonsaway.items.Moditems.*;

public class BalloonsAway implements ModInitializer {
	public static final String ModID = "BalloonsAway";


	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("balloons-away");

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of("balloonsaway", "water_balloon"), WATER_BALLOON);
		Registry.register(Registries.ITEM_GROUP, Identifier.of("balloonsaway", "balloons_away"), ITEM_GROUP);
		Registry.register(Registries.ITEM, Identifier.of("balloonsaway", "camel_balloon"), CAMEL_BALLOON);
		Registry.register(Registries.ITEM, Identifier.of("balloonsaway", "villager_balloon"), VILLAGER_BALLOON);
		Registry.register(Registries.ITEM, Identifier.of("balloonsaway", "white_balloon"), WHITE_BALLOON);
		Registry.register(Registries.ITEM, Identifier.of("balloonsaway", "wolf_balloon"), WOLF_BALLOON);
		Registry.register(Registries.ITEM, Identifier.of("balloonsaway", "sniffer_balloon"), SNIFFER_BALLOON);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}