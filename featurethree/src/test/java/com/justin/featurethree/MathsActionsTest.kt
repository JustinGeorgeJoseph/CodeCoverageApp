package com.justin.featurethree

import org.junit.Test

class MathsActionsTest {

    @Test
    fun testSum(){
        assert(MathsActions().sumTwoValues(1,1)==2)
    }
}