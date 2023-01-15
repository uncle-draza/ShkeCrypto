package com.example.pma_projekat

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.textclassifier.ConversationActions.Request
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(), RecyclerViewInterface {

    private lateinit var searchEdit: EditText
    private lateinit var currenciesRV: RecyclerView
    private lateinit var loadingPB: ProgressBar
    
    lateinit var currencyRVModelArrayList: ArrayList<CurrencyRVModel>
    private lateinit var currencyRVAdapter: CurrencyRVAdapter
    private val logic = MainActivityLogic()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchEdit = findViewById(R.id.idEditText)
        currenciesRV = findViewById(R.id.idRVCurrencies)
        loadingPB = findViewById(R.id.idPBLoading)

        
        currencyRVModelArrayList = arrayListOf<CurrencyRVModel>()
        currencyRVAdapter = CurrencyRVAdapter(currencyRVModelArrayList,this, this)
        currenciesRV.layoutManager = LinearLayoutManager(this)
        currenciesRV.adapter = currencyRVAdapter

        getCurrencyData()

        searchEdit.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                filterCurrencies(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
    }

    fun filterCurrencies(currency: String){
        var filteredList = ArrayList<CurrencyRVModel>()
        for(item in currencyRVModelArrayList){
            if(item.name.lowercase().contains(currency.lowercase())){
                filteredList.add(item)
            }
        }
        if(filteredList.isEmpty()){
            //Toast.makeText(this,"Currency not found!", Toast.LENGTH_SHORT).show()
        }else{
            currencyRVAdapter.filterList(filteredList)
        }
    }
    
    fun getCurrencyData(){

        loadingPB.visibility = View.VISIBLE
        val url: String = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest" 
        var requestQueue:RequestQueue = Volley.newRequestQueue(this)
        
        val jsonObjectRequest = object: JsonObjectRequest(
            com.android.volley.Request.Method.GET,url,null,
            Response.Listener{response ->
                loadingPB.visibility = View.GONE

                try {
                    var dataArray: JSONArray = response.getJSONArray("data")
                    for(i in 0..dataArray.length()){
                        var dataObj:JSONObject = dataArray.getJSONObject(i)
                        var name: String = dataObj.getString("name")
                        var symbol: String = dataObj.getString("symbol")
                        var id: Int = i + 1
                        var quote:JSONObject = dataObj.getJSONObject("quote")
                        var USD:JSONObject = quote.getJSONObject("USD")
                        var price:Double = USD.getDouble("price")
                        var urlDoSlike: String = "https://raw.githubusercontent.com/uncle-draza/crypto-logos/master/128x128-dark-mode/" + symbol  +".png"
                        var change1h: Double = USD.getDouble("percent_change_1h")
                        var change24h: Double = USD.getDouble("percent_change_24h")
                        var change7d: Double = USD.getDouble("percent_change_7d")
                        var lastUpdated: String = dataObj.getString("last_updated")

                        var change1hString:String = logic.formatChange(change1h)
                        var change24hString:String = logic.formatChange(change24h)
                        var change7dString:String = logic.formatChange(change7d)

                        currencyRVModelArrayList.add(CurrencyRVModel(name,symbol,price,id,urlDoSlike,change1hString,change1h,change24hString,change24h,change7dString,change7d,lastUpdated))
                    }
                    currencyRVAdapter.notifyDataSetChanged()
                }catch (e: JSONException){
                    e.printStackTrace()
                    //Toast.makeText(this, "Failed to extract JSON data", Toast.LENGTH_SHORT).show()
                }
            }, Response.ErrorListener{
                loadingPB.visibility = View.GONE
                Toast.makeText(this, "Failed to get the data from CoinMarketCapAPI", Toast.LENGTH_SHORT).show()
            }
        ) {
            override fun getHeaders(): MutableMap<String, String> {
                val headers = HashMap<String, String>()
                headers.put("X-CMC_PRO_API_KEY", "a18a9f22-5f95-4c7a-8ddd-c3f878609886")
                return headers
            }
        }

        requestQueue.add(jsonObjectRequest)

    }

    override fun onItemClick(position: Int) {
        val i = Intent(this, DetailActivity::class.java)
        i.putExtra("SYMBOL", currencyRVModelArrayList[position].symbol)
        i.putExtra("NAME", currencyRVModelArrayList[position].name)
        i.putExtra("PRICE", currencyRVModelArrayList[position].price)
        i.putExtra("LOGO_URL", currencyRVModelArrayList[position].logoURL)
        i.putExtra("CHANGE_1H", currencyRVModelArrayList[position].change1h)
        i.putExtra("CHANGE_24H", currencyRVModelArrayList[position].change24h)
        i.putExtra("CHANGE_7D", currencyRVModelArrayList[position].change7d)
        i.putExtra("LAST_UPDATED", currencyRVModelArrayList[position].lastUpdated)
        startActivity(i)

    }
}