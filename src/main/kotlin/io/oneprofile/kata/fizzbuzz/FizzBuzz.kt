package io.oneprofile.kata.fizzbuzz

import com.sun.jdi.IntegerValue

class FizzBuzz {
    fun compute(input: String): String {
        return computingContainRule(input)
    }

    fun computingContainRule(input: String): String {
        if (input.contains("3")) {
            return "Fizz"
        }
        if (input.contains("5")) {
            return "Buzz"
        }
        return input
    }

    fun computingDivisionRule(input: String): String {
        val value = Integer.valueOf(input)
        if(value == 3) {
            return "Fizz"
        }
        if(value == 5) {
            return "Buzz"
        }

        return input
    }
}