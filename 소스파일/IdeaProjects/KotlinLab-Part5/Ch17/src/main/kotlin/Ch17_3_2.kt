package seventeen_three_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super

class Sub: Super()

class MyClass<out T>

fun main(args: Array<String>) {
    val obj = MyClass<Sub>()
    val obj2: MyClass<Super> =  obj

    val obj3 = MyClass<Super>()
//    val obj4: MyClass<Sub> = obj3//error
}
