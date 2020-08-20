package com.training.dagger

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/*Connect the coffe module  with  the coffee component*/
@Component(modules = [CoffeeModule::class])
interface CoffeeComponent {
    fun getCoffee(): Coffee
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): CoffeeComponent

        @BindsInstance  // inject the sugar dependency
        fun sugar(@Sugar sugar: Int): Builder

        @BindsInstance  // inject the milk dependency
        fun milk(@Named("milk") milk: Int): Builder

    }
}