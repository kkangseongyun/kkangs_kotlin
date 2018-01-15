package five_one_five

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    val myVal1: Any = 10
    val myVal2: Any?= myVal1

    val myVal3: Any? = 10
//    val myVal4: Any = myVal3//error
    val myVal5: Any = myVal3 as Any

    val myInt1: Int = 10
    val myInt2: Int? = myInt1

    val myInt3: Int? = 10
//    val myInt4: Int = myInt3//error
    val myInt5: Int = myInt3 as Int
}