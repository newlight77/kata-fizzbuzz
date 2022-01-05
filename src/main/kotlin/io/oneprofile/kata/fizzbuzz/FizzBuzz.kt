package io.oneprofile.kata.fizzbuzz

class FizzBuzz {
    fun compute(input: String): String {
        if (input.contains("3")) {
            return "Fizz"
        }

        if (input.contains("5")) {
            return "Buzz"
        }

        return ""
    }
}