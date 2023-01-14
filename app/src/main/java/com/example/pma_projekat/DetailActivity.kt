@file:Suppress("ConvertToStringTemplate")

package com.example.pma_projekat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text
import java.text.DecimalFormat

private val df2 = DecimalFormat("#.##")
private val logic = DetailActivityLogic()

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)



        val name: String = intent.getStringExtra("NAME").toString()
        val symbol:String = intent.getStringExtra("SYMBOL").toString()
        val price: Double = intent.getDoubleExtra("PRICE",69.69)
        val logo_url:String = intent.getStringExtra("LOGO_URL").toString()
        val change1h:String = intent.getStringExtra("CHANGE_1H").toString()
        val change24h:String = intent.getStringExtra("CHANGE_24H").toString()
        val change7d:String = intent.getStringExtra("CHANGE_7D").toString()
        val lastUpdated:String = intent.getStringExtra("LAST_UPDATED").toString()

        var nameTextView:TextView = findViewById(R.id.textViewDetailName)
        var symbolTextView:TextView = findViewById(R.id.textViewDetailSymbol)
        var priceTextView:TextView = findViewById(R.id.textViewDetailPrice)
        var logoImageView:ImageView = findViewById(R.id.imageViewDetailLogo)
        var change1hTextView:TextView = findViewById(R.id.textViewChange1h)
        var change24hTextView:TextView = findViewById(R.id.textViewChange24h)
        var change7dTextView:TextView = findViewById(R.id.textViewChange7d)
        var lastUpdatedTextView:TextView = findViewById(R.id.textViewLastUpdated)
        var change1hIndicator: ImageView = findViewById(R.id.changeIndicator1h)
        var change24Indicator: ImageView = findViewById(R.id.changeIndicator24h)
        var change7dIndicator: ImageView = findViewById(R.id.changeIndicator7d)

        nameTextView.text = name
        symbolTextView.text = symbol
        priceTextView.text = "$ " + df2.format(price)
        Picasso.get().load(logo_url.replace("128x128-dark-mode","512x512-dark-mode")).into(logoImageView)
        change1hTextView.text = logic.formatText("1h", change1h)
        change24hTextView.text = logic.formatText("24h", change24h)
        change7dTextView.text = logic.formatText("7d", change7d)
        lastUpdatedTextView.text = "Last updated: " + lastUpdated.replace("T"," ")

        setIndicator(change1hIndicator,change1h)
        setIndicator(change24Indicator,change24h)
        setIndicator(change7dIndicator,change7d)


    }

    private fun setIndicator(indicator:ImageView, change: String) {
        if(change[0] == '+') {
            indicator.setColorFilter(resources.getColor(R.color.digital_green))
            indicator.scaleY = 1f
        }
        else {
            indicator.setColorFilter(resources.getColor(R.color.digital_red))
            indicator.scaleY = -1f
        }
    }
}
