package com.training.dagger

import android.app.Application

class MainApplication : Application() {
    lateinit var component: CoffeeComponent
    override fun onCreate() {
        super.onCreate()
        // we use  a single component inside  this  app "general scope"
        component = DaggerCoffeeComponent.builder().sugar(2).milk(8).build()
    }
}