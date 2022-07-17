package com.yadi.aplikasimovie

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {


    @GET("/3/movie/popular?api_key=bc07b3cd69986315111b292e8b039a09")
    fun getMovieList(): Call<MovieResponse>
}