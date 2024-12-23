package com.annie.bmi

fun main() {
    val poker = mutableListOf<Int>()
    for(i in 0 until 52){
        poker.add(i)
        if(i%13 == 0 && i != 0) println()
        val a = i / 13
        var type = "黑桃"
        if ( a == 0){
            type = "梅花"
        } else if (a == 1){
            type = "方塊"
        } else if (a == 2){
            type = "紅心"
        }
        print ("${(i%13)+1}$type ")
    }
}