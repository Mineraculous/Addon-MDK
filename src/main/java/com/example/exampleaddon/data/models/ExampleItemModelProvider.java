package com.example.exampleaddon.data.models;

import com.example.exampleaddon.ExampleAddon;
import com.example.exampleaddon.world.item.ExampleItems;
import dev.thomasglasser.mineraculous.api.data.models.MineraculousItemModelProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

/**
 * Generates item model JSON files (in {@code src/generated/resources/models/item/}) for this addon.
 *
 * <p>Extending {@link MineraculousItemModelProvider} gives us convenient helper methods
 * like {@link #basicItem} and advanced perspective model builders.
 */
public class ExampleItemModelProvider extends MineraculousItemModelProvider {
    public ExampleItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ExampleAddon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Generates a standard generated item model pointing to "item/example_jewel" texture
        basicItem(ExampleItems.EXAMPLE_JEWEL.get());
    }
}
