fun main(args: Array<String>) {
    println("Hello, world!")
    val john = Person("John", 15, null)
    println("john.isTeenager() = " + john.isTeenager())

    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println("sum 1 + 2 = " + sum(1, 2))

    val double: (Int, Int, (Int, Int) -> Int) -> Int = { x, y, z -> z(x,y) * 2 }

    println("double sum 3, 4 = " + double(3,4, sum))

}