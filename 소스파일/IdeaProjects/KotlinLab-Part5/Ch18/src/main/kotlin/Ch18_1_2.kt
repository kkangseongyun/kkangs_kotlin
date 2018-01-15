package eighteen_one_two

import kotlin.reflect.KClass

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class MyClass

fun someFun(arg: KClass<*>){
    println("class info...........")
    println("isAbstract : ${arg.isAbstract}")
    println("isCompanion : ${arg.isCompanion}")
    println("isData : ${arg.isData}")
    println("isFinal : ${arg.isFinal}")
    println("isInner : ${arg.isInner}")
    println("isOpen : ${arg.isOpen}")
    println("isSealed : ${arg.isSealed}")
}

fun main(args: Array<String>) {
    someFun(MyClass::class)
}
