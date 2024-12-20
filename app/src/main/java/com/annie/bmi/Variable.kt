package com.annie.bmi

fun main() {
    val name : String? = null
    println(name?.length)
    println(name ?: 0)

    var count = 0
    count++
    count++
    count--
    println(count)
    println(10 / 3f)

    val a = false
    val b = false
    println( a && b)
    println( a || b)

    val num = 9
    println( num >3 && num < 8 )
    println( num < 1 || num > 5 )

}