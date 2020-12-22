package com.udacity.shoestore

import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeViewModel : ViewModel() {

    private val dummyList = mutableListOf<Shoe>(
        Shoe("Keyano", 11.5, "Asics", "Running Shoe"),
        Shoe("Keyano", 11.0, "Asics", "Running Shoe")
    )

    private val _shoeList = MutableLiveData<MutableList<Shoe>>(dummyList)
    val shoeList: LiveData<MutableList<Shoe>>
        get() = _shoeList

    var _shoe : Shoe

    private val _returnToList = MutableLiveData<Boolean>()
    val returnToList: LiveData<Boolean>
        get() = _returnToList

    init {
        _shoe = Shoe("", -1.0, "", "")
        _returnToList.value = false
    }


    fun addShoe() {
        _shoeList.value?.add(_shoe)
        _shoe = Shoe("", -1.0, "", "")
        returnToList()
    }

    fun returnToList() {
        _returnToList.value = true
    }

    fun returnToListComplete() {
        _returnToList.value = false
    }
}