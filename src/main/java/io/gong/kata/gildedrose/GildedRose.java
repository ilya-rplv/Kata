package io.gong.kata.gildedrose;

class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateQuality(item);

            decreaseSellIn(item);

            if (isExpired(item)) {
                handleExpired(item);
            }
        }
    }

    //--

    private boolean isExpired(Item item) {
        return item.sellIn < 0;
    }

    private void handleExpired(Item item) {
        if (!item.name.equals(AGED_BRIE)) {
            if (!item.name.equals(BACKSTAGE_PASSES)) {
                if (item.quality > 0) {
                    if (!item.name.equals(SULFURAS)) {
                        item.quality = item.quality - 1;
                    }
                }
            } else {
                item.quality = item.quality - item.quality;
            }
        } else {
            increaseQuality(item);
        }
    }

    private void decreaseSellIn(Item item) {
        if (!item.name.equals(SULFURAS)) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void updateQuality(Item item) {
        if (item.name.equals(BACKSTAGE_PASSES)) {
            increaseQuality(item);
            if (item.sellIn < 11) {
                increaseQuality(item);
            }
            if (item.sellIn < 6) {
                increaseQuality(item);
            }
        } else if (item.name.equals(AGED_BRIE)) {
            increaseQuality(item);
        } else if (!item.name.equals(SULFURAS))
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
