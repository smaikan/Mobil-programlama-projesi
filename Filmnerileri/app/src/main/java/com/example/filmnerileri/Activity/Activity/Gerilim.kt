package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R

class Gerilim : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: GerilimAdapter
    private lateinit var arrayfilm: ArrayList<GerilimModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerilim)

        reckorku = findViewById(R.id.recgerilim)
        arrayfilm = ArrayList()
        adapter = GerilimAdapter()


        arrayfilm.add(GerilimModel("Ben Efsaneyim ", R.drawable.benefsaneyim))
        arrayfilm.add(GerilimModel("Black Swan", R.drawable.blackswan))
        arrayfilm.add(GerilimModel("Kanlı Elmas ", R.drawable.kanlielmas))
        arrayfilm.add(GerilimModel("Kelebek Etkisi  ", R.drawable.kelebeketkisi))
        arrayfilm.add(GerilimModel("Kuzuların Sessizliği", R.drawable.kuzularinsessizligi))
        arrayfilm.add(GerilimModel("Memento", R.drawable.memento))
        arrayfilm.add(GerilimModel("Taken", R.drawable.taken))
        arrayfilm.add(GerilimModel("V For Vendetta", R.drawable.vforvendetta))
        arrayfilm.add(GerilimModel("Yedi ", R.drawable.yedi))
        arrayfilm.add(GerilimModel("Zindan Adası ", R.drawable.zindanadasi))
        arrayfilm.add(GerilimModel("Şeytanın Avukatı", R.drawable.seytaninavukati))
        arrayfilm.add(GerilimModel("Av Mevsimi", R.drawable.avmevsimi))
        arrayfilm.add(GerilimModel("Ghajini", R.drawable.ghajini))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
