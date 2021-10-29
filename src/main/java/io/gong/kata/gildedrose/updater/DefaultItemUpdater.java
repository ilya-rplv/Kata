package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public class DefaultItemUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        decrementQuality(item);
        if (item.sellIn < 0) {
            decrementQuality(item);
        }
        decrementDaysLeftToSell(item);
    }
}
