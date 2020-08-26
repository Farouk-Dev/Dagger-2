package com.training.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RiverModule::class])
interface AppComponent {
    fun getCoffeeComponentBuilder():CoffeeComponent.Builder
}