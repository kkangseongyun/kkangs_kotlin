/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {
    //none test~~~~~~~~~~~~~~~~
    val result2 =listOf(1, 11, 5).none { it % 10 == 0 }
    println("none test : $result2")

    //sumBy
    var result3=listOf(1, 2, 3).sumBy { it * 10 }
    println("sumBy test : $result3")

}