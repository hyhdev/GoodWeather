package com.goodweather.android

import android.app.Application
import android.content.Context

class GoodWeatherApplication : Application() {

    companion object {
        const val TOKEN = "oiPJL4Bywiu9o2qJ"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = getApplicationContext()
    }

}