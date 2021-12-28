package com.example.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingadapter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        val details = UserDetails("Naveen","Sharma","https://m.media-amazon.com/images/M/MV5BNmIwMjRiMzgtYjM5NC00MTdlLWI2ZWMtNDQxOTAzZTJmNzMxXkEyXkFqcGdeQXVyNTM0NTU5Mg@@._V1_SX300.jpg")

        binding.userdetailsname= details

    }

}