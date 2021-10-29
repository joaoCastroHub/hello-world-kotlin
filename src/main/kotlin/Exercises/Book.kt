package Exercises

open class Book(var title: String = "", var author: String = "") {
    const val MAX_NUMBER_BOOKS = 20
    private var currentPage: Int = 1

    open fun readPage() {
        currentPage += 1
    }

    fun canBorrow(hasBooks: Int):Boolean {
        return (hasBooks <= MAX_NUMBER_BOOKS)
    }

    fun printUrl() {
        println(Constants.BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    object Constants {
        const val BASE_URL = "http://www.turtlecare.net/"
    }
}



class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}