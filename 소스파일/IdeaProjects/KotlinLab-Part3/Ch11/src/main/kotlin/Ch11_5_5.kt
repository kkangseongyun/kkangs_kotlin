package eleven_five_five

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Outer {
    companion object NestedClass {
        val no: Int = 0
        fun myFun() { }
    }

    fun myFun(){
        no
        myFun()
    }
}

fun main(args: Array<String>) {
    Outer.NestedClass.no
    Outer.NestedClass.myFun()

    Outer.no
    Outer.myFun()
}