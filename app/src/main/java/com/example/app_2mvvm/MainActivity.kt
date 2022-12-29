package com.example.app_2mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.app_2mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        binding.viewModel = viewModel
        viewModel.product.value = Product("Laptop X", "1 Lacs approx")
    }
}
