package keueler.problem009

/**
 * @author: Oviron
 */

fun main(args: Array<String>) {
    var result = 0
    for (a in 1..1000)
        for (b in a..1000)
            for (c in b..1000)
                if (a + b + c == 1000 && a * a + b * b === c * c) {
                    result = a * b * c
                    break;
                }
    println("Problem 9: " + result)
}