package keueler.problem002

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = fibonacci().takeWhile { it < 4000000 }.filter { it.isEven() }.sum()
    println("Problem 2. Sum of the even-valued Fibonacci terms: " + result)
}

fun fibonacci(): Iterator<Int> {
    var a = 0
    var b = 1

    fun nextFib(): Int {
        val result = a + b
        a = b
        b = result
        return result
    }

    return iterate { nextFib() }
}