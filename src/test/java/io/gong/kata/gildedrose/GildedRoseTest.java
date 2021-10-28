package io.gong.kata.gildedrose;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

    @Test
    void other_0_0() {
        String name = "Test";
        Item item = new Item(name, 0, 0);
        runOnItem(item);
        assertEquals(new Item(name, -1, 0), item);
    }

    @Test
    void other_0_10() {
        String name = "Test";
        Item item = new Item(name, 0, 10);
        runOnItem(item);
        assertEquals(new Item(name, -1, 8), item);
    }

    @Test
    void other_10_10() {
        String name = "Test";
        Item item = new Item(name, 10, 10);
        runOnItem(item);
        assertEquals(new Item(name, 9, 9), item);
    }

    @Test
    void brie_0_0() {
        String name = "Aged Brie";
        Item item = new Item(name, 0, 0);
        runOnItem(item);
        assertEquals(new Item(name, -1, 2), item);
    }

    @Test
    void brie_10_0() {
        String name = "Aged Brie";
        Item item = new Item(name, 10, 0);
        runOnItem(item);
        assertEquals(new Item(name, 9, 1), item);
    }

    @Test
    void bspass_0_0() {
        String name = "Backstage passes to a TAFKAL80ETC concert";
        Item item = new Item(name, 0, 0);
        runOnItem(item);
        assertEquals(new Item(name, -1, 0), item);
    }

    @Test
    void bspass_0_10() {
        String name = "Backstage passes to a TAFKAL80ETC concert";
        Item item = new Item(name, 0, 10);
        runOnItem(item);
        assertEquals(new Item(name, -1, 0), item);
    }

    @Test
    void bspass_10_10() {
        String name = "Backstage passes to a TAFKAL80ETC concert";
        Item item = new Item(name, 10, 10);
        runOnItem(item);
        assertEquals(new Item(name, 9, 12), item);
    }

    @Test
    void sulfuras_0_0() {
        String name = "Sulfuras, Hand of Ragnaros";
        Item item = new Item(name, 0, 0);
        runOnItem(item);
        assertEquals(new Item(name, 0, 0), item);
    }

    private void runOnItem(Item item) {
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();
    }

}
