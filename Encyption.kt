
import java.lang.IndexOutOfBoundsException
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.ceil
import kotlin.math.sqrt
import kotlin.ranges.*
import kotlin.text.*

/***
 *
 *Challenge link -> https://www.hackerrank.com/challenges/encryption/problem
 */

fun encryption(s: String): String {
    val word = s.replace(" ", "")
    val root = sqrt(word.length.toDouble())
    val column = ceil(root).toInt()

    val list = mutableListOf(mutableListOf<Char>())
    var count = 0
    var index = 0

    word.forEach {
        if(count>=column){
            count = 0
            index++
            list.add(mutableListOf())
        }
        list[index].add(it)
        count++
    }

    var encryptWord = ""

    for (i in 0 until column){
        list.forEach { charList ->
            try {
                encryptWord += charList[i].toString()
            }catch (_: IndexOutOfBoundsException){

            }
        }
        encryptWord += " "
    }

    return encryptWord
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = encryption(s)

    println(result)
}