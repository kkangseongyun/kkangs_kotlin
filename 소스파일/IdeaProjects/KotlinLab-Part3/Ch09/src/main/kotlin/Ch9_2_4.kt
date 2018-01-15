package nine_two_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super {
    open var x: Int = 10
    open fun someFun(){
        println("Suer... someFun()")
    }
}
class Sub : Super() {
    override var x: Int = 20
    override fun someFun() {
        super.someFun()
        println("Sub... ${super.x} .... $x")
    }
}

fun main(args: Array<String>) {
    var sub=Sub()
    sub.someFun()

}
