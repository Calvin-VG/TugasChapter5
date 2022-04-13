package com.example.tugaschapter5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaschapter5.adapter.AdapterFilm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tugas1.setOnClickListener {
            startActivity(Intent(this, FilmActivity::class.java))
        }
    }
}