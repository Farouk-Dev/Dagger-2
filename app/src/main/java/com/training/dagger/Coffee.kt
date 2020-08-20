package com.training.dagger

import javax.inject.Inject

class Coffee @Inject constructor(val river: River,val sugar:Int) {
    // **************** field injection **************************
    @Inject
    lateinit var farm: Farm
    //***********************************************************

    init {
        println("your coffe is ready ...")
    }

    // ****************  method injection **********************
    @Inject
    fun connectElectricity() {
        println("Electricity : connecting ...")
    }
    //***********************************************************

    fun getCoffeeCup(): String = farm.getBeans() + "+" + river.getWater()+"+ sugar :"+ sugar
}