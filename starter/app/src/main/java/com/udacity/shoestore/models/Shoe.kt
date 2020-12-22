package com.udacity.shoestore.models



import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import com.udacity.shoestore.BR


data class Shoe(var name: String, private var size: Double, var company: String, var description: String,
    val images: List<String> = mutableListOf()
): Observable {

    private val propertyChangeRegistry = PropertyChangeRegistry()


    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        propertyChangeRegistry.add(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        propertyChangeRegistry.remove(callback)
    }

    @Bindable
    fun getSize(): Double {
        return size
    }

    fun setSize(newSize: Double) {
        if (newSize != size) {
            size = newSize
            propertyChangeRegistry.notifyChange(this, BR.size)
        }
    }
}



//{
//    fun getSize(): String {
//        if (size <= 0.0) {
//            return ""
//        }
//        return size.toString()
//    }
//
//    fun setSize(newSize: String) {
//        if (newSize.isEmpty()) {
//            size = 0.0
//        } else {
//            size = newSize.toDouble()
//        }
//    }
//
//}

//    : Parcelable

