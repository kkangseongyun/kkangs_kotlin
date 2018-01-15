package six_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    var sum: Int=0
    for(i in 1..10) {
        sum += i
    }
    println(sum)

    val list = listOf("Hello", "World", "!")
    val sb=StringBuffer()
    for(str in list) {
        sb.append(str)
    }
    println(sb)

    println(list.indices)
    for (i in list.indices) {
        println(list[i])
    }

    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
    }

    for(i in 1 until 11 step 2){
        println(i)
    }


}