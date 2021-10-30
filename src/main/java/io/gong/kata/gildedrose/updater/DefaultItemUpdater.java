package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public class DefaultItemUpdater extends ItemUpdater {
    @Override
    public void updateQualityOf(Item item) {
        if (daysLeftToSell(item, 0)) reduceQualityOf(item, 2);
        else reduceQualityOf(item, 1);
    }

    @Override
    protected void updateDaysLeftToSell(Item item) {
        decrementDaysLeftToSell(item);
    }
}
