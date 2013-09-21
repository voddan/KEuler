package keueler.problem003

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = 600851475143.primeFactors().max()
    println("Problem 3. The largest prime factor of the number 600851475143: " + result)
}

fun Long.primeFactors(): List<Long> {
    val prime = smallestPrimeFactor()
    return if (prime == 1.toLong()) listOf(this) else listOf(prime) + (this / prime).primeFactors()
}