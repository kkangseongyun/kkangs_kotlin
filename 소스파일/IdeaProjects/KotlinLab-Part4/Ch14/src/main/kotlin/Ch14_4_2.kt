/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {

    println("elementAt ~~~~~~~~~~~~~~~~`")
    var result1=listOf(2, 5, 10, 8).elementAt(2)
    println("elementAt test : $result1")

    println("elementAt ~~~~~~~~~~~~~~~~`")
    result1=listOf(2, 5, 10, 8).elementAtOrElse(5, { 0 })
    println("elementAtOrElse test : $result1")


}