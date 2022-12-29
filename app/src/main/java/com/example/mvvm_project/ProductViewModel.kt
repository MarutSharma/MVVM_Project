package com.example.mvvm_project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProductViewModel : ViewModel() {
    private val _product = MutableLiveData<Product>()
    val product = _product
}