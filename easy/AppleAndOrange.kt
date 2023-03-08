package easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/apple-and-orange/problem
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>) {
    var orangesCount = 0
    var applesCount = 0
    apples.forEach {
        if (a + it in s..t){
            applesCount++
        }
    }
    oranges.forEach {
        if ((b + it) in (s..t)){
            orangesCount++
        }
    }

    println(applesCount)
    println(orangesCount)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
