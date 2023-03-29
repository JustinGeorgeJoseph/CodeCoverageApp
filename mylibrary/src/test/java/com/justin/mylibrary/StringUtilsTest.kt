package com.justin.mylibrary

import org.junit.Test

class StringUtilsTest {

    @Test
    fun testStringUtils() {
        val actualValue = StringUtils().joinTwoString("abc", "def")
        assert(actualValue == "abcdef")
    }
}