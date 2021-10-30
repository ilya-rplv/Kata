package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public class BackstagePassesUpdater extends ItemUpdater {
    @Override
    public void updateQualityOf(Item item) {
        if (noDaysLeftToSell(item)) dropQuality(item);
        else if (daysLeftToSell(item, 6)) raiseQualityOf(item, 3);
        else if (daysLeftToSell(item, 11)) raiseQualityOf(item, 2);
        else raiseQualityOf(item, 1);
    }

    @Override
    protected void updateDaysLeftToSell(Item item) {
        decrementDaysLeftToSell(item);
    }
}
