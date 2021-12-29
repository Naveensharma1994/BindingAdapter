package com.example.bindingadapter

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable


class UserModel : BaseObservable() {

    @Bindable
    var name: String? = null
        set(value){
            field = value
            notifyPropertyChanged(BR.name)
        }
    var lname: String? = null
    var url: String? = null

}