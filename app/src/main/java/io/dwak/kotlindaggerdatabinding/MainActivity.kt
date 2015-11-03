package io.dwak.kotlindaggerdatabinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.dwak.kotlindaggerdatabinding.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.helloWorld.text = "Hello!"
    }
}
