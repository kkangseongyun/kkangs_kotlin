package eighteen_one_three_four

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val myVal: Int = 10

var myVar: Int = 10

val referenceVal1: KProperty<*> = ::myVal

val referenceVal2: KProperty<*> = ::myVar

//val referenceVal3: KMutableProperty<*> = ::myVal//error

val referenceVal4: KMutableProperty<*> = ::myVar

fun main(args: Array<String>) {
    println(::myVal.get())

    ::myVar.set(30)
    println(::myVar.get())
}