package eighteen_one_three_one

import kotlin.reflect.KFunction

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun myFun(no: Int, name: String): Boolean {
    return true
}

fun reflectionFun(argFun: KFunction<*>) {
    print("${argFun.name}")
    val parameters = argFun.parameters
    print("(")
    for (parameter in parameters) {
        print("${parameter.name}: ${parameter.type} ")
        if (parameter.index < parameters.size - 1)
            print(",")
    }
    print("): ")
    print("${argFun.returnType}")
}

fun main(args: Array<String>) {
    reflectionFun(::myFun)
}