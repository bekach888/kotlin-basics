package com.example.kotlinbasics


fun main(args:Array<String>){

//    println(OuterClass.InnerClass().description) //accessing property
//
//    var obj = OuterClass.InnerClass() //object creation
//
//    obj.foo() //access member function

}

class OuterClass{
    private var name:String = "Mr X"
    inner class InnerClass{
        var description:String= "code inside nested class"
        private var id:Int=101
        fun foo(){
            print("name is ${name}")  //access the private outer class member
            print("Id is ${id}")
        }
    }
}




