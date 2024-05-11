package ancient.flavored.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnglishLangProvider extends FabricLanguageProvider {
    public EnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        /* MAIN FLAVORS */

        translationBuilder.add("item.flavored.chocolate_bar", "Chocolate Bar");
        translationBuilder.add("item.flavored.mint", "Mint");

        translationBuilder.add("item.flavored.vanilla_pods", "Vanilla Pods");
        translationBuilder.add("item.flavored.dried_vanilla_pods", "Dried Vanilla Pods");

        translationBuilder.add("item.flavored.cinnamon_cane", "Cinnamon Cane");

        /* CAKES */

        translationBuilder.add("blocks.flavored.berries_tart", "Berries Tart");
        translationBuilder.add("blocks.flavored.chocolate_cake", "Chocolate Cake");
        translationBuilder.add("blocks.flavored.cinnamon_cake", "Cinnamon Cake");
        translationBuilder.add("blocks.flavored.honey_cake", "Honey Cake");
        translationBuilder.add("blocks.flavored.mint_cake", "Mint Cake");
        translationBuilder.add("blocks.flavored.vanilla_cake", "Vanilla Cake");

        /* ICE CREAM BLOCKS */

        translationBuilder.add("blocks.flavored.berries_ice_cream_block", "Berries Ice Cream Block");
        translationBuilder.add("blocks.flavored.chocolate_ice_cream_block", "Chocolate Ice Cream Block");
        translationBuilder.add("blocks.flavored.honey_ice_cream_block", "Honey Ice Cream Block");
        translationBuilder.add("blocks.flavored.mint_ice_cream_block", "Mint Ice Cream Block");
        translationBuilder.add("blocks.flavored.vanilla_ice_cream_block", "Vanilla Ice Cream Block");
        translationBuilder.add("blocks.flavored.watermelon_ice_cream_block", "Watermelon Ice Cream Block");

        /* CAKE SLICES */

        translationBuilder.add("items.flavored.berries_tart_slice", "Berries Tart Slice");
        translationBuilder.add("items.flavored.chocolate_cake_slice", "Chocolate Cake Slice");
        translationBuilder.add("items.flavored.cinnamon_cake_slice", "Cinnamon Cake Slice");
        translationBuilder.add("items.flavored.honey_cake_slice", "Honey Cake Slice");
        translationBuilder.add("items.flavored.mint_cake_slice", "Mint Cake Slice");
        translationBuilder.add("items.flavored.vanilla_cake_slice", "Vanilla Cake Slice");

        /* ICE CREAMS */

        translationBuilder.add("items.flavored.berries_ice_cream", "Berries Ice Cream");
        translationBuilder.add("items.flavored.chocolate_ice_cream", "Chocolate Ice Cream");
        translationBuilder.add("items.flavored.honey_ice_cream", "Honey Ice Cream");
        translationBuilder.add("items.flavored.mint_ice_cream", "Mint Ice Cream");
        translationBuilder.add("items.flavored.vanilla_ice_cream", "Vanilla Ice Cream");
        translationBuilder.add("items.flavored.watermelon_ice_cream", "Watermelon Ice Cream");

        /* SHAKES */

        translationBuilder.add("items.flavored.berries_shake", "Berries Shake");
        translationBuilder.add("items.flavored.chocolate_shake", "Chocolate Shake");
        translationBuilder.add("items.flavored.honey_shake", "Honey Shake");
        translationBuilder.add("items.flavored.mint_shake", "Mint Shake");
        translationBuilder.add("items.flavored.vanilla_shake", "Vanilla Shake");
        translationBuilder.add("items.flavored.watermelon_shake", "Watermelon Shake");

        /* SPECIAL ITEMS */

        translationBuilder.add("items.flavored.mint_filled_chocolate", "Mint Filled Chocolate");
        translationBuilder.add("items.flavored.vanilla_filled_chocolate", "Vanilla Filled Chocolate");

        translationBuilder.add("items.flavored.mints", "Mints");

        translationBuilder.add("items.flavored.marshmallow", "Marshmallow");

        translationBuilder.add("items.flavored.hot_chocolate", "Hot Chocolate");

        translationBuilder.add("items.flavored.cinnamon_rolls", "Cinnamon Rolls");

        /* UTILITY ITEMS */

        translationBuilder.add("items.flavored.mug", "Mug");

        /* Other Shit */

        translationBuilder.add("itemgroup.flavored", "Flavored");



        // Tłumaczenie nazwy i opisu moda w Mod Menu
        // translationBuilder.add("modmenu.nameTranslation.flavored", "Flavored");
        // translationBuilder.add("modmenu.descriptionTranslation.flavored", "Flavored Desc...");
    }
}