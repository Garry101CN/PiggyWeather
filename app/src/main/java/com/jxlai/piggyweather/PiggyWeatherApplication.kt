package com.jxlai.piggyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class PiggyWeatherApplication:Application() {

    companion object {
        const val TOKEN = "Token Place Holder"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}