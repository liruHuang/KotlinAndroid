package com.annie.bmi

import kotlin.random.Random

fun main() {
//    println(Random.nextInt(1,11))
    val secret = (1..10).random()
    var num = 0
    var bingo = false
//    while ( num != secret) {
    for(i in 1..3){
        print("please enter a number(1-10): ")
        val input = readLine()
        num = input?.toIntOrNull() ?: 0
        if (num < secret){
            println("bigger")
        }else if(num > secret){
            println("smaller")
        }else {
            println("Great! the number is $secret")
            bingo = true
            break
        }
    }
    if(!bingo){
        println("Failed, the secret number is $secret")
    }

}