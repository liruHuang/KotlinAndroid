package com.annie.bmi

import androidx.compose.ui.Modifier

class Person (val name : String, val weight:Float, val height : Float){
/*    var wieght : Float = 0f
    var height : Float = 0f*/

    fun bmi() : Float {
        var bmi = weight / (height * height)
        return bmi
    }

    fun hello(){
        println("Helloooo Kotlin!!")
    }
}