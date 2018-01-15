package ten_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//추상 클래스 만들고 하위에서 오버라이드에 의해 재정의
abstract class Super {
    val data1: Int = 10
    abstract val data2: Int

    fun myFun1() {

    }
    abstract fun myFun2()
}

class Sub: Super() {
    override val data2: Int = 10
    override fun myFun2() {

    }
}

fun main(args: Array<String>) {
//    val obj1=Super()//error
    val obj2=Sub()
}