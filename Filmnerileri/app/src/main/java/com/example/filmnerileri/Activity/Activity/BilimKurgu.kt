package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.AksiyonAdapter
import com.example.filmnerileri.Activity.Adapter.BilimKurguAdapter
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Model.AksiyonModel
import com.example.filmnerileri.Activity.Model.BilimKurguModel

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R

class BilimKurgu : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: BilimKurguAdapter
    private lateinit var arrayfilm: ArrayList<BilimKurguModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korku)

        reckorku = findViewById(R.id.reckorku)
        arrayfilm = ArrayList()
        adapter = BilimKurguAdapter()


        arrayfilm.add(BilimKurguModel("InterStellar ", R.drawable.interstellar))
        arrayfilm.add(BilimKurguModel("İstila Altında", R.drawable.istilaaltinda))
        arrayfilm.add(BilimKurguModel("Morgan ", R.drawable.morgan))
        arrayfilm.add(BilimKurguModel("Dejavu  ", R.drawable.dejavu))
        arrayfilm.add(BilimKurguModel("OXYGEN", R.drawable.oxygen))
        arrayfilm.add(BilimKurguModel("Prometheus", R.drawable.prometheus))
        arrayfilm.add(BilimKurguModel("The Tomorrow", R.drawable.thetomorrow))
        arrayfilm.add(BilimKurguModel("Yedinci Hayat", R.drawable.yedincihayat))
        arrayfilm.add(BilimKurguModel("Yok Oluş ", R.drawable.yokolus))
        arrayfilm.add(BilimKurguModel("John Carter : İki Dünya Arasında ", R.drawable.johncarterikidunyarasinda))
        arrayfilm.add(BilimKurguModel("Zamana Karşı", R.drawable.zamanakarsi))
        arrayfilm.add(BilimKurguModel("Blader Runner ", R.drawable.bladerunner))
        arrayfilm.add(BilimKurguModel("Elysium", R.drawable.elysium))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
