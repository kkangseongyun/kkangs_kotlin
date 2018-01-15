package eighteen_one_two_three

import kotlin.reflect.KClass
import kotlin.reflect.full.*

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class SuperClass {
    fun superFun(){ }
}

class MyClass: SuperClass() {

    fun myFun() { }

    fun String.someFun() { }
}

fun someFun(arg: KClass<*>){
    println("declaredMemberFunctions.........")
    val functions = arg.declaredMemberFunctions
    for(function in functions){
        println("${function.name}: ${function.returnType} ")
    }

    println("memberFunctions.....")
    val functions2 = arg.memberFunctions
    for(function in functions2){
        println("${function.name}: ${function.returnType} ")
    }

    println("declaredMemberExtensionFunctions...........")
    val functions3 = arg.declaredMemberExtensionFunctions
    for(function in functions3){
        println("${function.name}: ${function.returnType} ")
    }
}

fun main(args: Array<String>) {
    someFun(MyClass::class)
}