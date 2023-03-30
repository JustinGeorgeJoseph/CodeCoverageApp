package com.justin.featurethree

import org.junit.Test

class FeatureThreeTest {

    @Test
    fun testOne(){
        val actualValue = FeatureThree().testThis(1)
        assert(actualValue == 1)
    }
}