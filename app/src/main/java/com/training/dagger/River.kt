package com.training.dagger

import javax.inject.Inject

class River @Inject constructor() {
    init {
        println("River is created ...")
    }
    fun getWater(): String = "water"
}