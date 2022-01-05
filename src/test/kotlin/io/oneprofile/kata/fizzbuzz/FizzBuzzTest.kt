package io.oneprofile.kata.fizzbuzz

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun `should display Fizz with input containing 3`() {
        // GIVEN
        val input = "3"

        // Act
        val result = FizzBuzz().compute(input)

        // ASSERT
        Assertions.assertThat(result).isEqualTo("Fizz")

    }

    @Test
    fun `should display Buzz with input containing 5`() {
        // GIVEN
        val input = "5"

        // ACT
        val result = FizzBuzz().compute(input)

        // ASSERT
        Assertions.assertThat(result).isEqualTo("Buzz")

    }
}