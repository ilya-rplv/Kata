package io.gong.kata.gildedrose;

import java.util.Arrays;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(this::update);
    }

    private void update(Item item) {
        if (!item.name.equals(AGED_BRIE) && !item.name.equals(BACKSTAGE_PASSES) && !item.name.equals(SULFURAS)) {
            decrementQuality(item);
            if (item.sellIn < 0) {
                decrementQuality(item);
            }
        }

        if (item.name.equals(AGED_BRIE)){
            incrementQuality(item);
            if (item.sellIn < 0) {
                incrementQuality(item);
            }
        }

        if (item.name.equals(BACKSTAGE_PASSES)) {
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
        }

        if (!item.name.equals(SULFURAS)) {
            decrementDaysLeftToSell(item);
        }
    }

    private void decrementDaysLeftToSell(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void incrementQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    private void decrementQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void dropQuality(Item item) {
        item.quality = 0;
    }
}
