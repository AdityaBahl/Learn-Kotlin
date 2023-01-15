package com.example.helloworld
fun main(args:Array<String>){
    val numbers=arrayOf(1,2,3,4,5)
    val names=arrayOf("Adi","Nandi","Ma",4,5)
    val namesnew=arrayOf<String>("Adi","Nandi","Ma","Nana","Nani")
    for(item in numbers){
        print("$item --> ")
    }
    println();
    for(item in names){
        print("$item -->")
    }
    println()
    for(item in namesnew){
        print("$item -->")
    }
    println()
    val num = Array(6,{i->i+1})//i->i*1 outputs -> 0,1,2,3,4,5
    for(item in num){
        print("$item -->")
    }

    //two ways to select an index
    println("\n"+num[2])
    println(num.get(3))

    //to be able to set a null value in a variable
    var temp=String?:"Adi"//have to specify the data type and then a '?'

    //nulls in an array
    val nullArray = arrayOfNulls<Int>(10)
    temp=""
    println(temp)//shows nothing
}
