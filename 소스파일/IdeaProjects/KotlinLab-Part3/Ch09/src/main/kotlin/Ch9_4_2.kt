package nine_four_two

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
    //as 이용
    println("하위->상위->하위.....")
    val obj3: Super = Sub1()
    val obj4: Sub1 = obj3 as Sub1
    obj4.superFun()
    obj4.subFun1()

    println("상위->서브........")
//    val obj5: Sub1 = Super() as Sub1 //런타임 에러
//    obj5.subFun1()

    println("서브->서브........")
//    val obj6: Sub2 = Sub1() as Sub2// 런타임 에러



}