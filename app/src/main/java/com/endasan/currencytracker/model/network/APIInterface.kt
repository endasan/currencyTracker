package com.endasan.currencytracker.model.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {

    @GET("/latest")
    fun getCurrenciesList(@Query("base") base: String): Call<JsonResponse>
}