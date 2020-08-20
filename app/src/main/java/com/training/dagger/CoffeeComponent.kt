package com.training.dagger

import dagger.Component

/*Connect the coffe module  with  the coffee component*/
@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)
}