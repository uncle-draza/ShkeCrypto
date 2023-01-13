package com.example.pma_projekat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name: String = intent.getStringExtra("NAME").toString()
        val symbol:String = intent.getStringExtra("SYMBOL").toString()

        var nameTextView:TextView = findViewById(R.id.textViewDetailName)
        var symbolTextView:TextView = findViewById(R.id.textViewDetailSymbol)

        nameTextView.text = name
        symbolTextView.text = symbol

    }
}