package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public class AgedBrieUpdater extends ItemUpdater {
    @Override
    public void updateQualityOf(Item item) {
        if (noDaysLeftToSell(item)) raiseQualityOf(item, 2);
        else raiseQualityOf(item, 1);
    }

    @Override
    protected void updateDaysLeftToSell(Item item) {
        decrementDaysLeftToSell(item);
    }
}
