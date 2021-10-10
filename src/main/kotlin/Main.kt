import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    //Responde qual o dia da semana
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day of week is it today?")

    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
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
