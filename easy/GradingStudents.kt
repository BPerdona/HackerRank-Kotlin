package easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/**
 * Challenge -> https://www.hackerrank.com/challenges/grading/problem
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val finalGrade = grades.map {
        if ((it < 38) || ((it % 5) < 3)){
            it
        }
        else{
            val mult = it/5+1
            mult*5
        }
    }
    return finalGrade.toTypedArray()
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}