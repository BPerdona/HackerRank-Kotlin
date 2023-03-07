package easy

import java.text.SimpleDateFormat
import kotlin.io.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/time-conversion/problem
 */

fun timeConversion(s: String): String {
    val inputTime = SimpleDateFormat("hh:mm:ssaa").parse(s)
    return SimpleDateFormat("HH:mm:ss").format(inputTime)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
