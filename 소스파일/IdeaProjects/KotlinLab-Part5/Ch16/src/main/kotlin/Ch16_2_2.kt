package sixteen_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Test {
    companion object {
        val data1: Int = 10
        fun myFun1(){
            println("companion object myFun1()....")
        }
    }
}

val Test.Companion.data2: Int
    get() = 20

fun Test.Companion.myFun2() {
    println("extension myFun2()....")
}

fun main(args: Array<String>) {
    println("data1 : ${Test.data1} .. data2 : ${Test.data2}")
    Test.myFun1()
    Test.myFun2()
}