package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Adapter.KomediAdapter

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.Activity.Model.KomediModel
import com.example.filmnerileri.R

class Komedi : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: KomediAdapter
    private lateinit var arrayfilm: ArrayList<KomediModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerilim)

        reckorku = findViewById(R.id.recgerilim)
        arrayfilm = ArrayList()
        adapter = KomediAdapter()


        arrayfilm.add(KomediModel("BayWatch ", R.drawable.baywatch))
        arrayfilm.add(KomediModel("Bitirim İkili", R.drawable.bitirimikili))
        arrayfilm.add(KomediModel("Hayvan Dedektifi ", R.drawable.hayvandedektifi))
        arrayfilm.add(KomediModel("Johny English'in Dönüşü  ", R.drawable.johhnyenglishindonusu))
        arrayfilm.add(KomediModel("Jumanji ", R.drawable.jumanhi))
        arrayfilm.add(KomediModel("Kolonya Cumhuriyeti", R.drawable.kolonyacumhuriyeti))
        arrayfilm.add(KomediModel("Komşum Bir Ajan", R.drawable.komsumbirajan))
        arrayfilm.add(KomediModel("Recep İvedik 6", R.drawable.recepivedik6))
        arrayfilm.add(KomediModel("The Mask ", R.drawable.themask))
        arrayfilm.add(KomediModel("Zor Biraderler ", R.drawable.zorbiraderler))
        arrayfilm.add(KomediModel("Yol Arkadaşım", R.drawable.yolarkadasim))
        arrayfilm.add(KomediModel("Chips", R.drawable.chips))
        arrayfilm.add(KomediModel("Coco", R.drawable.coco))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
