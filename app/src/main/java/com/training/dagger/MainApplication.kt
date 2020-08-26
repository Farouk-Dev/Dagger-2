package com.training.dagger

import android.app.Application

class MainApplication : Application() {
    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        // we use  a single component inside  this  app "general scope"
        appComponent = DaggerAppComponent.create()
    }
}