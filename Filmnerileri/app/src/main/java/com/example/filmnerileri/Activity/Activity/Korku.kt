package com.example.filmnerileri.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Adapter.KorkuAdapter
import com.example.filmnerileri.Activity.Model.KorkuModel
import com.example.filmnerileri.R

class Korku : AppCompatActivity() {

    private lateinit var reckorku: RecyclerView
    private lateinit var adapter: KorkuAdapter
    private lateinit var arrayfilm: ArrayList<KorkuModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_korku)

        reckorku = findViewById(R.id.reckorku)
        arrayfilm = ArrayList()
        adapter = KorkuAdapter()

        // Korku filmleri için örnek verileri oluştur
        arrayfilm.add(KorkuModel("Ammar ", R.drawable.ammar))
        arrayfilm.add(KorkuModel("Baskın", R.drawable.baskin))
        arrayfilm.add(KorkuModel("Bird Box", R.drawable.birdbox))
        arrayfilm.add(KorkuModel("Çığlık 5 ", R.drawable.ciglik5))
        arrayfilm.add(KorkuModel("Dabbe", R.drawable.dabbe))
        arrayfilm.add(KorkuModel("Dehşetin Yüzü", R.drawable.dehsetinyuzu))
        arrayfilm.add(KorkuModel("Ölümcül Labirent", R.drawable.olumcullabirent))
        arrayfilm.add(KorkuModel("The Platform", R.drawable.platform))
        arrayfilm.add(KorkuModel("Separation", R.drawable.separation))
        arrayfilm.add(KorkuModel("Derin Sular", R.drawable.derinsular))
        arrayfilm.add(KorkuModel("Mihrez 2 :Cin Padişahı", R.drawable.mihrez2))
        arrayfilm.add(KorkuModel("Ölümcül Deney", R.drawable.olumculdeney))
        arrayfilm.add(KorkuModel("Ayin", R.drawable.ayin))


        // Adapter'a verileri ata
        adapter.setData(arrayfilm)

        // RecyclerView'a adapterı ve düzenleyiciyi ayarla
        reckorku.adapter = adapter
        reckorku.layoutManager = LinearLayoutManager(this)
    }
}
