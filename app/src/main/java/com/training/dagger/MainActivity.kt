package com.training.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    // **************** field injection **************************
    @Inject
    lateinit var coffee: Coffee

    //***********************************************************
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // inject coffee object inside MainActivity
        DaggerCoffeeComponent.create().inject(this)
        println(coffee.getCoffeeCup())

    }
}
