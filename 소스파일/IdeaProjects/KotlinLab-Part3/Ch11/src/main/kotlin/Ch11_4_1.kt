package eleven_four_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Outer {
    class Nested {
        val name: String = "kkang"
        fun myFun(){
            println("Nested.. myFun...")
        }
    }
}

fun main(args: Array<String>) {
    val obj: Outer.Nested = Outer.Nested()
    println("${obj.name}")
    obj.myFun()
}