package com.example.kotlinbasics

fun main(){

    val months = listOf("January","February","March")
    val anyTypes = listOf(1,2,3,true,false,"String")
    //print(anyTypes.size)
    //print(months[1])

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April","May","June","July","August","September","October","November","December",)
    additionalMonths.addAll(newMonths)
    //print(additionalMonths)

    val days = mutableListOf<String>("Mon","Tue","Wed")
    days.add("Thu")
    days[2] = "Sunday"
    //days.removeAt(3)
    val removeList = mutableListOf<String>("Mon","Wed")
    //days.removeAll(removeList)
    val addList = mutableListOf<String>("Sat","Sun")
    print(days)


}