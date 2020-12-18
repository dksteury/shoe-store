package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel : ViewModel() {

    private val dummyList = mutableListOf<Shoe>(
        Shoe("Keyano", 12.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 11.5, "Asics", "Running Shoe")
    )

    private val _shoeList = MutableLiveData<List<Shoe>>(dummyList)
    val shoeList: LiveData<List<Shoe>>
        get() = _shoeList

}