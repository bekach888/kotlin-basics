package com.example.kotlinbasics

fun main(){
    val arrayList = ArrayList<Double>()
    arrayList.add(4.2)
    arrayList.add(5.6)
    arrayList.add(7.1)
    arrayList.add(6.9)
    arrayList.add(5.0)

    var total  = 0.0

    for (i in arrayList){
        total += i
    }

    var average = total/arrayList.size
    print("Average is $average")

}
