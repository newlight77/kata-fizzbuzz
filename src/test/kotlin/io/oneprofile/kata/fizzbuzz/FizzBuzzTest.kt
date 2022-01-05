package io.oneprofile.kata.fizzbuzz

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun `should display Fizz with input contains a 3`() {
        // GIVEN
        val input = "3"

        // Act
        val result = FizzBuzz().compute(input)

        // ASSERT
        Assertions.assertThat(result).isEqualTo("Fizz")

    }

    class FizzBuzz {
        fun compute(input: String): String {
            return ""
        }
    }
}