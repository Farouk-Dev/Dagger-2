package com.training.dagger

import dagger.Component

@Component
interface CoffeeComponent {
    fun getCoffee(): Coffee
}