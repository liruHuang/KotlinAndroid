package com.annie.bmi

import kotlin.random.Random

fun main() {
    val secret = (1..10).random()
    var nums = 0
    var bingo = false
    for (i in 1..3){
        println("please enter a number(1-2) 第 $i 次:")
        val input = readLine()
        nums = input?.toIntOrNull() ?: 0
        if ( secret < nums ){
            println("smaller")
        }else if (secret > nums ){
            println("bigger")
        }else {
            if(i==1){
                println("Excellent!! the number is $secret")
            }else if(i==2){
                println("Great!! the number is $secret")
            }else{
                print("good, the number is $secret")
            }
            bingo = true
            break

        }
    }
    if (!bingo){
        println("sorry, the number is $secret")
    }
}