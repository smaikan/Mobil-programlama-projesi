package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.AksiyonAdapter
import com.example.filmnerileri.Activity.Adapter.BilimKurguAdapter
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Adapter.MaceraAdapter
import com.example.filmnerileri.Activity.Model.AksiyonModel
import com.example.filmnerileri.Activity.Model.BilimKurguModel

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.Activity.Model.MaceraModel
import com.example.filmnerileri.R

class Macera : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: MaceraAdapter
    private lateinit var arrayfilm: ArrayList<MaceraModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korku)

        reckorku = findViewById(R.id.reckorku)
        arrayfilm = ArrayList()
        adapter = MaceraAdapter()


        arrayfilm.add(MaceraModel("A.X.L ", R.drawable.axl))
        arrayfilm.add(MaceraModel("Black Panther: Yaşasın Wakanda", R.drawable.blackpanther))
        arrayfilm.add(MaceraModel("Bumblebee ", R.drawable.bumblebee))
        arrayfilm.add(MaceraModel("City Of Ember  ", R.drawable.cityofember))
        arrayfilm.add(MaceraModel("DeadPool 2", R.drawable.deadpool))
        arrayfilm.add(MaceraModel("Gerçek Kahraman", R.drawable.gercekkahraman))
        arrayfilm.add(MaceraModel("Jungle Cruise", R.drawable.junglecruise))
        arrayfilm.add(MaceraModel("Meg : Derinlerdeki Dehşet", R.drawable.meg))
        arrayfilm.add(MaceraModel("Moonfall ", R.drawable.moonfal))
        arrayfilm.add(MaceraModel("The Batman ", R.drawable.thebatman))
        arrayfilm.add(MaceraModel("Transformers 5 ", R.drawable.transformers))
        arrayfilm.add(MaceraModel("Tomb Raider ", R.drawable.tombraider))
        arrayfilm.add(MaceraModel("Zathura", R.drawable.zathura))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
