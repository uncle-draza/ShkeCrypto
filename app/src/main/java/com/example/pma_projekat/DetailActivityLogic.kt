package com.example.pma_projekat

class DetailActivityLogic {
    fun formatText(time:String, changeAmount:String):String {
        if(time == "1h" || time == "7d")
        {
            return "Change " + time + ":     " + changeAmount
        }
        else
            return "Change " + time + ":  " + changeAmount
    }
}