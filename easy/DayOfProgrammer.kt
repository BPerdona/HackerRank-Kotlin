package easy

import kotlin.io.*
import kotlin.text.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */

fun dayOfProgrammer(year: Int): String{
    var isLeap = when{
        (year>1917) && (year % 100 == 0) && (year % 400 != 0) -> false
        year == 1918 -> return "26.09.1918"
        year % 4 == 0 -> true
        else -> false
    }

    return if (isLeap) "12.09.$year" else "13.09.$year"
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
