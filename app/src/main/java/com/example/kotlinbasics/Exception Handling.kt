package com.example.kotlinbasics

import androidx.annotation.Nullable
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate

//fun main(args:Array<String>){
//    try {
//        val a = IntArray(5)
//
//    a[5] = 10 / 0
//    }catch (e:ArithmeticException){
//        println("Arithmetic exception catch")
//    }catch (e:ArrayIndexOutOfBoundsException){
//        println("array index outofbounds exception ")
//    }catch (e:Exception){
//        println("parent exception class")
//    }
//    println("code after try catch...")
//}

//finally block example

//fun main(args:Array<String>){
//    try {
//        val data = 10/5
//        println(data)
//    }catch (e:NullPointerException){
//        println(e)
//    }finally {
//        println("finally block always executes")
//    }
//    println("below code...")
//}

//throw example
fun main(args:Array<String>){
    validate(15)/* Another function */
    println("code after validation check")
}
fun validate(age:Int){
    if (age<18)
        throw ArithmeticException("under age")
    else
        println("eligible for drive")
}