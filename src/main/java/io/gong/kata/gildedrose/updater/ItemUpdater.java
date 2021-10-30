package io.gong.kata.gildedrose.updater;

import io.gong.kata.gildedrose.Item;

public abstract class ItemUpdater {

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    public void update(Item item) {
        updateQualityOf(item);
        updateDaysLeftToSell(item);
    }
    
    protected abstract void updateQualityOf(Item item);
    protected abstract void updateDaysLeftToSell(Item item);

    protected boolean daysLeftToSell(Item item, int areUnder) {
        return item.sellIn < areUnder;
    }

    protected boolean noDaysLeftToSell(Item item) {
        return daysLeftToSell(item, 0);
    }

    protected void decrementDaysLeftToSell(Item item) {
        item.sellIn--;
    }

    protected void raiseQualityOf(Item item, int by) {
        item.quality = Math.min(item.quality + by, MAX_QUALITY);
    }

    protected void reduceQualityOf(Item item, int by) {
        item.quality = Math.max(item.quality - by, MIN_QUALITY);
    }

    protected void dropQuality(Item item) {
        item.quality = MIN_QUALITY;
    }
}
