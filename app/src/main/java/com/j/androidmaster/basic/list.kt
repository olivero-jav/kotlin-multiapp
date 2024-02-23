package com.j.androidmaster.basic

fun main(){
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")
    weekDays.add(0, "jDay")
    println(weekDays)
}

fun inmutableList(){
    val readOnly:List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")
    //println(readOnly) // a diferencia de un array, muestra el contenido y no la posición en la memoria

    val example = readOnly.filter { it.contains("e") }
    println(example)

    readOnly.forEach {weekDay -> println(weekDay)} //podria haber sido como arriba pero asi se lee mejor
}