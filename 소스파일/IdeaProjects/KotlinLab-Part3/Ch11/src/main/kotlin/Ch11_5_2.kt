package eleven_five_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface SomeInterface {
    fun interfaceFun()
}
open class SomeClass {
    fun someClassFun(){
        println("someClassFun....")
    }
}

class Outer {
    val myInner: SomeClass =object : SomeClass(), SomeInterface {
        override fun interfaceFun() {
            println("interfaceFun....")
        }
    }
}

fun main(args: Array<String>) {
    val obj=Outer()
    obj.myInner.someClassFun()
}