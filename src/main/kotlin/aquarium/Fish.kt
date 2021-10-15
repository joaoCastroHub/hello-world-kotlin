package aquarium

class Fish(val frindly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(true, 8) {
        println("Running secondary contrutor")
    }

    init {
        if (frindly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("contructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }

}

fun makeDefaultFish() = Fish(true, 500)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.frindly}. It needs volume ${fish.size}")
}