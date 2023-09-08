package com.example.kotlinbasics

fun main(){

    val fruits = setOf("Orange","Apple","Grape","Apple","Mango","Orange")
    //print(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    //print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    for (key in daysOfTheWeek.keys){
        //print(" $key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favourite" to Fruit("Grape",2.5), "OK" to Fruit("Apple",1.0))
    //print(fruitsMap)

    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    print(newDayOfWeek.toSortedMap())
}

data class Fruits(val name:String, val price:Double)