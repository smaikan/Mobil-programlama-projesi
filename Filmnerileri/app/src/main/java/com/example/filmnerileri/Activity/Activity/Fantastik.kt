package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.AksiyonAdapter
import com.example.filmnerileri.Activity.Adapter.BelgeselAdapter
import com.example.filmnerileri.Activity.Adapter.BilimKurguAdapter
import com.example.filmnerileri.Activity.Adapter.FantastikAdapter
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Model.AksiyonModel
import com.example.filmnerileri.Activity.Model.BelgeselModel
import com.example.filmnerileri.Activity.Model.BilimKurguModel
import com.example.filmnerileri.Activity.Model.FantastikModel

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R

class Fantastik : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: FantastikAdapter
    private lateinit var arrayfilm: ArrayList<FantastikModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korku)

        reckorku = findViewById(R.id.reckorku)
        arrayfilm = ArrayList()
        adapter = FantastikAdapter()


        arrayfilm.add(FantastikModel("Üç Bin Yıllık Bekleyiş ", R.drawable.ucbinyillikbekleyis))
        arrayfilm.add(FantastikModel("Venom : Zehirli Öfke", R.drawable.venomzehirliofke))
        arrayfilm.add(
            FantastikModel(
                "Mortal Kombat ",
                R.drawable.mortalkombat
            )
        )
        arrayfilm.add(FantastikModel("Aquaman ", R.drawable.aquaman))
        arrayfilm.add(FantastikModel("Aslan Kral", R.drawable.aslankral))
        arrayfilm.add(FantastikModel("Avengers : Endgame", R.drawable.avengersendgame))
        arrayfilm.add(FantastikModel("Çocuk Kral", R.drawable.cocukkral))
        arrayfilm.add(FantastikModel("Doctor Strange Multiverse Madness", R.drawable.dcstrangemultiverse))
        arrayfilm.add(FantastikModel("Her şey Aynı Anda  ", R.drawable.herseybiranda))
        arrayfilm.add(FantastikModel("Fantastik Canavarlar :Dumbledorun Sırrı ", R.drawable.fantastikcanavarlar))
        arrayfilm.add(FantastikModel("İyilik ve Kötülük Okulu", R.drawable.iyilikvekotulukokulu))
        arrayfilm.add(FantastikModel("Spiderman : No Way Home ", R.drawable.spidermannowayhome))
        arrayfilm.add(FantastikModel("Thor : Love and Thunder", R.drawable.thorlovethunder))



        adapter.setData(arrayfilm)


        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
