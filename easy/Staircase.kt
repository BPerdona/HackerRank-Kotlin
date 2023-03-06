package easy
import kotlin.io.*
import kotlin.text.*

/**
 * Challenge link -> https://www.hackerrank.com/challenges/easy.staircase/problem
 * */

fun staircase(n: Int){
    for(i in 1..n){
        repeat(n-i){
            print(" ")
        }
        repeat(i){
            print("#")
        }
        println()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
