package com.example.helloworld
//open is like public
//The difference being
//1. public is an access modifier, while open is a keyword
//2. classes in kotlin are by default public
//3. open can be considered as opposite to Java's Final(When method)
//4. The open keyword symbolizes open for extension. With the open keyword, any other
// class can inherit from this class.
//5. final keyword in java prevents method overriding and extensions in class
fun main(args: Array<String>)
{
    val add = Add(5, 6)
    println("The Sum of numbers 5 and 6 is: ${add.c}")
}
//primary constructor
open class Add constructor(a: Int,b:Int)
{
    var c = a+b;
}