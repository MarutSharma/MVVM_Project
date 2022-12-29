package com.example.mvvm_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        val prd = Product("Apple Iphone 13", "70000.00 approx")
        val viewModel = ViewModelProvider(this).get(ProductViewModel::class.java)
        binding.viewModel = viewModel
        viewModel.product.value = Product("Laptop MMM","1 lakhs")
    }
}