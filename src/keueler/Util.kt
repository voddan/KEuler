package keueler.util

/**
 * @author: Oviron
 */

// max
inline fun Iterator<Int>.max() = reduce {(a, b) -> Math.max(a, b) }
inline fun Iterator<Float>.max() = reduce {(a, b) -> Math.max(a, b) }
inline fun Iterator<Double>.max() = reduce {(a, b) -> Math.max(a, b) }
inline fun Iterator<Long>.max() = reduce {(a, b) -> Math.max(a, b) }
inline fun Iterable<Int>.max() = reduce {(a, b: Int) -> Math.max(a, b) }
inline fun Iterable<Float>.max() = reduce {(a, b: Float) -> Math.max(a, b) }
inline fun Iterable<Double>.max() = reduce {(a, b: Double) -> Math.max(a, b) }
inline fun Iterable<Long>.max() = reduce {(a, b: Long) -> Math.max(a, b) }
inline fun Array<Int>.max() = reduce {(a, b: Int) -> Math.max(a, b) }
inline fun Array<Float>.max() = reduce {(a, b: Float) -> Math.max(a, b) }
inline fun Array<Double>.max() = reduce {(a, b: Double) -> Math.max(a, b) }
inline fun Array<Long>.max() = reduce {(a, b: Long) -> Math.max(a, b) }

// min
inline fun Iterator<Int>.min() = reduce {(a, b) -> Math.min(a, b) }
inline fun Iterator<Float>.min() = reduce {(a, b) -> Math.min(a, b) }
inline fun Iterator<Double>.min() = reduce {(a, b) -> Math.min(a, b) }
inline fun Iterator<Long>.min() = reduce {(a, b) -> Math.min(a, b) }
inline fun Iterable<Int>.min() = reduce {(a, b: Int) -> Math.min(a, b) }
inline fun Iterable<Float>.min() = reduce {(a, b: Float) -> Math.min(a, b) }
inline fun Iterable<Double>.min() = reduce {(a, b: Double) -> Math.min(a, b) }
inline fun Iterable<Long>.min() = reduce {(a, b: Long) -> Math.min(a, b) }
inline fun Array<Int>.min() = reduce {(a, b: Int) -> Math.min(a, b) }
inline fun Array<Float>.min() = reduce {(a, b: Float) -> Math.min(a, b) }
inline fun Array<Double>.min() = reduce {(a, b: Double) -> Math.min(a, b) }
inline fun Array<Long>.min() = reduce {(a, b: Long) -> Math.min(a, b) }

// sum
inline fun Iterator<Int>.sum() = reduce {(a, b) -> a + b }
inline fun Iterator<Float>.sum() = reduce {(a, b) -> a + b }
inline fun Iterator<Double>.sum() = reduce {(a, b) -> a + b }
inline fun Iterator<Long>.sum() = reduce {(a, b) -> a + b }
inline fun Iterable<Int>.sum() = reduce {(a, b) -> a + b }
inline fun Iterable<Float>.sum() = reduce {(a, b) -> a + b }
inline fun Iterable<Double>.sum() = reduce {(a, b) -> a + b }
inline fun Iterable<Long>.sum() = reduce {(a, b) -> a + b }
inline fun Array<Int>.sum() = reduce {(a, b) -> a + b }
inline fun Array<Float>.sum() = reduce {(a, b) -> a + b }
inline fun Array<Double>.sum() = reduce {(a, b) -> a + b }
inline fun Array<Long>.sum() = reduce {(a, b) -> a + b }

// multiply
inline fun Iterator<Int>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterator<Float>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterator<Double>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterator<Long>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterable<Int>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterable<Float>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterable<Double>.multiply() = reduce {(a, b) -> a * b }
inline fun Iterable<Long>.multiply() = reduce {(a, b) -> a * b }
inline fun Array<Int>.multiply() = reduce {(a, b) -> a * b }
inline fun Array<Float>.multiply() = reduce {(a, b) -> a * b }
inline fun Array<Double>.multiply() = reduce {(a, b) -> a * b }
inline fun Array<Long>.multiply() = reduce {(a, b) -> a * b }

//Int
fun Int.multipleOf(x: Int) = this % x == 0
fun Int.isEven() = this multipleOf 2
fun Int.isOdd() = !isEven()

//Long
fun Long.multipleOf(x: Long) = this % x == 0.toLong()
fun Long.isPrime() = this > 1.toLong() && smallestPrimeFactor() == 1.toLong()
fun Long.smallestPrimeFactor(): Long = (2..Math.sqrt(toDouble()).toLong()).iterator().find { this multipleOf it } ?: 1

//Util
fun primeNumbers(): Iterator<Long> {
    var candidate = 1.toLong()

    fun nextPrime(): Long {
        while (true) {
            if ((++candidate).isPrime()) {
                break
            }
        }
        return candidate
    }

    return iterate { nextPrime() }
}