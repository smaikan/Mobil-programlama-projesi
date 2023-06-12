package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.DramAdapter
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Model.DramModel

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R

class Dram : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: DramAdapter
    private lateinit var arrayfilm: ArrayList<DramModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerilim)

        reckorku = findViewById(R.id.recgerilim)
        arrayfilm = ArrayList()
        adapter = DramAdapter()


        arrayfilm.add(DramModel("After : Paramparça ", R.drawable.afterparamparca))
        arrayfilm.add(DramModel("Asfaltın Kralları ", R.drawable.asfaltinkrallari))
        arrayfilm.add(DramModel("Balina ", R.drawable.balina))
        arrayfilm.add(DramModel("Derin Tutkular  ", R.drawable.derintutkular))
        arrayfilm.add(DramModel("Kadın Kral", R.drawable.kadinkral))
        arrayfilm.add(DramModel("Kurak Günler", R.drawable.kurakgunler))
        arrayfilm.add(DramModel("Luther : Batan Güneş", R.drawable.lutherbatangunes))
        arrayfilm.add(DramModel("Parazit", R.drawable.parasite))
        arrayfilm.add(DramModel("Rüzgarı Dizginleyen Çocuk ", R.drawable.ruzgaridizginleyencocuk))
        arrayfilm.add(DramModel("365 Gün ", R.drawable.ucyuzaltmisbesgun))
        arrayfilm.add(DramModel("Ufo", R.drawable.ufo))
        arrayfilm.add(DramModel("Yirminci Yüzyıl Kızı", R.drawable.yirminciyuzyil))
        arrayfilm.add(DramModel("Batı Cephesi", R.drawable.baticehpesi))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
