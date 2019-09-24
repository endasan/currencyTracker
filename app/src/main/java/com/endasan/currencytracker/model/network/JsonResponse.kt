package com.endasan.currencytracker.model.network

import com.endasan.currencytracker.model.data.Currency
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class JsonResponse(
    @SerializedName("base")
    @Expose
    val base: String,
    @SerializedName("rates")
    @Expose
    val rates: List<Currency>)
