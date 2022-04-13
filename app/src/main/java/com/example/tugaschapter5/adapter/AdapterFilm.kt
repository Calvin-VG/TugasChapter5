package com.example.tugaschapter5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugaschapter5.R
import com.example.tugaschapter5.modelfilm.GetAllFilmResponItem
import kotlinx.android.synthetic.main.item_adapater_film.view.*

class AdapterFilm(private var datafilm : List<GetAllFilmResponItem>) : RecyclerView.Adapter<AdapterFilm.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFilm.ViewHolder {
        val itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_adapater_film, parent, false)
        return ViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: AdapterFilm.ViewHolder, position: Int) {
        holder.itemView.tv_judul_film.text = datafilm[position].name
        holder.itemView.tv_tanggal_film.text = datafilm[position].date
        holder.itemView.tv_sutradara_film.text = datafilm[position].director
    }

    override fun getItemCount(): Int {
        return datafilm.size
    }
}