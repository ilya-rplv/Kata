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
        if (nameIs(item, AGED_BRIE))
            updateAgedBree(item);
        else if (nameIs(item, BACKSTAGE_PASSES))
            updateBackstagePasses(item);
        else if (nameIs(item, SULFURAS))
            updateSulfuras(item);
        else
            updateOtherItem(item);

        decrementDaysLeftToSell(item);
    }

    private void updateOtherItem(Item item) {
        decrementQuality(item);
        if (item.sellIn < 0) {
            decrementQuality(item);
        }
    }

    private void updateSulfuras(Item item) {
        incrementDaysLeftToSell(item);
    }

    private void updateBackstagePasses(Item item) {
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

    private void updateAgedBree(Item item) {
        incrementQuality(item);
        if (item.sellIn < 0) {
            incrementQuality(item);
        }
    }

    private boolean nameIs(Item item, String name) {
        return item.name.equals(name);
    }

    private void decrementDaysLeftToSell(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void incrementDaysLeftToSell(Item item) {
        item.sellIn = item.sellIn + 1;
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
