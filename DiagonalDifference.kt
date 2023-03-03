import kotlin.collections.*
import kotlin.io.*
import kotlin.math.absoluteValue
import kotlin.ranges.*
import kotlin.text.*

/**
 *  Challange link: https://www.hackerrank.com/challenges/diagonal-difference/problem
 * **/

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val diagonalA = mutableListOf<Int>()
    val diagonalB = mutableListOf<Int>()

    arr.forEachIndexed{index, array ->
        diagonalA.add(array[index])
        diagonalB.add(array[array.size-(index+1)])
    }

    return (diagonalA.sum() - diagonalB.sum()).absoluteValue
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
