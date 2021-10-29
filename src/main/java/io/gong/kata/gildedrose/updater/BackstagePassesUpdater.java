package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public class BackstagePassesUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        incrementQuality(item);
        if (item.sellIn < 11) {
            incrementQuality(item);
        }
        if (item.sellIn < 6) {
            incrementQuality(item);
        }
        if (item.sellIn < 0) {
            dropQuality(item);
        }
        decrementDaysLeftToSell(item);
    }
}
