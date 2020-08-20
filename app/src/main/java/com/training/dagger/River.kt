package com.training.dagger

import javax.inject.Inject

/* we consider that this is a read only class
* we can't add @Inject annotation
* in this cas  we will use  the @Module annotation */
class River {
    init {
        println("River is created ...")
    }

    fun getWater(): String = "water"
}