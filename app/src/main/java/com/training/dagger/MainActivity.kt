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

    private  val appComponent : AppComponent? by lazy { (application as? MainApplication)?.appComponent }
    private  val component :CoffeeComponent by lazy { DaggerCoffeeComponent.builder().milk(2).sugar(3).appComponent(appComponent).build() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inject coffee object inside MainActivity
       component.inject(this)
        println("coffee :$coffee\n" + "coffee1 :$coffee1\n" + "farm for coffee : ${coffee.river}\n" + "farm for coffee1 : ${coffee1.river}")

    }
}
