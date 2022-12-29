package com.example.app_2mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {
    private val _product = MutableLiveData<Product>() //  creating a mutable live data object
    val product = _product // backing property
}