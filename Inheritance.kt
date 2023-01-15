package com.example.helloworld
// all classes are final by default(meaning that they cant be inherited),
//open keyword makes a class inheritable
open class Person(val name:String){
    init{
        println("This is a person")
    }
    open var age: Int=1
    open fun doWork(){
        println("Person is doing work")
    }
}
//Person is the parent(super) class and student is the child(base) class
class Student(name: String, val school:String, override var age:Int):Person(name){
    init{
        println("This is a student")
    }
    override fun doWork(){
        //overriding parent function
        println("Student is studying!")
    }
}
//override function
//override property
//call super
fun main(){
    val student = Student("John","DP School",10)
    student.doWork()
    //val x:Person= Student("Mark", "Doe")
    println("The age of student is: ${student.age}")
}
//to access something(function or variable) in a child class from a parent class,
//we need to use super keyword like -->  super.function()
//eg. super.doWork() in Student class would use Person class's doWork function.
