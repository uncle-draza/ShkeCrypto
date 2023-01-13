package com.example.pma_projekat

import android.graphics.drawable.Drawable
import android.media.Image

class CurrencyRVModel (var name:String,
                       var symbol:String,
                       var price: Double,
                       var idCurrency:Int,
                       var logoURL: String,
                       var change1h: String,
                       var change1hNum: Double,
                       var change24h:String,
                       var change24hNum:Double,
                       var change7d:String,
                       var change7dNum:Double,
                       var lastUpdated:String){
}