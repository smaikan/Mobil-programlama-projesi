package com.example.filmnerileri.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.filmnerileri.Activity.Activity.Aksiyon
import com.example.filmnerileri.Activity.Activity.Belgesel
import com.example.filmnerileri.Activity.Activity.BilimKurgu
import com.example.filmnerileri.Activity.Activity.Dram
import com.example.filmnerileri.Activity.Activity.Fantastik
import com.example.filmnerileri.Activity.Activity.Gerilim
import com.example.filmnerileri.Activity.Activity.Komedi
import com.example.filmnerileri.Activity.Activity.Korku
import com.example.filmnerileri.Activity.Activity.Macera
import com.example.filmnerileri.Activity.Activity.Romantik
import com.example.filmnerileri.R

class MainActivity : AppCompatActivity() {
    lateinit var btnkorku: Button
    lateinit var btngerilim: Button
    lateinit var btnkomedi: Button
    lateinit var btnaksiyon: Button
    lateinit var btnbk: Button
    lateinit var btnbelgesel: Button
    lateinit var btnfantastik: Button
    lateinit var btndram: Button
    lateinit var btnromantik: Button
    lateinit var btnmacera: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnkorku = findViewById(R.id.btnkorku)
        btngerilim = findViewById(R.id.btngerilim)
        btnkomedi = findViewById(R.id.btnkomedi)
        btnaksiyon = findViewById(R.id.btnaksiyon)
        btnbk = findViewById(R.id.btnbilimkurgu)
        btnbelgesel = findViewById(R.id.btnbelgesel)
        btnfantastik = findViewById(R.id.btnfantastik)
        btndram = findViewById(R.id.btndram)
        btnromantik = findViewById(R.id.btnromantik)
        btnmacera = findViewById(R.id.btnmacera)

        btnkorku.setOnClickListener{
            val intent = Intent(this, Korku::class.java)
            startActivity(intent)
        }
        btnfantastik.setOnClickListener{
            val intent = Intent(this, Fantastik::class.java)
            startActivity(intent)
        }
        btngerilim.setOnClickListener{
            val intent = Intent(this, Gerilim::class.java)
            startActivity(intent)
        }
        btnkomedi.setOnClickListener{
            val intent = Intent(this, Komedi::class.java)
            startActivity(intent)
        }
        btnbk.setOnClickListener{
            val intent = Intent(this, BilimKurgu::class.java)
            startActivity(intent)
        }
        btnbelgesel.setOnClickListener{
            val intent = Intent(this, Belgesel::class.java)
            startActivity(intent)
        }
        btndram.setOnClickListener{
            val intent = Intent(this, Dram::class.java)
            startActivity(intent)
        }
        btnromantik.setOnClickListener{
            val intent = Intent(this, Romantik::class.java)
            startActivity(intent)
        }
        btnmacera.setOnClickListener{
            val intent = Intent(this, Macera::class.java)
            startActivity(intent)
        }
        btnaksiyon.setOnClickListener{
            val intent = Intent(this, Aksiyon::class.java)
            startActivity(intent)
        }


    }
}