package com.suoqin

fun main(args: Array<String>) {
    println("Hello, world!")
    val john = Person("John", 15, null)
    println("john.isTeenager() = " + john.isTeenager())

    val sum: (Int, Int) -> Int = { x, y -> x + y }
    println("sum 1 + 2 = " + sum(1, 2))

    val double: (Int, Int, (Int, Int) -> Int) -> Int = { x, y, z -> z(x, y) * 2 }

    println("double sum 3, 4 = " + double(3, 4, sum))

    intMapping()

    range()

}

fun intMapping(): List<Int> {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    val squareNumbers = numbers.map({ x -> x * x })
    println("squareNumbers are " + squareNumbers)
    return squareNumbers
}

private fun range() {
    val r1 = 1..5

    println("val r1 = 1..5 : " + r1.toList())

    val r2 = 5 downTo 1

    println("val r2 = 5 downTo 1 : " + r2.toList())

    val r3 = 5 downTo 1 step 2

    println("val r3 = 5 downTo 1 step 2 : " + r3.toList())
}