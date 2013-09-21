package keueler.problem004

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = (900..999).toList().combine().filter { "$it".equals("$it".reverse()) }.max()
    println("Problem 4. The largest palindrome made from the product of two 3-digit numbers: " + result)
}

fun List<Int>.combine() = map { map { x-> it * x } }.reduce {(a, b)-> a + b }