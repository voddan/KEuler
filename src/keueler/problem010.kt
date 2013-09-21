package keueler.problem010

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = primeNumbers().takeWhile { it < 2000000 }.sum()
    println("Problem 10. The sum of all the primes below two million: " + result)
}