package Exercises

class Spice(var name: String = "", var spiceness: String = "Mild") {
    val heat : Int
        get() {return spicenessLevel() }

    init {
        println("Name: $name , Spiceness: $spiceness , Heat: $heat")
    }

    fun spicenessLevel() : Int {
        return when{
            spiceness == "Mild" -> 5
            spiceness == "Hot" -> 10
            spiceness == "Burning" -> 20
            else -> 0
        }
    }

}