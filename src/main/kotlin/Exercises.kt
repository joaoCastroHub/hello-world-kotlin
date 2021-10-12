import java.util.*

fun main(args: Array<String>) {
    //Responde qual o dia da semana
    dayOfWeek()
    //Greetings
    println("${if (args[1].toInt() < 12) "Good Morning, " else "Good Night, "} ${args[0]}")

    //fotuneCookie
    //getFortuneCookie()

    //What should i do today
//    print("How is your mood today? ")
//    var mood = readLine() ?: "happy"
//
//    print("How is the weather? ")
//    var weather = readLine() ?: "sunny"
//
//    print("Whats the temperature? ")
//    val temperature = readLine()?.toIntOrNull() ?: 24
//
//    println(whatShouldIDoToday(mood, weather, temperature))

}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    fun isSadAndSunny(mood: String, weather: String) = mood == "sad" && weather == "sunny"
    fun isBeachDay(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "sunny" && temperature > 24
    fun isFriendsTime(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "cloudy" && temperature > 20

    return when{
        isSadAndSunny (mood, weather)-> "Go for a walk"
        isBeachDay(mood, weather,temperature) -> "Go to the beach!"
        isFriendsTime(mood, weather, temperature) -> "Go hangout to your friends"
        else -> "Stay at home and read."
    }
}

fun getFortuneCookie() {
    //fortune cookie
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    var fortunes = listOf(
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when(birthday) {
        28,31 -> "You will have a great day!"
        in 1..7 ->  "Be humble and all will turn out well."
        else ->  fortunes[birthday.rem(fortunes.size)]
    }
}

fun dayOfWeek() {
    println("What day of week is it today?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day) {
        1 -> "Hoje é domingo"
        2 -> "Hoje é segunda feira"
        3 -> "Hoje é terça feira"
        4 -> "hoje é quarta feira"
        5 -> "hoje é quinta feira"
        6 -> "hoje é sexta feira"
        7 -> "hoje é sabado"
        else -> "O tempo parou"
    })
}
