package dagger.module

import dagger.Module
import dagger.Provides

@Module
class TestModule {
    @Provides
    public fun providesString() : String {
        return "String"
    }
}