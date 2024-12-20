package com.annie.bmi


fun main() {
    val p = Person("Annie", 48.3f, 1.6f)
    p.bmi()
    println(p.bmi())
    val j = Person("Jane", 45.2f, 1.5f)
    println(p.name + ": " + p.bmi())
    println(j.name + ": " + j.bmi())
//    p.hello()



    //BMI
    val w =48.4f
    val h =1.6f
    var bmi = w / (h * h)
    println("BMI: "+ bmi)



/*
    println("Hello, Kotlin!")
    val age = 20
    println(age.inc())
    println(age)
    var name = "Annie"
    println(name.get(3))
    name = "Jane"
    println(name)
    val population = 9999999L;
    println(population)
    val weight: Float = 48.5f
    val height: Float = 15.6.toFloat()
    val isAudlt = true;
    val c = 'A'

    */
}