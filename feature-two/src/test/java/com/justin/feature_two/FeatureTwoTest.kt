package com.justin.feature_two

import org.junit.Test

class FeatureTwoTest {

    @Test
    fun featureTwoTestTwiceTest() {
        val actualValue = FeatureTwo().featureTwoTestTwice(2)
        assert(actualValue == 4)
    }
}