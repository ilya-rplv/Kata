package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public abstract class ItemUpdater {
    public abstract void update(Item item);

    protected void decrementDaysLeftToSell(Item item) {
        item.sellIn--;
    }

    protected void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    protected void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    protected void dropQuality(Item item) {
        item.quality = 0;
    }
}
