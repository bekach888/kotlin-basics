package com.example.kotlinbasics

fun main(){
    var nord2T = MobilePhone("Android","OnePlus", "Nord 2T")
    nord2T.chargeBattery(25)
}


class MobilePhone(osName: String = "IOS", brand: String ="Iphone", model: String){

    private var battery = 30


    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy:Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }

}

