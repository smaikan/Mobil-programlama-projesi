package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.AksiyonAdapter
import com.example.filmnerileri.Activity.Adapter.BelgeselAdapter
import com.example.filmnerileri.Activity.Adapter.BilimKurguAdapter
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Model.AksiyonModel
import com.example.filmnerileri.Activity.Model.BelgeselModel
import com.example.filmnerileri.Activity.Model.BilimKurguModel

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R

class Belgesel : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: BelgeselAdapter
    private lateinit var arrayfilm: ArrayList<BelgeselModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korku)

        reckorku = findViewById(R.id.reckorku)
        arrayfilm = ArrayList()
        adapter = BelgeselAdapter()


        arrayfilm.add(BelgeselModel("14 Zirve ", R.drawable.zirve))
        arrayfilm.add(BelgeselModel("2040", R.drawable.ikibin))
        arrayfilm.add(
            BelgeselModel(
                "Ahtapottan Öğrendiklerim ",
                R.drawable.ahtapottanogrendiklerim
            )
        )
        arrayfilm.add(BelgeselModel("Ayı Adam ", R.drawable.ayiadam))
        arrayfilm.add(BelgeselModel("Dr.Phill Stutz", R.drawable.drphillstutz))
        arrayfilm.add(BelgeselModel("Filler Aşkına", R.drawable.filleraskina))
        arrayfilm.add(BelgeselModel("Jennifer Lopez : Half Time", R.drawable.halftime))
        arrayfilm.add(BelgeselModel("Inside Job", R.drawable.insidejob))
        arrayfilm.add(BelgeselModel("More Than a Game ", R.drawable.morethanagame))
        arrayfilm.add(BelgeselModel("Ronaldo ", R.drawable.ronaldo))
        arrayfilm.add(BelgeselModel("Senna", R.drawable.senna))
        arrayfilm.add(BelgeselModel("Uygunsuz Gerçekler ", R.drawable.uygunsuzgercek))
        arrayfilm.add(BelgeselModel("The Eyes Of Tammy Faye", R.drawable.theeyesoftammyface))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
