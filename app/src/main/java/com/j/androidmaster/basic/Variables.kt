package com.j.androidmaster.basic

fun main() {
    //println("hola hola")
    //ifBasico()
    //result("j")
    //result2(2)

    val weekDays = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")
    //println(weekDays)

    for(position in weekDays.indices){
       // println(weekDays[position])
    }

    for(weekDay in weekDays){
        println(weekDay)
    }

}

fun ifBasico(){
    val name ="j"
    if (name == "j"){
        println("hola j")
    }
}

fun getMonth(month:Int){
    when(month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> {println("marzo")
              println("código extra")  }
        4,5,6 -> println("Segundo trimestre")
        in 7..9 -> println("tercer trimestre")
        else -> println("No es un mes")
    }
}

fun result(value:Any):Any{
    return when(value){
        is Int -> value + value
        is String -> value
        else -> "malisimo"
    }
}

fun result2(value:Any) = when(value){
        is Int -> value + value
        is String -> value
        else -> "malisimo"
    }
