package com.c2v4.test.list

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExactlyInCyclicOrderAssertTest {

    @Test
    fun oneElement() {
        assertThat(listOf(1)).`is`(exactlyInCyclicOrder(listOf(1)))
    }


    @Test
    fun twoElements() {
        assertThat(listOf(1, 2)).`is`(exactlyInCyclicOrder(listOf(1, 2)))
    }


    @Test
    fun twoElementsReversed() {
        assertThat(listOf(1, 2)).`is`(exactlyInCyclicOrder(listOf(2, 1)))
    }

    @Test
    fun threeElementsReversed() {
        assertThat(listOf(1, 2, 3)).`is`(exactlyInCyclicOrder(listOf(3, 1, 2)))
    }

    @Test
    fun threeElementsReversedFail() {
        assertThat(listOf(1, 2, 3)).isNot(exactlyInCyclicOrder(listOf(2, 1, 3)))
    }

}