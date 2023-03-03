
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var scoreA = 0
    var scoreB = 0

    a.forEachIndexed{ index, value ->
        when{
            value>b[index] -> scoreA++
            b[index]>value -> scoreB++
        }
    }
    return arrayOf(scoreA, scoreB)
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}