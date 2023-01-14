package com.example.pma_projekat

import java.text.DecimalFormat

class MainActivityLogic
{
    private val df3 = DecimalFormat("#.###")
    fun formatChange(change: Double):String{
        if(change>0){
            return "+" + df3.format(change) + " %"
        }else{
            return df3.format(change) + " %"
        }
    }
}