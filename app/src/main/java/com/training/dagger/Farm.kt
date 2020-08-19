package com.training.dagger

import javax.inject.Inject

class Farm @Inject constructor() {
    init {
        println("Farm is created ...")
    }
    fun getBeans(): String = "beans"
}