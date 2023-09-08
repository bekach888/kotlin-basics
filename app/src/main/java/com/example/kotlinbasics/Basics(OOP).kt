package com.example.kotlinbasics

fun main(){
    // Creating instances of classes
    var beka = Person("Beka","Tchkoidze",20)
    beka.age = 32
    println("beka is ${beka.age} years old ")
    beka.hobyy = "play video games"
    beka.stateHobby()
    var john = Person()
    john.hobyy = "to skateboard"
    john.stateHobby()
    //var johnPeterson =  Person(lastName = "Peterson")
    //var mobilePhone = MobilePhone("Android","OnePlus", "Nord 2T")

}

class Person(firstName: String = "John", lastName: String = "Doe"){
    // Member Variable - Properties
    var age : Int? = null
    var hobyy : String = "watch Netflix"
    var firstName : String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " + "firstName = $firstName and lastName = $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String,lastName: String,age: Int): this(firstName,lastName){
        this.age = age
        println("Initialized a new Person object with " + "firstName = $firstName and lastName = $lastName and age $age")
    }

    // Member functions - Methods
    fun stateHobby(){
        println("$firstName\'s hobby is $hobyy")
    }
}


// Exercise N1
/*

class MobilePhone(osName: String, brand: String, model: String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}

 */


