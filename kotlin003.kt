data class Book(val bookId:String, val bookName:String){
    override fun toString():String{
        return "${bookId},${bookName}"
    }
}
fun main(args: Array<String>){
    val numbers = mutableListOf(10, 20, 30)
    val names = mutableListOf("LOVE", "LIFE", "LIVE")
    val books = mutableListOf(Book("001","Quran"), Book("002", "Hadith"))
    for( number in numbers){
        println(number)
    }
    for(name in names){
        println(name)
    }
    for( book in books){
        println(book)
    }
}
