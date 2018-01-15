package eleven_five_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Outer {
    object NestedClass {
        val no: Int = 0
        fun myFun() { }
    }
}

fun main(args: Array<String>) {
    val obj=Outer()
//    obj.NestedClass.no//error

    Outer.NestedClass.no
    Outer.NestedClass.myFun()
}