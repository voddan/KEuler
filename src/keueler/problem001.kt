package keueler.problem001

import keueler.util.*

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = (1..999).iterator().filter { it multipleOf 3 || it multipleOf 5 }.sum()
    println("Problem 1. Sum of all the multiples of 3 or 5 below 1000: " + result)
}