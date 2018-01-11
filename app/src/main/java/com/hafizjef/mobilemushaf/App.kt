package com.hafizjef.mobilemushaf

import android.app.Application

class App : Application() {
    // App init
    override fun onCreate() {
        super.onCreate()
        println("YOLO")
    }
}