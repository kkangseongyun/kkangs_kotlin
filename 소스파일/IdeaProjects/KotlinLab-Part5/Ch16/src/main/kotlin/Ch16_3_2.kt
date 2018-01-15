package sixteen_three_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class ExtensionClass {
    fun some1() {
        println("ExtensionClass some1()")
    }
}

class DispatchClass {
    fun dispatchFun() {
        println("DispatchClass dispatchFun()")
    }

    fun ExtensionClass.some2() {
        some1()
        dispatchFun()
    }

    fun test() {
        val obj: ExtensionClass = ExtensionClass()
        obj.some1()
        obj.some2()
    }
}

fun main(args: Array<String>) {
    val obj: ExtensionClass = ExtensionClass()
    obj.some1()
//    obj.some2()//error
}
