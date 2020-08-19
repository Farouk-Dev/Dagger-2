package com.training.dagger

import javax.inject.Inject

class Coffee @Inject constructor(val river: River, val farm: Farm) {
    init {
        println("your coffe is ready ...")
    }
}