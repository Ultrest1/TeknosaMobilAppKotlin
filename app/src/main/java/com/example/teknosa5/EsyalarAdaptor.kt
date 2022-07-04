package com.example.teknosa5

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.teknosa5.databinding.Rv2HorizontalBinding

class EsyalarAdaptor(var mContext: Context,var esyalarListesi:List<Esyalar>):RecyclerView.Adapter<EsyalarAdaptor.yenitutucu>() {
    inner class yenitutucu(tasarim:Rv2HorizontalBinding):RecyclerView.ViewHolder(tasarim.root){
        var tasarim: Rv2HorizontalBinding
        init {
            this.tasarim=tasarim//shadowing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): yenitutucu {

        val layoutInflater=LayoutInflater.from(mContext)
        val tasarim=Rv2HorizontalBinding.inflate(layoutInflater,parent,false)
        return yenitutucu(tasarim)
    }

    override fun onBindViewHolder(holder: yenitutucu, position: Int) {

        val esya=esyalarListesi.get(position)
        val t=holder.tasarim
        t.EsyaResmi.setImageResource(mContext.resources.getIdentifier(esya.EsyaResim,"drawable",mContext.packageName))

        t.EsyaBilgiAdi.text="${esya.EsyaBilgi}"



    }

    override fun getItemCount(): Int {
       return esyalarListesi.size
    }
}