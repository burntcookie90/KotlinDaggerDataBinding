package io.dwak.kotlindaggerdatabinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.dwak.kotlindaggerdatabinding.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil
import android.util.Log
import dagger.component.DaggerTestComponent
import dagger.module.TestModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var testInjectionString : String
        @Inject set

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.helloWorld.text = "Hello!"
        DaggerTestComponent.builder().testModule(TestModule()).build().inject(this)
        Log.d("MainActivity", testInjectionString)
    }
}
