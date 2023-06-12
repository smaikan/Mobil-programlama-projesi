package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.AksiyonAdapter
import com.example.filmnerileri.Activity.Adapter.GerilimAdapter
import com.example.filmnerileri.Activity.Model.AksiyonModel

import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R

class Aksiyon : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: AksiyonAdapter
    private lateinit var arrayfilm: ArrayList<AksiyonModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aksiyon)

        reckorku = findViewById(R.id.reckorku)
        arrayfilm = ArrayList()
        adapter = AksiyonAdapter()


        arrayfilm.add(AksiyonModel("Avatar Suyun Yolu ", R.drawable.avatarsuyunyolu))
        arrayfilm.add(AksiyonModel("Black Adam", R.drawable.blackadam))
        arrayfilm.add(AksiyonModel("Black Widow ", R.drawable.blackwidow))
        arrayfilm.add(AksiyonModel("Eternals  ", R.drawable.eternals))
        arrayfilm.add(AksiyonModel("Extraction", R.drawable.extraction))
        arrayfilm.add(AksiyonModel("Jurrasic World", R.drawable.jurassicworld))
        arrayfilm.add(AksiyonModel("Morbius", R.drawable.morbius))
        arrayfilm.add(AksiyonModel("Shang-Chi", R.drawable.shangchi))
        arrayfilm.add(AksiyonModel("Suikast Treni ", R.drawable.suikasttreni))
        arrayfilm.add(AksiyonModel("Top Gun : Mawerick ", R.drawable.topgunmawerick))
        arrayfilm.add(AksiyonModel("Uncharted", R.drawable.uncharted))
        arrayfilm.add(AksiyonModel("Hızlı ve Öfkeli 9 ", R.drawable.fast9))
        arrayfilm.add(AksiyonModel("John Wick", R.drawable.johnwick3))



        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
