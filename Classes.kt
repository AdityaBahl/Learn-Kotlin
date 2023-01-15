package com.example.helloworld
open class Shape{
    //Classes are final by default; to make a class inheritable,
    // mark it as open.
    var heightt=10;
    var width:Int=2;
    fun show(){
        println("Height of shape class: $heightt")
        println("Width of shape class: $width")
    }
}
class Rectangle(var height: Double, var length: Double): Shape() {
    //Shape.show()
    var perimeter = (height + length) * 2//height+heightt
}
fun main(args:Array<String>) {
    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}