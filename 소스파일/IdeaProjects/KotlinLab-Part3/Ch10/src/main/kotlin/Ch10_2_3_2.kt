package ten_two_three_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface Interface4 {
    fun funA() {
        println("Interface4 funA...")
    }
}
interface Interface5 {
    fun funA() {
        println("Interface5 funA...")
    }
}

class Sub4: Interface4, Interface5 {
    override fun funA() {
        super<Interface4>.funA()
        super<Interface5>.funA()
    }
    fun some(){
        super<Interface5>.funA()
    }
}

fun main(args: Array<String>) {
    val obj=Sub4()
    obj.funA()
    obj.some()
}