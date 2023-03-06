package easy
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/**
 * Challenge link -> https://www.hackerrank.com/challenges/plus-minus/problem
 * */

fun plusMinus(arr: Array<Int>, lenght: Int): Unit {
    var positive = 0
    var negative = 0
    var zero = 0

    arr.forEach {
        when{
            it>0 -> positive++
            it<0 -> negative++
            else -> zero++
        }
    }

    println("%.6f".format(positive.toFloat()/lenght))
    println("%.6f".format(negative.toFloat()/lenght))
    println("%.6f".format(zero.toFloat()/lenght))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr, n)
}
