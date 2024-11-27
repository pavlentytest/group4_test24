package com.example.myapplication

import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class MainUnitTest {

    lateinit var calculation: Calculation

    @Before
    fun before() {
        calculation = Calculation()
    }

    @Test
    fun test_1() {
        // Assert - получаем Exception
        // Assume - если тест не проходит - ignored
        Assert.assertEquals(40,calculation.calc(5,6))
    }
    @Test
    fun test_2() {
        Assert.assertEquals(61,calculation.calc(5,6))
    }

    @Test(expected = NullPointerException::class)
    fun test_3() {
        Assert.assertTrue(calculation.getStr(null))
    }

    @Test
    fun test_4() {
        Assume.assumeNotNull(null)
    }
}