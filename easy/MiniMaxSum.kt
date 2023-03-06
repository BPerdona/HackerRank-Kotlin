package easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
 * Challenge -> https://www.hackerrank.com/challenges/mini-max-sum/problem
 */

fun miniMaxSum(arr: Array<Long>){
    val arrSum = arr.sum()

    val max = arr.max()?:0
    val min = arr.min()?:0

    val maxSum = arrSum - min
    val minSum = arrSum - max
    println("$minSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    miniMaxSum(arr)
}
