package aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish() , FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("munch on algea")
    }
}

interface FishAction {
    fun eat()
}
