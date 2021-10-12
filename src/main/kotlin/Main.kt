import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    //alimenta o peixe
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if(shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return true
}

fun fishFood(day: String): String {
    return  when(day) {
        "Monday" -> "flakes"
        //"Thuesday" -> "pelletes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitos"
        //"Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Thuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

//Função de fit more fish

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) :Boolean {
    var ocupado = 0;
    for(i in currentFish) {
        ocupado += currentFish[i-1]
    }

    if(hasDecorations) {
       var space = tankSize.times(0.8)
        if(space <= ocupado) return false
        if(space < (ocupado + fishSize)) return false
        return true
    } else {
        if(tankSize <= ocupado) return false
        if(tankSize < (ocupado + fishSize)) return false
        return true
    }
}

