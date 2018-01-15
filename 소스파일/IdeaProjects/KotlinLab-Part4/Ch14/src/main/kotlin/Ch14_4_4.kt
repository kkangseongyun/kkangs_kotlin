/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {


    println("indexOf ~~~~~~~~~~~~~~~~`")
    var result1=listOf(2, 5, 10, 2).indexOf(2)
    println("indexOf test : $result1")

    println("indexOfFirst ~~~~~~~~~~~~~~~~`")
    result1=listOf(2, 5, 10, 2).indexOfFirst { it % 2 == 0 }
    println("indexOfFirst test : $result1")

    println("indexOfLast ~~~~~~~~~~~~~~~~`")
    result1=listOf(2, 5, 10, 2).indexOfLast { it % 2 == 0 }
    println("indexOfLast test : $result1")


}