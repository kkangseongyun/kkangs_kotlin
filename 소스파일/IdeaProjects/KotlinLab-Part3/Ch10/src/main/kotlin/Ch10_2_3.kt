package ten_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface Interface1 {
    fun funA()
}

interface Interface2 {
    fun funA()
}

open abstract class Super2 {
    abstract fun funA()
}

class Sub2: Super2(), Interface1, Interface2 {
    override fun funA() {
        println("Sub2 funA...")
    }
}

fun main(args: Array<String>) {
    val obj1=Sub2()
    obj1.funA()
}