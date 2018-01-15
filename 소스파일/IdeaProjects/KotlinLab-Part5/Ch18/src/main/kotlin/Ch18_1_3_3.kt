package eighteen_one_three_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun myFun(no: Int): Boolean {
    return no > 10
}
fun main(args: Array<String>) {
    val array = arrayOf<Int>(10, 5, 30, 15)

    println("람다함수 이용...")
    array.filter { it > 10 }
            .forEach { println(it) }

    println("함수 Reference 이용....")
    array.filter(::myFun)
            .forEach { println(it) }

}