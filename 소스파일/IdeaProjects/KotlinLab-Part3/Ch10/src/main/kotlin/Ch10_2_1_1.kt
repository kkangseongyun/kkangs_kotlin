package ten_two_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//인터페이스 상속으로 인터페이스 정의

interface MyInterface1 {
    fun myFun1()
}
interface MyInterface2 {
    fun myFun2()
}

interface MyInterface3: MyInterface1, MyInterface2 {
    fun myFun3()
}

class MyClass1: MyInterface3 {
    override fun myFun1() { }
    override fun myFun2() { }
    override fun myFun3() { }
}