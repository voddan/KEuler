package keueler.problem005

import keueler.util.*
import java.util.ArrayList

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    val result = (1..20).getDivisors().multiply()
    println("Problem 5. The smallest positive number that is evenly divisible by all of the numbers from 1 to 20: " + result)
}

fun IntRange.getDivisors(): List<Int> {
    val result = ArrayList<Int>()
    return this.mapTo(result, { it.getPrimeDivisor(result) })
}

fun Int.getPrimeDivisor(set: List<Int>): Int {
    return if (this == 1 || set.size() == 0)
        this
    else if (this multipleOf set.first())
        (this / set.first()).getPrimeDivisor(set.drop(1))
    else
        this.getPrimeDivisor(set.drop(1))
}