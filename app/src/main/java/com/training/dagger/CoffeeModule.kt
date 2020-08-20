package com.training.dagger

import dagger.Module
import dagger.Provides

/*this  is our coffee module, it's will provide a River instance
 to the  coffee component in purpose to create the coffee object*/
@Module
class CoffeeModule {
    @Provides
    fun provideRiver(): River = River()
}