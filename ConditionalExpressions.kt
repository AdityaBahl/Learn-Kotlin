package com.example.helloworld

fun main(){
    //Strings
    var a=1
    val s1 = "a is $a"
    a++
    val b=a+1
    //val b=a-1
    //val b=a
    println("$s1+ and updated a = $a")
    //Conditional Expressions(if,if else,else)
    if(b>a){
        print("B is bigger my n word")
    }
    else if(b<a){
        print("B is smaller my baller")
    }
    else{
        print("B is equal to A, you gay")
    }
}