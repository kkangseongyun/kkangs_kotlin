package sixteen_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super {
    val superData: Int = 10
    fun superFun() {
        println("superFun....")
    }
}

class Sub: Super() {
    val subData: Int = 20
    fun subFun() {
        println("subFun....")
    }
}

fun main(args: Array<String>) {
    val obj: Sub = Sub()
    println("superData : ${obj.superData}, subData : ${obj.subData}")
    obj.superFun()
    obj.subFun()
}