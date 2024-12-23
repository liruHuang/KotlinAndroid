package com.annie.bmi

fun main() {
    val nums = mutableListOf(1,2,3,4,5,6,7,8,9)
    nums.shuffle()
    println(nums)
    val secret = nums.removeAt(0)
    println(secret)
    val bomb = nums.removeAt(0)
    println(bomb)

    val list = mutableListOf(4,6,8,9)
    list.add(5)
    println(list)
    list.removeAt(2)
    println(list)


    val array = intArrayOf(2,4,5,6,7,9)
    println(array[0])

    val arrayString = arrayOf("Sun", "Mon", "Tue", "Wed")
    println(arrayString.size)
    println(arrayString[2])

    for(day in arrayString){
        println(day)
    }


    for(i in 1..20 ) {
        if (i % 2 == 1){
            print("*")
        }else{
            print(" ")
        }
    }

    println()

    for(i in 1..30 step 2) {
        print(i)
    }

    println()

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