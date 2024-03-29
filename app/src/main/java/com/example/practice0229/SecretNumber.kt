package com.example.practice0229

import java.util.Random

class SecretNumber {
    val secret: Int = Random().nextInt(10) + 1
    var count = 0
    fun validate(number:Int):Int{
        count++
        return number - secret
    }
}

fun main(){
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    println("${secretNumber.validate(2)},count:${secretNumber.count}")
}
