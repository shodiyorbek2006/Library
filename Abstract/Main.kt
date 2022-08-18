package Abstract

import java.util.*

fun main(args: Array<String>) {
    val library = Library()
    val scanner = Scanner(System.`in`)
    while (true){
        println("1]-> Add book")
        println("2]-> List of Books")
        println("3]-> Search books")
        println("4]-> Remove book")

        val n = scanner.nextInt()
        when(n){
            1->{
                library.add()
            }
            2->{
                library.list()
            }
            3->{
                library.search()
            }
            4->{
                library.remove()
            }
        }
    }
}