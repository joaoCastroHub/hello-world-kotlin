import Exercises.SimpleSpice
import Exercises.Spice
import java.util.*

fun main(args: Array<String>) {
//    FISH CONCEPTS
//    println("Hello, ${args[0]}!")
//    //alimenta o peixe
//    feedTheFish()
//
//    var bubbles = 0
//    while(bubbles < 50) {
//        bubbles ++
//    }
//
//    //funcao de repeticao
//    repeat(2) {
//        println("Fish is swimming")
//    }
//    END FISH CONCEPTS

//    TOMPEROS
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    var spices = listOf(Spice("curry", "Mild"), Spice("Lady fingers", "Hot"), Spice("Black Pepper", "Burning"))
    var coolSpices = spices.filter { it.heat < 10 }
    fun makeSalt() = Spice("Salt")

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if(shouldChangeWater(day)) {
        println("Change the water today")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    fun isTooHot(temperature: Int) = temperature > 30
    fun isDirty(dirty: Int) = dirty > 30
    fun isSunday(day: String) = day == "Sunday"

   return when {
       isTooHot(temperature) -> true
       isDirty(dirty) -> true
       isSunday(day) -> true
       else -> false
   }
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

