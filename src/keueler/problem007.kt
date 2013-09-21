package keueler.problem007

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = primeNumbers().take(10001).toList().last()
    println ("Problem 7. The 10001st prime number: " + result)
}