package com.training.dagger

import javax.inject.Inject
import javax.inject.Singleton

@MainActivityScope
class Farm @Inject constructor() {
    init {
        println("Farm is created ...")
    }
    fun getBeans(): String = "beans"
}