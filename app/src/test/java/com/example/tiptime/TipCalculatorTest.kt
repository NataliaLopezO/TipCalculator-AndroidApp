package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun calculateTip_20PercentNoRoundup(){
        val amount = 10.00
        val tipPercent = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(2)
        var actualTip = calculateTip(amount, tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}