package com.gildedrose

import org.junit.Assert.*
import org.junit.Test

class GildedRoseTest {

    @Test
    fun foo() {
        val items = arrayOf<Item>(Item("foo", 0, 0))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("fixme", app.items[0].name)

    }

    /*
     quality degradation check
     */
    @Test
    fun qualityDegradationTest() {
        val items = arrayOf<Item>(Item("random", 1, 10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals(9, app.items[0].quality)
        app.updateQuality()
        assertEquals(7, app.items[0].quality)
    }

    @Test
    fun negativeQualityTest() {
        val items = arrayOf<Item>(Item("foo", 5, 5))
        val app = GildedRose(items)
        for (i in 1..10) {
            app.updateQuality()
        }
        assertEquals(0, app.items[0].quality)
    }

    @Test
    fun agedBrieTest() {
        val items = arrayOf<Item>(Item("Aged Brie", 1, 1))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals((app.items[0].quality > 1), true)
        val items a
    }

    @Test
    fun neverOver50()
    {
        val items = arrayOf<Item>(Item("Aged Brie",10,45),Item("foo",10,55))
        val app = GildedRose(items)
        for( i in 1..10)
        {
            app.updateQuality()
        }
        for(item in items)
            assertEquals((item.quality <= 50),true)
    }
    @Test
    fun legendaryItemTest()
    {
        val items = arrayOf<Item>(Item("Sulfuras, Hand of Ragnaros",10,10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals(app.items[0].quality,10)
        assertEquals(app.items[0].sellIn,10)
    }
    @Test
    fun ticketTest() {
        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 11, 10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals(app.items[0].quality, 11)
        var oldQuality = 11
        for (i in 10 downTo 6) {
            app.updateQuality()
            assertEquals(app.items[0].quality, oldQuality + 2)
            oldQuality = app.items[0].quality
        }
        for(i in 5 downTo 1)
        {
            app.updateQuality()
            assertEquals(app.items[0].quality,oldQuality+3)
            oldQuality = app.items[0].quality
        }
        app.updateQuality()
        assertEquals(app.items[0].quality,0)
    }
    @Test
    fun conjureTest()
    {
        val items = arrayOf<Item>(Item("Conjured item",1,10),Item("item",1,10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals(app.items[0].quality,8)
        assertEquals(app.items[1].quality,9)
        app.updateQuality()
        assertEquals(app.items[0].quality,4)
        assertEquals(app.items[1].quality,7)
    }
}


