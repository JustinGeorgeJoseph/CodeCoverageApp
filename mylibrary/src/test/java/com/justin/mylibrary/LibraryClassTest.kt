package com.justin.mylibrary

import org.junit.Test

class LibraryClassTest {
    @Test
    fun sumText(){
        val result = LibraryClass().printMyName("nice")
        assert(result == "This is my : nice")
    }
}