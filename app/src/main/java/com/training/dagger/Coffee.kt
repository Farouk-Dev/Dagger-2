package com.training.dagger

import javax.inject.Inject
import javax.inject.Named

class Coffee @Inject constructor(
    val river: River,
    @Sugar val sugar: Int,
    @Named("milk") val milk: Int
) {
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

    fun getCoffeeCup(): String =
        farm.getBeans() + "+" + river.getWater() + "+ sugar :" + sugar + "+ milk :" + milk
}