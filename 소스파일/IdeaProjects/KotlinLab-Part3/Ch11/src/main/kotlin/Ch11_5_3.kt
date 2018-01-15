package eleven_five_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class NormalClass {
    fun myFun(){ }
}

object ObjectClass {
    fun myFun() { }
}

fun main(args: Array<String>) {
    val obj1: NormalClass = NormalClass()
    val obj2: NormalClass = NormalClass()
    obj1.myFun()

//    val obj3: ObjectClass = ObjectClass()//error

    ObjectClass.myFun()
}
