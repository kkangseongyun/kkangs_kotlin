package seventeen_four_one_five

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in from.indices)
        to[i] = from[i]
}

fun main(args: Array<String>) {
    val array1: Array<Int> = arrayOf(1, 2, 3)
    val array2 = Array<Any>(3){ x -> 0}
    copy(array1, array2)//error
    array2.forEach { println(it) }
}
