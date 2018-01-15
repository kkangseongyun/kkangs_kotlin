package six_three_six

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    println("true && true : ${true && true}")
    println("true && false : ${true && false}")
    println("true || true : ${true || true}")
    println("true || false : ${true || false}")
    println("!true : ${!true}")

    fun trueFun(): Boolean{
        println("call.. trueFun()")
        return true
    }
    fun falseFun(): Boolean {
        println("call.. falseFun()")
        return false
    }
    println("trueFun() && trueFun() : ")
    trueFun() && trueFun()
    println("falseFun() && trueFun() : ")
    falseFun() && trueFun()
    println("falseFun() || trueFun() : ")
    falseFun() || trueFun()
    println("trueFun() || trueFun() : ")
    trueFun() || trueFun()
}