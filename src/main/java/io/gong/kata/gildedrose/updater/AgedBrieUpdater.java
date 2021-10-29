package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public class AgedBrieUpdater extends ItemUpdater {
    @Override
    public void update(Item item) {
        incrementQuality(item);
        if (item.sellIn < 0) {
            incrementQuality(item);
        }
        decrementDaysLeftToSell(item);
    }
}
