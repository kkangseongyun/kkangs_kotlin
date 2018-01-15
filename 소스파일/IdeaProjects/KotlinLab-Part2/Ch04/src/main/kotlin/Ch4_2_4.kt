package four_two_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

infix fun Int.myFun(x: Int): Int {
    return x * x
}
class FunClass {
    infix fun infixFun(a: Int){
        println("infixFun call....")
    }
}
fun main(args: Array<String>) {
    val obj=FunClass()
    obj.infixFun(10)

    obj infixFun 10

    println(10 myFun 10)
    println(10.myFun(10))
}
