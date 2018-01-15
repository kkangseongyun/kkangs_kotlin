package sixteen_three_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Test {
    val data1: Int = 10
}

val Test.data2
    get() = 20

fun main(args: Array<String>) {
    val obj: Test = Test()
    println("data2 : ${obj.data2}")
}