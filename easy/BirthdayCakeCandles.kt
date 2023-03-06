package easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
 * Challenge -> https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 * */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val higherCandle = candles.max()
    return candles.count { it==higherCandle }
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
