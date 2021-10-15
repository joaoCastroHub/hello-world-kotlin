package Exercises

open class Book(var title: String = "", var author: String = "") {
    private var currentPage: Int = 1

    open fun readPage() {
        currentPage += 1
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordsRead = 0

    override fun readPage() {
        wordsRead += 250
    }
}