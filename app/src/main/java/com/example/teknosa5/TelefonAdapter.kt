package com.example.teknosa5

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev4.Telefonlar
import com.example.teknosa5.databinding.CardTasarimBinding


class TelefonlarAdapter(var mContext: Context, var telefonlar:List<Telefonlar>)
    :RecyclerView.Adapter<TelefonlarAdapter.Deneme>() {

    inner class Deneme(tasarim1: CardTasarimBinding) : RecyclerView.ViewHolder(tasarim1.root){
        var tasarim: CardTasarimBinding
        init {
            this.tasarim=tasarim1
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Deneme {
        val layoutInflater=LayoutInflater.from(mContext)
        val tasarim=CardTasarimBinding.inflate(layoutInflater,parent,false)
        return Deneme(tasarim)
    }

    override fun onBindViewHolder(holder: Deneme, position: Int) {

        val telefon=telefonlar.get(position)
        val t=holder.tasarim
        t.telefonResim.setImageResource(mContext.resources.getIdentifier(telefon.Telefonad,"drawable",mContext.packageName))
        t.telefonModel.text=telefon.Telefonİsmi
        t.textViewFiyat.text="${telefon.TelefonFiyat}"
    }

    override fun getItemCount(): Int {
       return telefonlar.size
    }


}