package easy

import kotlin.collections.*
import kotlin.io.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/between-two-sets/problem
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var total = 0

    for (i in a.last()..b.first()){
        if(a.none { i % it != 0 }){
            if (b.none { it % i != 0 }){
                total++
            }
        }
    }
    return total
}

fun main(args: Array<String>) {

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
