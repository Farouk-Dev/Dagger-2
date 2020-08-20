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
        // runtime dependency injection
        var component = DaggerCoffeeComponent.builder().sugar(2).milk(8).build()
        // inject coffee object inside MainActivity
        component.inject(this)
        println(coffee.getCoffeeCup())

    }
}
