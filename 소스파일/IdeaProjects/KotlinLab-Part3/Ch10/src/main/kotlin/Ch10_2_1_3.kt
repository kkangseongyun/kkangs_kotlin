package ten_two_one_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface6 {
    fun myFun6()
}
interface MyInterface7 {
    fun myFun7()
}
open class Super {

}
class Sub: MyInterface6, Super(), MyInterface7 {
    override fun myFun6() { }
    override fun myFun7() { }
}