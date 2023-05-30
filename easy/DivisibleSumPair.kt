package easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var validPair = 0

    ar.forEachIndexed{ i, firstItem ->
        ar.forEachIndexed { j, secondItem ->
            if (i<j && (firstItem+secondItem) % k == 0){
                validPair++
            }
        }
    }

    return validPair
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
