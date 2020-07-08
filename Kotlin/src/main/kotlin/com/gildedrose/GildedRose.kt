package com.gildedrose

import kotlin.math.*

class GildedRose(var items: Array<Item>) {


    fun updateQualityNormal(item: Item) {
        item.sellIn = item.sellIn - 1
        val deltaQuality = if (item.sellIn < 0) -2 else -1
        item.quality = max(min(50,item.quality + deltaQuality),0)
    }
    }

    fun updateQualityAgedBrie(item: Item) {
        item.sellIn = item.sellIn - 1
        item.quality = max(min(50,item.quality + 1),0)
    }

    fun updateQualityLegendary(item: Item) {
        item.sellIn = item.sellIn - 1
        item.quality = max(min(50,item.quality),0)
    }

    fun updateQualityBackstagePass(item: Item) {
        item.sellIn = item.sellIn - 1
        item.quality = max(min(50,item.quality),0)
    }

fun updateQuality() {
        for (item in items) {
            when {
                item.name == "Aged Brie" -> updateQualityAgedBrie(item)
                else -> updateQualityNormal(item)
            }
        }
    }

}


//            if (item.name != "Aged Brie" && item.name != "Backstage passes to a TAFKAL80ETC concert") {
//                if (item.quality > 0) {
//                    if (item.name != "Sulfuras, Hand of Ragnaros") {
//                        item.quality = item.quality - 1
//                    }
//                }
//            } else {
//                if (item.quality < 50) {
//                    item.quality = item.quality + 1
//
//                    if (item.name == "Backstage passes to a TAFKAL80ETC concert") {
//                        if (item.sellIn < 11) {
//                            if (item.quality < 50) {
//                                item.quality = item.quality + 1
//                            }
//                        }
//
//                        if (item.sellIn < 6) {
//                            if (item.quality < 50) {
//                                item.quality = item.quality + 1
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (item.name != "Sulfuras, Hand of Ragnaros") {
//                item.sellIn = item.sellIn - 1
//            }
//
//            if (item.sellIn < 0) {
//                if (item.name != "Aged Brie") {
//                    if (item.name != "Backstage passes to a TAFKAL80ETC concert") {
//                        if (item.quality > 0) {
//                            if (item.name != "Sulfuras, Hand of Ragnaros") {
//                                item.quality = item.quality - 1
//                            }
//                        }
//                    } else {
//                        item.quality = item.quality - item.quality
//                    }
//                } else {
//                    if (item.quality < 50) {
//                        item.quality = item.quality + 1
//                    }
//                }
//            }
//        }
//    }

}

