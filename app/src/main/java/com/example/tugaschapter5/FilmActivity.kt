package com.example.tugaschapter5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tugaschapter5.adapter.AdapterFilm
import com.example.tugaschapter5.modelfilm.GetAllFilmResponItem
import com.example.tugaschapter5.network.ApiClient
import kotlinx.android.synthetic.main.activity_film.*
import retrofit2.Call
import retrofit2.Response

class FilmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film)

        getDataFilm()
    }

    fun getDataFilm(){

        ApiClient.instance.getAllDataFilm()
            .enqueue(object : retrofit2.Callback<List<GetAllFilmResponItem>>{
                override fun onResponse(
                    call: Call<List<GetAllFilmResponItem>>,
                    response: Response<List<GetAllFilmResponItem>>
                ) {
                    if (response.isSuccessful){
                        val dataFilm = response.body()
                        val adapterFilm = AdapterFilm(dataFilm!!)
                        val llm = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
                        rv_film.layoutManager = llm
                        rv_film.adapter = adapterFilm
                    }else{
                        Toast.makeText(this@FilmActivity, response.message(), Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<List<GetAllFilmResponItem>>, t: Throwable) {
                    Toast.makeText(this@FilmActivity, t.message, Toast.LENGTH_LONG).show()
                }
            })

    }
}