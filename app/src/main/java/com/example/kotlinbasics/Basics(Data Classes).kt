package com.example.kotlinbasics

data class  User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"Beka")

    user1.name = "Michael"
    val user2 = User(1,"Michael")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name = "Beka Tchkoidze")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Beka Tchkoidze

    val (id,name) = updatedUser
    println("id = $id, name = $name")

}