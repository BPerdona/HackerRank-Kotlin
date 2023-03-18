package easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Challenge -> https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var bestRecordsCount = 0
    var worstRecordsCount = 0
    var bestScore = scores[0]
    var worstScore = scores[0]

    scores.forEach { score ->
        when{
            score > bestScore -> {
                bestScore = score
                bestRecordsCount++
            }
            score < worstScore -> {
                worstScore = score
                worstRecordsCount++
            }
        }
    }
    return arrayOf(bestRecordsCount, worstRecordsCount)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
