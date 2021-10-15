package aquarium;

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println(
        "Length: ${myAquarium.length} " +
                "width: ${myAquarium.width} " +
                "height: ${myAquarium.height}"
    )

    myAquarium.height = 80

    println("Height: ${myAquarium.height}")
    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val smallAquarium2 = Aquarium(numberOffFish = 9)

    println(
        "Small Aquarium 2 : ${smallAquarium2.volume} liters with -> " +
                "length: ${smallAquarium2.length} " +
                "width: ${smallAquarium2.width} " +
                "height: ${smallAquarium2.height}"
    )
}