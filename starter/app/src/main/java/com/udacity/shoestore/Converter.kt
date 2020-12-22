package com.udacity.shoestore

import android.widget.EditText
import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("stringToDouble")
    @JvmStatic
    fun doubleToString(
//        view: EditText, oldValue: Double,
        value: Double
    ): String {
        if (value < 0.0) {
            return ""
        } else {
            return value.toString()
        }
    }

    @JvmStatic
    fun stringToDouble(
//        view: EditText, oldValue: String,
        value: String
    ): Double {
        if(value.isNotEmpty()) {
            return value.toDouble()
        } else {
            return "0".toDouble()
        }
    }
}