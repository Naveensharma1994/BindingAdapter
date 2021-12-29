package com.example.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.example.bindingadapter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var userdetails = UserModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //mainmodel = ViewModelProvider(this).get(BindingAdapter::class.java)

        //  binding.editname.addTextChangedListener(textWatcher)

        binding.userdetailsname = userdetails

        userdetails.name = "Naveen"
        userdetails.lname = "Sharma"
        userdetails.url =
            "https://m.media-amazon.com/images/M/MV5BNmIwMjRiMzgtYjM5NC00MTdlLWI2ZWMtNDQxOTAzZTJmNzMxXkEyXkFqcGdeQXVyNTM0NTU5Mg@@._V1_SX300.jpg"


    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            userdetails.name = s.toString()

        }
    }


}







