package eighteen_one_two_two

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class SuperClass {
    val superVal: Int = 10
}

class MyClass(val no: Int): SuperClass() {

    val myVal: String = "hello"

    val String.someVal: String
        get() = "world"
}

fun someFun(arg: KClass<*>){
    val properties = arg.declaredMemberProperties
    println("declaredMemberProperties")
    for(property in properties){
        println("${property.name}: ${property.returnType} ")
    }

    println("memberProperties.....")
    val properties2 = arg.memberProperties
    for(property in properties2){
        println("${property.name}: ${property.returnType} .. ")
    }

    println("declaredMemberExtensionProperties")
    val properties3 = arg.declaredMemberExtensionProperties
    for(property in properties3){
        println("${property.name}: ${property.returnType} .. ")
    }
}

fun main(args: Array<String>) {
    someFun(MyClass::class)
}
