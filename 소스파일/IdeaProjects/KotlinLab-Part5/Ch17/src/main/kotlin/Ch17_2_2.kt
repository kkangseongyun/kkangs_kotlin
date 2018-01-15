package seventeen_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MyClass<T> {
    fun myFun(arg1: T, arg2: T){
        println(arg1?.equals(arg2))
    }
}

fun main(args: Array<String>) {
    val obj = MyClass<String>()
    obj.myFun("hello", "hello")

    val obj2 = MyClass<Int?>()
    obj2.myFun(null, 10)
}