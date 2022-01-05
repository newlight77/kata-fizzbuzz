package io.oneprofile.kata.fizzbuzz

class FizzBuzz {
    fun compute(input: String): String {
        if (input.contains("3")) {
            return "Fizz"
        }

        return ""
    }
}