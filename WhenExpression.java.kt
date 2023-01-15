package com.example.helloworld
//When is like Switch statement
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun main() {
    val x=3
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        //The else branch is evaluated if none of the other branch
        // conditions are satisfied.
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}