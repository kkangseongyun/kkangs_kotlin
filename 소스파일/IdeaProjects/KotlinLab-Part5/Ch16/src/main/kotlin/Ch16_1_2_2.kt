package sixteen_one_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super

class Sub : Super()

fun Super.sayHello(){
    println("Super..sayHello()")
}
fun Sub.sayHello(){
    println("Sub..sayHello()")
}

fun some(obj: Super){
    obj.sayHello()
}

fun main(args: Array<String>) {
    some(Sub())
}

