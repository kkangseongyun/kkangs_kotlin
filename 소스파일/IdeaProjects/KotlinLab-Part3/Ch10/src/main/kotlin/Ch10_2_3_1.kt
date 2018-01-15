package ten_two_three_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface Interface3 {
    fun funA(){
        println("Interface3 funA....")
    }
}

open abstract class Super3 {
    abstract fun funA()
}

class Sub3: Super3(), Interface3 {
    override fun funA() {
        super.funA()
        println("Sub3 funA....")
    }
    fun some(){
        super.funA()
    }
}

fun main(args: Array<String>) {
    val obj1=Sub3()
    obj1.funA()
    obj1.some()
}