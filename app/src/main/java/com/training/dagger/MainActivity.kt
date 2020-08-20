package com.training.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    // **************** field injection **************************
    @Inject
    lateinit var coffee: Coffee
    @Inject
    lateinit var coffee1: Coffee
    //***********************************************************
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // inject coffee object inside MainActivity
        (application as? MainApplication)?.component?.inject(this)
        println(coffee.getCoffeeCup() +"/ farm for coffee : ${coffee.farm}"+" /farm for coffee1 : ${coffee1.farm}"  )

    }
}
