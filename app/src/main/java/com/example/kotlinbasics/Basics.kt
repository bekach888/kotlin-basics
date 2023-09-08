package com.example.kotlinbasics

fun main() {
    // immutable variable
    // TODO: Add new functionality

    /*
    This
    is a multiline
    comment
     */

    /*
    // type string
    val myName = "Beka"
    // type int 32 bit
    // type inference finds out the type from context
    var myAge = 19

    // Integer TYPES: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 12
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159254412934567

    // Booleans he type Boolean is used to represent logical values.
    // It can have two possible values true and false
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInstr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    var myLength = myStr.length


    print("First character $firstCharInstr and the length of myStr is ${myStr.length}")

    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    val a = 5.0
    val b = 3
    var resultDouble: Double
    resultDouble = a / b
    print(resultDouble)

    //Comparison operators(==, !=, <, >, <=, >=)

    val isEqual = 5==3
    println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    //String interpolation
    println("isNotEqual is $isNotEqual")

    println("is-5less3 ${-5<3}")
    println("is5LowerEqual3 ${5 <= 3}")
    println("is5GreaterEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum =5
    myNum += 3
    myNum *= 4
    //println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")


    //If Statements


    var heightPerson1 = 170
    var heightPerson2 = 159

    if(heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("use your power technique 1337")
    }else{
        println("use technique")
    }

    val age = 31

    if(age >= 21){
        print("now you may drink in the US")
    }else if(age >=18){
        println("you may vote now")
    }else if(age >= 16){
        println("you may drive now")
    }else{
        println("you're too young")
    }


    var name = "Beka"

    if(name == "Beka"){
        print("welcome home Beka")
    }else{
        println("who are you?")
    }

    val isRainy = true
    if(isRainy)
        println("It' rainy")


    //When Expressions

    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 ->{
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
       in 3..5 -> println("Spring")
       in 6..8 -> println("Summer")
       in 9..11 -> println("Fall")
       12, 1, 2 -> println("Winter")
       else -> println("Invalid Season")
    }


    when(age){
        !in 0..20-> println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16,17 -> println("you may drive now")
        else -> println("you are too young")
    }

    var x :Any = "13.37F"
    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }




    // While loop executes a block of code repeatedly as long as a given condition is true
    var x = 100
    while(x>= 0){
        print("$x")
        x -= 2
    }
    println("\nwhile loop is done")

    x= 15
    do{
        print("$x")
        x++
    }while (x<= 10)
    println("\ndo while loop is done")


    var feltTemp = "Cold"
    var roomTemp = 10
    while (feltTemp == "Cold" ){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    for (num in 1..10){
        print("$num ")
    }

    for (i in 1 until 10){ // Same as - for(i in 1.until(10)
        print("$i ")
    }
    println("_________")
    for (i in 10 downTo  1 step 2){ // Same as - for(i in 10.downTo(1).step(2)
        print("$i ")
    }



     */


    // Break And Continue
    for (i in 1 until 20){
        // 10/2 = 5
           // 11/2 = 5.5 which is 5 in term of an int
        if(i/2 ==5){
            continue
        }
        print("$i ")
    }
    print("Done with the loop")



/* Exercise N1

fun main1(){
    var myStr1: String = "Android Masterclass"
    val myFloat1: Float = 13.37F
    val myDouble1: Double = 3.14159265358979
    var myByte1: Byte = 25
    var myShort1: Short = 2020
    var myLong1: Long = 18881234567
    var myBoolean:Boolean = true
    var myChar1:Char = 'a'
}
 */


/*   Exercise N2
    for (num in 1..10000){
        if(num == 9001)
            println("IT'S OVER 9000!!!")
    }

    var humidityLevel = 80
    var humidity = "humid"

    while (humidity == "humid"){
        humidityLevel -=5
        println("humidity decreased")
        if (humidityLevel <60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }

 */

}