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
        print("TAG_JUSTIN - VALUES")
        true
    } else{
        false
    }

    fun checkValueIsGreater(a: Int) = when(a){
        1 -> 1
        2 -> 2
        3 -> 3
        4 -> 4
        else -> -1
    }

    fun checkValueIsWhen(a: Int) = when(a){
        1 -> 1
        2 -> 2
        3 -> 3
        4 -> 4
        else -> -1
    }
}