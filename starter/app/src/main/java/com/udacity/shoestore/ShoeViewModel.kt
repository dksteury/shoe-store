package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel : ViewModel() {

    private val dummyList = mutableListOf<Shoe>(
        Shoe("Keyano", 12.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 11.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 11.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 10.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 10.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 9.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 9.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 8.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 8.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 7.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 7.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 6.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 6.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 5.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 5.0, "Asics", "Running Shoe"),
        Shoe("Keyano", 4.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 4.0, "Asics", "Running Shoe")
    )

    private val _shoeList = MutableLiveData<List<Shoe>>(dummyList)
    val shoeList: LiveData<List<Shoe>>
        get() = _shoeList

}