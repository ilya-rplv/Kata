package io.gong.kata.gildedrose;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GildedRoseTest {

    private static final String SOMETHING_ELSE = "Something Else";
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    @Test
    void n0s0q0() {
        Item actual = runOnItem(SOMETHING_ELSE, -1, 0);
        Item expected = new Item(SOMETHING_ELSE, -2, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n0s1q0() {
        Item actual = runOnItem(SOMETHING_ELSE, 5, 0);
        Item expected = new Item(SOMETHING_ELSE, 4, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n0s2q0() {
        Item actual = runOnItem(SOMETHING_ELSE, 10, 0);
        Item expected = new Item(SOMETHING_ELSE, 9, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n0s3q0() {
        Item actual = runOnItem(SOMETHING_ELSE, 20, 0);
        Item expected = new Item(SOMETHING_ELSE, 19, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n0s0q1() {
        Item actual = runOnItem(SOMETHING_ELSE, -1, 25);
        Item expected = new Item(SOMETHING_ELSE, -2, 23);
        assertEquals(expected, actual);
    }

    @Test
    void n0s1q1() {
        Item actual = runOnItem(SOMETHING_ELSE, 5, 25);
        Item expected = new Item(SOMETHING_ELSE, 4, 24);
        assertEquals(expected, actual);
    }

    @Test
    void n0s2q1() {
        Item actual = runOnItem(SOMETHING_ELSE, 10, 25);
        Item expected = new Item(SOMETHING_ELSE, 9, 24);
        assertEquals(expected, actual);
    }

    @Test
    void n0s3q1() {
        Item actual = runOnItem(SOMETHING_ELSE, 20, 25);
        Item expected = new Item(SOMETHING_ELSE, 19, 24);
        assertEquals(expected, actual);
    }

    @Test
    void n0s0q2() {
        Item actual = runOnItem(SOMETHING_ELSE, -1, 50);
        Item expected = new Item(SOMETHING_ELSE, -2, 48);
        assertEquals(expected, actual);
    }

    @Test
    void n0s1q2() {
        Item actual = runOnItem(SOMETHING_ELSE, 5, 50);
        Item expected = new Item(SOMETHING_ELSE, 4, 49);
        assertEquals(expected, actual);
    }

    @Test
    void n0s2q2() {
        Item actual = runOnItem(SOMETHING_ELSE, 10, 50);
        Item expected = new Item(SOMETHING_ELSE, 9, 49);
        assertEquals(expected, actual);
    }

    @Test
    void n0s3q2() {
        Item actual = runOnItem(SOMETHING_ELSE, 20, 50);
        Item expected = new Item(SOMETHING_ELSE, 19, 49);
        assertEquals(expected, actual);
    }

    @Test
    void n1s0q0() {
        Item actual = runOnItem(AGED_BRIE, -1, 0);
        Item expected = new Item(AGED_BRIE, -2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void n1s1q0() {
        Item actual = runOnItem(AGED_BRIE, 5, 0);
        Item expected = new Item(AGED_BRIE, 4, 1);
        assertEquals(expected, actual);
    }

    @Test
    void n1s2q0() {
        Item actual = runOnItem(AGED_BRIE, 10, 0);
        Item expected = new Item(AGED_BRIE, 9, 1);
        assertEquals(expected, actual);
    }

    @Test
    void n1s3q0() {
        Item actual = runOnItem(AGED_BRIE, 20, 0);
        Item expected = new Item(AGED_BRIE, 19, 1);
        assertEquals(expected, actual);
    }

    @Test
    void n1s0q1() {
        Item actual = runOnItem(AGED_BRIE, -1, 25);
        Item expected = new Item(AGED_BRIE, -2, 27);
        assertEquals(expected, actual);
    }

    @Test
    void n1s1q1() {
        Item actual = runOnItem(AGED_BRIE, 5, 25);
        Item expected = new Item(AGED_BRIE, 4, 26);
        assertEquals(expected, actual);
    }

    @Test
    void n1s2q1() {
        Item actual = runOnItem(AGED_BRIE, 10, 25);
        Item expected = new Item(AGED_BRIE, 9, 26);
        assertEquals(expected, actual);
    }

    @Test
    void n1s3q1() {
        Item actual = runOnItem(AGED_BRIE, 20, 25);
        Item expected = new Item(AGED_BRIE, 19, 26);
        assertEquals(expected, actual);
    }

    @Test
    void n1s0q2() {
        Item actual = runOnItem(AGED_BRIE, -1, 50);
        Item expected = new Item(AGED_BRIE, -2, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n1s1q2() {
        Item actual = runOnItem(AGED_BRIE, 5, 50);
        Item expected = new Item(AGED_BRIE, 4, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n1s2q2() {
        Item actual = runOnItem(AGED_BRIE, 10, 50);
        Item expected = new Item(AGED_BRIE, 9, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n1s3q2() {
        Item actual = runOnItem(AGED_BRIE, 20, 50);
        Item expected = new Item(AGED_BRIE, 19, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n2s0q0() {
        Item actual = runOnItem(BACKSTAGE_PASSES, -1, 0);
        Item expected = new Item(BACKSTAGE_PASSES, -2, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n2s1q0() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 5, 0);
        Item expected = new Item(BACKSTAGE_PASSES, 4, 3);
        assertEquals(expected, actual);
    }

    @Test
    void n2s2q0() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 10, 0);
        Item expected = new Item(BACKSTAGE_PASSES, 9, 2);
        assertEquals(expected, actual);
    }

    @Test
    void n2s3q0() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 20, 0);
        Item expected = new Item(BACKSTAGE_PASSES, 19, 1);
        assertEquals(expected, actual);
    }

    @Test
    void n2s0q1() {
        Item actual = runOnItem(BACKSTAGE_PASSES, -1, 25);
        Item expected = new Item(BACKSTAGE_PASSES, -2, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n2s1q1() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 5, 25);
        Item expected = new Item(BACKSTAGE_PASSES, 4, 28);
        assertEquals(expected, actual);
    }

    @Test
    void n2s2q1() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 10, 25);
        Item expected = new Item(BACKSTAGE_PASSES, 9, 27);
        assertEquals(expected, actual);
    }

    @Test
    void n2s3q1() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 20, 25);
        Item expected = new Item(BACKSTAGE_PASSES, 19, 26);
        assertEquals(expected, actual);
    }

    @Test
    void n2s0q2() {
        Item actual = runOnItem(BACKSTAGE_PASSES, -1, 50);
        Item expected = new Item(BACKSTAGE_PASSES, -2, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n2s1q2() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 5, 50);
        Item expected = new Item(BACKSTAGE_PASSES, 4, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n2s2q2() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 10, 50);
        Item expected = new Item(BACKSTAGE_PASSES, 9, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n2s3q2() {
        Item actual = runOnItem(BACKSTAGE_PASSES, 20, 50);
        Item expected = new Item(BACKSTAGE_PASSES, 19, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n3s0q0() {
        Item actual = runOnItem(SULFURAS, -1, 0);
        Item expected = new Item(SULFURAS, -1, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n3s1q0() {
        Item actual = runOnItem(SULFURAS, 5, 0);
        Item expected = new Item(SULFURAS, 5, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n3s2q0() {
        Item actual = runOnItem(SULFURAS, 10, 0);
        Item expected = new Item(SULFURAS, 10, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n3s3q0() {
        Item actual = runOnItem(SULFURAS, 20, 0);
        Item expected = new Item(SULFURAS, 20, 0);
        assertEquals(expected, actual);
    }

    @Test
    void n3s0q1() {
        Item actual = runOnItem(SULFURAS, -1, 25);
        Item expected = new Item(SULFURAS, -1, 25);
        assertEquals(expected, actual);
    }

    @Test
    void n3s1q1() {
        Item actual = runOnItem(SULFURAS, 5, 25);
        Item expected = new Item(SULFURAS, 5, 25);
        assertEquals(expected, actual);
    }

    @Test
    void n3s2q1() {
        Item actual = runOnItem(SULFURAS, 10, 25);
        Item expected = new Item(SULFURAS, 10, 25);
        assertEquals(expected, actual);
    }

    @Test
    void n3s3q1() {
        Item actual = runOnItem(SULFURAS, 20, 25);
        Item expected = new Item(SULFURAS, 20, 25);
        assertEquals(expected, actual);
    }

    @Test
    void n3s0q2() {
        Item actual = runOnItem(SULFURAS, -1, 50);
        Item expected = new Item(SULFURAS, -1, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n3s1q2() {
        Item actual = runOnItem(SULFURAS, 5, 50);
        Item expected = new Item(SULFURAS, 5, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n3s2q2() {
        Item actual = runOnItem(SULFURAS, 10, 50);
        Item expected = new Item(SULFURAS, 10, 50);
        assertEquals(expected, actual);
    }

    @Test
    void n3s3q2() {
        Item actual = runOnItem(SULFURAS, 20, 50);
        Item expected = new Item(SULFURAS, 20, 50);
        assertEquals(expected, actual);
    }
    
    private Item runOnItem(String name, int sellIn, int quality) {
        Item item = new Item(name, sellIn, quality);
        GildedRose app = new GildedRose(new Item[]{item});
        app.updateQuality();
        return item;
    }
}
