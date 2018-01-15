package nineteen_two_two

import test.JavaInterface1
import test.SAMTest

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    val obj=SAMTest()
    obj.setInterface(object : JavaInterface1{
        override fun callback() {
            println("hello kotlin")
        }
    })
    obj.callback.callback()

    obj.setInterface { println("hello sam") }
    obj.callback.callback()
}
