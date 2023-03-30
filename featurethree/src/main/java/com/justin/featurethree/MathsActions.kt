package com.justin.featurethree

import android.util.Log

class MathsActions {

    fun sumTwoValues(a: Int, b: Int) = a + b

    fun minusTwoValues(a: Int, b: Int) = a - b

     fun multiplyTwo(a: Int, b: Int) = multiplyTwoValues(a,b)


    private fun multiplyTwoValues(a: Int, b: Int) = a * b

     fun divTwoValues(a: Int, b: Int) = a / b

     fun divsTwoValues(a: Int, b: Int) = a / b

    fun checkValueIsGreater(a: Int, b: Int) = if (a<b){
        Log.d("TAG_JUSTIN","VALUES")
        true
    } else{
        Log.d("TAG_JUSTIN","VALUES")
        false
    }
}