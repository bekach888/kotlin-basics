package com.example.kotlinbasics

fun main(){
    // argument
    var avg = averageOfTwoValues(5.3,13.37)
    print("result is $avg")
}
// Method - a Method is a Function within a class
// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // output
    return a+b
}

fun averageOfTwoValues(a:Double,b:Double): Double{
    return (a+b) /2

}

fun myFunction(){
    print("Called from myFunction")
}