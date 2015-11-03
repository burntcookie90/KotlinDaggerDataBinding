package dagger.component

import dagger.Component
import dagger.module.TestModule
import io.dwak.kotlindaggerdatabinding.MainActivity

@Component(modules = arrayOf(TestModule::class))
public interface TestComponent {
    public fun inject(activity : MainActivity)
}