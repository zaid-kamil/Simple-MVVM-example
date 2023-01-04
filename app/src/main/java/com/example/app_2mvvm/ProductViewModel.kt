package com.example.app_2mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {
    private val _product = MutableLiveData<Product>() //  creating a mutable live data object
    val product = _product // backing property

    init {
        //Log.d("ProductViewModel", "ProductViewModel created!")
        _product.value = Product("Razer X", "199999")
    }

    fun increasePrice() {
        val currentPrice = product.value?.price
        val newPrice = currentPrice?.toInt()?.plus(100)
        _product.value = Product(product.value!!.name, newPrice.toString())
        //Log.d("Product",_product.value.toString())
    }

    fun decreasePrice() {
        val currentPrice = product.value?.price
        val newPrice = currentPrice?.toInt()?.minus(100)
        _product.value = Product(product.value!!.name, newPrice.toString())
        // Log.d("Product",_product.value.toString())
    }

}