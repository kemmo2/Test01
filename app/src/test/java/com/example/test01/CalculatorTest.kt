package com.example.test01

import org.junit.Assert.assertEquals
import org.junit.Test


class CalculatorTest {

    private val calculator :Calculator = Calculator()

    @Test
    fun sum() {
        assertEquals(6,calculator.sum(1,5))
    }

    @Test
    fun sub() {
        assertEquals(3,calculator.sub(7,4))
    }
}