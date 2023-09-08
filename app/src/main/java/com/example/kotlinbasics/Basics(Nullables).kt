package com.example.kotlinbasics

fun main(){

    //var name :String = "Beka"
    // name = null -> Compilation ERROR
    var nullableName: String? = "Beka"
    //nullableName =  null

    //var len2 = nullableName?.length
    //nullableName?.let { println(it.length) }

    // ?: Elvis operator
    val name = nullableName ?: "Guest"
    //println("name is $name")

    println(nullableName!!.toLowerCase())

    //You can perform a chain safe calls:
    // val wife'sAge: String? = user?.wife?.age?: 0

    /*
    if(nullableName != null) {
        var len2 = nullableName.length
    }else{
        null
    }
   */
}