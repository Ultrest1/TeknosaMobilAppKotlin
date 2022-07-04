package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.teknosa5.Esyalar
import com.example.teknosa5.TelefonlarAdapter
import com.example.teknosa5.databinding.FragmentAnaSayfaBinding
import com.example.teknosa5.EsyalarAdaptor


class AnaSayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim= FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager= StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val telefonlarListesi=ArrayList<Telefonlar>()
        val t5=Telefonlar(1,"iphone13","iPhone 13 128 GB Akıllı Telefon Mavi",22499)
        val t4=Telefonlar(2,"iphone13pro","APPLE iPhone 13 Pro Max 128 GB Akıllı Telefon Graphite",32999)
        val t3=Telefonlar(3,"galaxys22","SAMSUNG Galaxy S22 128GB Akıllı Telefon Phantom Black",14449)
        val t2=Telefonlar(4,"redminote10","XIAOMI Redmi Note 10 S 128 GB Akıllı Telefon Gri",5499)
        val t1=Telefonlar(5,"galaxya52","SAMSUNG Galaxy A52 128 GB Akıllı Telefon Mavi",6249)
        val t6=Telefonlar(6,"iphone11","APPLE iPhone 11 128GB Akıllı Telefon Siyah",14999)
        telefonlarListesi.add(t1)
        telefonlarListesi.add(t2)
        telefonlarListesi.add(t3)
        telefonlarListesi.add(t4)
        telefonlarListesi.add(t5)
        telefonlarListesi.add(t6)
        val adapter = TelefonlarAdapter(requireContext(),telefonlarListesi)
        tasarim.rv.adapter=adapter




        tasarim.rv2.layoutManager=StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)
        val EsyalarListesi=ArrayList<Esyalar>()
        val e1= Esyalar("tel1","     Telefon")
        val e2= Esyalar("tv1","Televizyon,Ses ve Görüntü Sistemleri")
        val e3= Esyalar("cam1","Beyaz Eşya ve Ankastre")
        val e4= Esyalar("foto1","Fotoğraf Makinasi ev Kamera")
        EsyalarListesi.add(e1)
        EsyalarListesi.add(e2)
        EsyalarListesi.add(e3)
        EsyalarListesi.add(e4)

        val adapter2= EsyalarAdaptor(requireContext(),EsyalarListesi)
        tasarim.rv2.adapter=adapter2











        return tasarim.root
    }

}