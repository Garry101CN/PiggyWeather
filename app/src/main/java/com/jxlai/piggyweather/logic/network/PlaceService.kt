package com.jxlai.piggyweather.logic.network

import com.jxlai.piggyweather.PiggyWeatherApplication
import com.jxlai.piggyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${PiggyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}