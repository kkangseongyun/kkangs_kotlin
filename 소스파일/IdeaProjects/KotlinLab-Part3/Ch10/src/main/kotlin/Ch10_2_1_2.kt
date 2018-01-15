package ten_two_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface4 {
    fun myFun4()
}
interface MyInterface5 {
    fun myFun5()
}

class MyClass4: MyInterface4, MyInterface5 {
    override fun myFun4() { }
    override fun myFun5() { }
}