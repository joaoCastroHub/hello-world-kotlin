import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    //alimenta o peixe
    feedTheFish()
}

fun fitMoreFish(tankSize: Int, currentFish: Array<Int>, fishSize: Int, hasDecorations: Boolean) {

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

