package com.example.imtryingdawg

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("exos/long/double/{n}")
    fun truc(@Path("n") nombre: Int): Call<Int>
}