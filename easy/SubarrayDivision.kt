package easy

import kotlin.io.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var ways = 0

    for (i in 0..s.size){
        if (i+m>s.size)
            break
        val array = s.sliceArray(IntRange(i, i+m-1))
        if(array.sum() == d)
            ways++
    }

    return ways
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
