package seventeen_three_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super {
    open fun sayHello() {
        println("i am super sayHello...")
    }
}

class Sub: Super(){
    override fun sayHello() {
        println("i am sub sayHello....")
    }
}

fun main(args: Array<String>) {
    val obj: Super = Sub()
    obj.sayHello()

    val obj2: Sub = obj as Sub
    obj2.sayHello()
}