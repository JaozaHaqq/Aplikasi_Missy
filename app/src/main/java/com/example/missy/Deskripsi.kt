package com.example.missy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.missy.Fragment.HomeFragment
import com.google.android.material.internal.ContextUtils.getActivity

class Deskripsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val tampil_from = intent.getStringExtra("from")
        val tampil_gambar1 = intent.getStringExtra("gambar1")
        val tampil_gambar2 = intent.getStringExtra("gambar2")
        val tampil_sumber = intent.getStringExtra("sumber")
        val tampil_judul = intent.getStringExtra("judul")
        val tampil_deskripsi = intent.getStringExtra("deskripsi")
        val tampil_foto = intent.getIntExtra("foto", 0)

        val artikelj = findViewById<TextView>(R.id.nama_mahasiswa)
        val artijelde = findViewById<TextView>(R.id.nim_mahasiswa)
        val sumber = findViewById<TextView>(R.id.sumber)
        val artikelgam1 = findViewById<TextView>(R.id.gambar1)
        val artikelgam2 = findViewById<TextView>(R.id.gambar2)
        val artikelfr = findViewById<TextView>(R.id.from)
        val artikelf = findViewById<ImageView>(R.id.imageView)

        artikelf.setImageResource(tampil_foto)
        artikelfr.text = tampil_from
        artikelgam1.text = tampil_gambar1
        artikelgam2.text = tampil_gambar2
        sumber.text = tampil_sumber
        artikelj.text = tampil_judul
        artijelde.text = tampil_deskripsi
    }
}
