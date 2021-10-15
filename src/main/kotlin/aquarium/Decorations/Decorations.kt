package aquarium.Decorations

fun main(args: Array<String>) {}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println(d2.equals(d3)) //verdadeiro

    val d4 = d3.copy() //copia instancia

    val d5 = Decorations2("crystal", "wood", "diver")

    val (rock, wood, diver) = d5 //decomposicao
}

data class Decorations(val rocks: String) {}

data class Decorations2(val rocks: String, val wood: String, val diver: String){}