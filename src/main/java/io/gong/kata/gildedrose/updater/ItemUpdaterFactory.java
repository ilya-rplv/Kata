package io.gong.kata.gildedrose.updater;

import com.google.common.collect.ImmutableMap;
import io.gong.kata.gildedrose.Item;

import java.util.Map;

public class ItemUpdaterFactory {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private static final Map<String, ItemUpdater> itemUpdaterByName = ImmutableMap.of(
            AGED_BRIE, new AgedBrieUpdater(),
            BACKSTAGE_PASSES, new BackstagePassesUpdater(),
            SULFURAS, new SulfurasUpdater()
    );

    private static final DefaultItemUpdater defaultItemUpdater = new DefaultItemUpdater();

    public static ItemUpdater updaterFor(Item item) {
        return itemUpdaterByName.getOrDefault(item.name, defaultItemUpdater);
    }
}
