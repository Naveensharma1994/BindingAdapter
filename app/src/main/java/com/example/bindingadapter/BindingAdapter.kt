package com.example.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

import com.bumptech.glide.Glide

@BindingAdapter("imagefromurl")
fun ImageView.imagefromurl(url:String){
Glide.with(this).load(url).into(this)

}