package com.example.pma_projekat

import org.junit.Assert.*
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class DetailActivityLogicTest{

    private lateinit var logic : DetailActivityLogic

    @Before
    fun setup()
    {
        logic = DetailActivityLogic()
    }

    @Test
    fun formatTextTest1()
    {
        val result = logic.formatText("1h","+23 %")
        assertThat(result).isEqualTo("Change 1h:     +23 %")
    }

    @Test
    fun formatTextTest2()
    {
        val result = logic.formatText("24h","+23 %")
        assertThat(result).isEqualTo("Change 24h:  +23 %")
    }

    @Test
    fun formatTextTest3()
    {
        val result = logic.formatText("7d","+23 %")
        assertThat(result).isEqualTo("Change 7d:     +23 %")
    }
}