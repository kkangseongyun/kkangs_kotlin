/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {


    //max, maxBy~~~~~~~~~~~~~~~~~~~~~~
    var result1: Int? = listOf(1, 11, 5).max()
    println("max test : $result1")


    result1=listOf(1, 11, 5).maxBy { it % 10 }
    println("max test : $result1")

}