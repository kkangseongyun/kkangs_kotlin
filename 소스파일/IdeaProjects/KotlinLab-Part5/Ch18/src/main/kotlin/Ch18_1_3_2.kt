package eighteen_one_three_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun isOdd(x: Int): Boolean = x % 2 != 0

fun reflectionFun(argFun: (Int) -> Boolean){
    println("result: ${argFun(3)}")
}

fun main(args: Array<String>) {
    reflectionFun { n -> isOdd(n) }
    reflectionFun(::isOdd)
}