package com.justin.codecoveragetest

import org.junit.Test

class MathsActionsTest {

    @Test
    fun sumText(){
        val result = MathsActions().sumTwoValues(5,5)
        assert(result == 10)
    }

    @Test
    fun minusText(){
        val result = MathsActions().minusTwoValues(5,5)
        assert(result == 0)
    }

    @Test
    fun multiText(){
        val result = MathsActions().multiplyTwo(5,5)
        assert(result == 25)
    }

    @Test
    fun divText(){
        val result = MathsActions().divTwoValues(5,5)
        assert(result == 1)
    }

    @Test
    fun divsText(){
        val result = MathsActions().divsTwoValues(5,5)
        assert(result == 1)
    }
}