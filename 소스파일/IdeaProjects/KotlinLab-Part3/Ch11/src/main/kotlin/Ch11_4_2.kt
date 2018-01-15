package eleven_four_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//outer의 맴버 접근 테스트

class Outer {
    private var no: Int = 10
    fun outerFun() {
        println("outerFun()...")
    }
    inner class Nested {
        val name: String = "kkang"
        fun myFun(){
            println("Nested.. myFun...")
            no=20//error
            outerFun()//error
        }
    }

    fun createNested(): Nested {
        return Nested()
    }
}

fun main(args: Array<String>) {
    val obj1: Outer.Nested = Outer().Nested()
    val obj2: Outer.Nested = Outer().createNested()
}