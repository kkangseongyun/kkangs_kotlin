package nine_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super {
    open val name: String = "kkang"
    open var age: Int = 10
    open val email: String?=null
    open val address: String="seoul"
}
open class Sub: Super() {
    final override var name: String = "kim"//ok~~
    //    override val age: Int = 20//error
    override val email: String = "a@a.com"//ok~~~
//    override val address: String? = null//error
}
class Sub2: Sub() {
//    override var name: String = "lee"//error
}
