package com.annie.bmi

fun main() {
    print("please enter a number (1-10): " )
    val input = readLine()
    val num = input?.toIntOrNull() ?: 0
    println("The number you enter is $num ")
}