package com.annie.bmi

fun main() {
    val secret = 4
    val num =0
    while(num != secret){
        print("please enter a number (1-10): " )
        val input = readLine()
        val num = input?.toIntOrNull() ?: 0
        println("The number you enter is $num ")
        if(num > secret){
            println("lower")
        }else if(secret > num){
            println("higher")
        }else {
            println("Success!! the number is $secret")
            break
        }

    }

}