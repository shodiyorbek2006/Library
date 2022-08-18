package Abstract

import java.util.*

class Library : Book {


    data class Library(var name: String, var price: Int, var year: Int, var category:Category) {
        fun show() {

            println("Name $name")
            println("Price $price")
            println("Year $year")
            println("Category $category")
            println("=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=")
        }
    }


    private var scanner = Scanner(System.`in`)
    private var list = arrayOfNulls<Library >(100)

    var count = 0


    override fun add() {

        print("Name:")
        val name = scanner.next()
        print("Price:")
        val price = scanner.nextInt()
        print("Year:")
        val year = scanner.nextInt()
        println("     Choose Category")
        println("1]-> ${Category.Detektiv}")
        println("2]-> ${Category.Komediya}")
        println("3]-> ${Category.Fantastik}")
        val category=scanner.nextInt()
        when(category){
            1->{
                val libraryClass = Library(name, price, year,Category.Detektiv)
                list[count] = libraryClass
                count++
                println("Success :)")
            }
            2->{
                val libraryClass = Library(name, price, year,Category.Komediya)
                list[count] = libraryClass
                count++
                println("Success :)")
            }
            3->{
                val libraryClass = Library(name, price, year,Category.Fantastik)
                list[count] = libraryClass
                count++
                println("Success :)")
            }
        }



    }

    override fun list() {
        try {


            for (i in 0..count) {
                println(list[i]!!.show())
            }
        }catch (e:Exception){
            println()
        }

    }

    override fun search() {
        try {


            print("Enter name ")
            val name = scanner.next()
            val book: Library? = list.find { it!!.name == name }
            println(book)
        }catch (e:Exception){
            println("Not found :(")
        }
    }


    override fun remove() {
        print("Name:")
        val name = scanner.next()
        print("Price:")
        val price = scanner.nextInt()
        print("Year:")
        val year = scanner.nextInt()
        println("     Choose Category")
        println("[1]-> ${Category.Detektiv}")
        println("[2]-> ${Category.Komediya}")
        println("[3]-> ${Category.Fantastik}")
        val  category=scanner.nextInt()
        when(category){
            1->{
                val libraryClass = Library(name, price, year,Category.Detektiv )
                list[count] = libraryClass
                count--
                list[count--]
            }
            2->{
                val libraryClass = Library(name, price, year,Category.Komediya )
                list[count] = libraryClass
                count--
                list[count--]
            }
            3->{
                val libraryClass = Library(name, price, year,Category.Fantastik )
                list[count] = libraryClass
                count--
                list[count--]
            }
        }
    }
}