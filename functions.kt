package com.example.helloworld
fun sum(a: Int,b:Int) = a+b
fun sum1(a:Int,b:Int):Unit {//it is optional, can be removed too
//Unit corresponds to the void keyword in Java. What is a Unit in Kotlin?
// If you have a function that does not return a value, you can return a Unit object
    println("sum of $a and $b is ${a + b}")
}
fun main(args:Array<String>){
    println("Sum of 19 and 23 = ${sum(19,23)}")
}