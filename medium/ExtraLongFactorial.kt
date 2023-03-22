package medium

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */

fun extraLongFactorials(n: Int) {
    var value = BigInteger.valueOf(1)

    for(i in 1..n){
        value = value.multiply(BigInteger.valueOf(i.toLong()))
    }

    println(value.toString())
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    extraLongFactorials(n)
}
