package com.example.pma_projekat
import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import java.text.DecimalFormat
import java.text.FieldPosition

class CurrencyRVAdapter(currencyRVModelArrayList: ArrayList<CurrencyRVModel>, context: Context) : RecyclerView.Adapter<CurrencyRVAdapter.ViewHolder>(){

    private var currencyRVModelArrayList: ArrayList<CurrencyRVModel>
    private var context: Context
    private val df2 = DecimalFormat("#.##")

    init {
        this.currencyRVModelArrayList = currencyRVModelArrayList
        this.context = context
    }

    public fun filterList(filteredList: ArrayList<CurrencyRVModel>){
        currencyRVModelArrayList = filteredList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): CurrencyRVAdapter.ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.currency_rv_item,parent,false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(holder: CurrencyRVAdapter.ViewHolder, position: Int) {
        var currencyRVModel:CurrencyRVModel = currencyRVModelArrayList[position]
        holder.currencyNameTV.text = currencyRVModel.name
        holder.symbolTV.text = currencyRVModel.symbol
        holder.rateTV.text = "$ " + df2.format(currencyRVModel.price)
        holder.idTV.text = currencyRVModel.idCurrency.toString()
        Picasso.get().load(currencyRVModel.logoURL).into(holder.currencyLogo)
    }
    override fun getItemCount(): Int {
        return currencyRVModelArrayList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var currencyNameTV: TextView
        var symbolTV: TextView
        var rateTV: TextView
        var idTV: TextView
        var currencyLogo: ImageView

        init {
            currencyNameTV = itemView.findViewById(R.id.idTVCurrencyName)
            symbolTV = itemView.findViewById(R.id.idTVSymbol)
            rateTV = itemView.findViewById(R.id.idTVCurrencyRate)
            idTV = itemView.findViewById(R.id.currencyID)
            currencyLogo = itemView.findViewById(R.id.currencyLogo)
        }
    }
}