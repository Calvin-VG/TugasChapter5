package com.example.tugaschapter5.network

import com.example.tugaschapter5.modelfilm.GetAllFilmResponItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("film")
    fun getAllDataFilm() : Call<List<GetAllFilmResponItem>>

}