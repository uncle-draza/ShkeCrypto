package com.example.pma_projekat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var searchEdit: EditText
    private lateinit var currenciesRV: RecyclerView
    private lateinit var loadingPB: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchEdit = findViewById(R.id.idEditText)
        currenciesRV = findViewById(R.id.idRVCurrencies)
        loadingPB = findViewById(R.id.idPBLoading)

    }
}