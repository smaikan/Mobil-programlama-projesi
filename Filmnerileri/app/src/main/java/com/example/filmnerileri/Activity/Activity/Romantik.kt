package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Adapter.RomantikAdapter

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.Activity.Model.RomantikModel
import com.example.filmnerileri.R

class Romantik : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: RomantikAdapter
    private lateinit var arrayfilm: ArrayList<RomantikModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerilim)

        reckorku = findViewById(R.id.recgerilim)
        arrayfilm = ArrayList()
        adapter = RomantikAdapter()


        arrayfilm.add(RomantikModel("Aşk Sarhoşu ", R.drawable.asksarhosu))
        arrayfilm.add(RomantikModel("Aşk Ve Canavarlar", R.drawable.askvecanavarlar))
        arrayfilm.add(RomantikModel("Bay Ve Bayan Smith ", R.drawable.bayvebayansmith))
        arrayfilm.add(RomantikModel("Emily  ", R.drawable.emily))
        arrayfilm.add(RomantikModel("Five Feet Apart", R.drawable.fivefeetapart))
        arrayfilm.add(RomantikModel("Focus", R.drawable.focus))
        arrayfilm.add(RomantikModel("Güzel Ve Çirkin", R.drawable.guzelvecirkin))
        arrayfilm.add(RomantikModel("İtalya Tatili", R.drawable.italyatatili))
        arrayfilm.add(RomantikModel("Komşu Çocuk ", R.drawable.komsucocuk))
        arrayfilm.add(RomantikModel("Redeeming Love ", R.drawable.redeeminglove))
        arrayfilm.add(RomantikModel("Rich in Love", R.drawable.richinlove))
        arrayfilm.add(RomantikModel("Sonsuz Aşk", R.drawable.sonsuzask))
        arrayfilm.add(RomantikModel("Keşif", R.drawable.kesif))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
