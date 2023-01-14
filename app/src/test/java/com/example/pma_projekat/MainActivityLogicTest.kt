package com.example.pma_projekat

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import com.google.common.truth.Truth.assertThat

class MainActivityLogicTest{

    private lateinit var logic: MainActivityLogic

    @Before
    fun setup()
    {
        logic = MainActivityLogic()
    }

    /**
     * BELESKA: df3.format ne odseca decimale, vec ih matematicki zaokruzuje na 3 decimales
     */

    @Test
    fun formatChangeTest1()
    {
        val result = logic.formatChange(2.123976)
        assertThat(result).isEqualTo("+2.124 %")
    }

    @Test
    fun formatChangeTest2()
    {
        val result = logic.formatChange(-3.14159)
        assertThat(result).isEqualTo("-3.142 %")
    }
}