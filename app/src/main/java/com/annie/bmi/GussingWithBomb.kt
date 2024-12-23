package com.annie.bmi

fun main() {
    val list = (1..10).toMutableList()
    list.shuffle()
    val secret = list.removeAt(0)
//    println(secret)
    val bomb = list.removeAt(0)
//    println(bomb)

    for(i in 1..5){
        println("please enter a number: (第 $i 次)")
        val num = readLine()?.toIntOrNull() ?: 0
        if (num == bomb ){
            println("Failed, you hit the bomb, the secret number is $secret")
            break
        }
        if (num < secret) {
            println("bigger")
        }else if( num > secret){
            println("smaller")
        }else {
            println("Great!! the secert number is $secret")
            break
        }

        println("Failed, the secret number is $secret")
    }

}