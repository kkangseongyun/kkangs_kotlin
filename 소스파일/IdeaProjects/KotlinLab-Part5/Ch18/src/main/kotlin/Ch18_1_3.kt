package eighteen_one_three

import kotlin.reflect.KFunction

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun myFun(){ }

class MyClass {
    fun myFun2() { }
}

val funReference: KFunction<*> = ::myFun

val funReference2: KFunction<*> = MyClass::myFun2