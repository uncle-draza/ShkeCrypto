package com.example.pma_projekat
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.text.DecimalFormat

class CurrencyRVAdapter(currencyRVModelArrayList: ArrayList<CurrencyRVModel>, context: Context, recyclerViewInterface: RecyclerViewInterface) : RecyclerView.Adapter<CurrencyRVAdapter.ViewHolder>(){

    private var currencyRVModelArrayList: ArrayList<CurrencyRVModel>
    private var context: Context
    private val df2 = DecimalFormat("#.##")
    private val recyclerViewInterface: RecyclerViewInterface


    init {
        this.currencyRVModelArrayList = currencyRVModelArrayList
        this.context = context
        this.recyclerViewInterface = recyclerViewInterface
    }

    public fun filterList(filteredList: ArrayList<CurrencyRVModel>){
        currencyRVModelArrayList = filteredList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int): CurrencyRVAdapter.ViewHolder{
        val v = LayoutInflater.from(parent.context).inflate(R.layout.currency_rv_item,parent,false)
        return ViewHolder(v, recyclerViewInterface)
    }
    override fun onBindViewHolder(holder: CurrencyRVAdapter.ViewHolder, position: Int) {
        var currencyRVModel:CurrencyRVModel = currencyRVModelArrayList[position]
        holder.currencyNameTV.text = currencyRVModel.name
        holder.symbolTV.text = currencyRVModel.symbol
        holder.rateTV.text = "$ " + df2.format(currencyRVModel.price)
        holder.idTV.text = currencyRVModel.idCurrency.toString()
        Picasso.get().load(currencyRVModel.logoURL).into(holder.currencyLogo)
        holder.change1hTV.text = currencyRVModel.change1h

        if(currencyRVModel.change1hNum <0){
            holder.changeIndicator.scaleY = -1f
            holder.changeIndicator.setColorFilter(context.resources.getColor(R.color.digital_red))
            holder.change1hTV.setTextColor(Color.parseColor("#e44b4a"))
        }
        else{
            holder.changeIndicator.setColorFilter(context.resources.getColor(R.color.digital_green))
            holder.change1hTV.setTextColor(Color.parseColor("#43d75e"))
            holder.changeIndicator.scaleY = 1f
        }


    }
    override fun getItemCount(): Int {
        return currencyRVModelArrayList.size
    }

    inner class ViewHolder(itemView: View, recyclerViewInterface: RecyclerViewInterface): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var currencyNameTV: TextView
        var symbolTV: TextView
        var rateTV: TextView
        var idTV: TextView
        var currencyLogo: ImageView
        var change1hTV: TextView
        var changeIndicator: ImageView

        init {
            currencyNameTV = itemView.findViewById(R.id.idTVCurrencyName)
            symbolTV = itemView.findViewById(R.id.idTVSymbol)
            rateTV = itemView.findViewById(R.id.idTVCurrencyRate)
            idTV = itemView.findViewById(R.id.currencyID)
            currencyLogo = itemView.findViewById(R.id.currencyLogo)
            change1hTV = itemView.findViewById(R.id.currencyChangePercentage)
            changeIndicator = itemView.findViewById(R.id.changeIndicator)
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            if (recyclerViewInterface != null) {
                var pos: Int = adapterPosition
                if(pos != RecyclerView.NO_POSITION){
                    recyclerViewInterface.onItemClick(pos)
                }
            }


        }
    }
}