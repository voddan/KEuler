package keueler.problem006

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = (1..100).toList().combineUnique().sum() * 2
    println("Problem 6. The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum: " + result)
}

fun List<Int>.combineUnique(): List<Int> {
    var i = 0;
    return map { this.subList(++i, this.size()).map { x-> x * it } }.reduce {(a, b)-> a + b }
}