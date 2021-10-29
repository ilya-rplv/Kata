package io.gong.kata.gildedrose;

import io.gong.kata.gildedrose.updater.ItemUpdaterFactory;

import java.util.Arrays;

class GildedRose {

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(this::update);
    }

    private void update(Item item) {
        ItemUpdaterFactory.updaterFor(item).update(item);
    }

}
