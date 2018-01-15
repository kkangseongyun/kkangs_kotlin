package nine_four_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super{
    fun superFun(){
        println("superFun()...")
    }
}

class Sub1: Super(){
    fun subFun1(){
        println("subFun1()....")
    }
}

class Sub2: Super() {
    fun subFun2(){
        println("subFun2()....")
    }
}

fun main(args: Array<String>) {
    //nullable casting
    val obj7: Super? = null
    val obj8: Sub1? = obj7 as? Sub1
}