package eighteen_one_two_one

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class MyClass(no: Int) {
    constructor(no: Int, name: String): this(10){}
    constructor(no: Int, name: String, email: String): this(10){ }
}

fun someFun(arg: KClass<*>){
    val constructors = arg.constructors
    for(constructor in constructors){
        print("constructor...... ")
        val parameters = constructor.parameters
        for(parameter in parameters){
            print("${parameter.name}: ${parameter.type} .. ")
        }
        println()
    }

    print("primary constructor.....")
    val primaryConstructor=arg.primaryConstructor
    if(primaryConstructor != null){
        val parameters = primaryConstructor.parameters
        for(parameter in parameters){
            print("${parameter.name}: ${parameter.type} .. ")
        }
    }
}

fun main(args: Array<String>) {
    someFun(MyClass::class)
}
