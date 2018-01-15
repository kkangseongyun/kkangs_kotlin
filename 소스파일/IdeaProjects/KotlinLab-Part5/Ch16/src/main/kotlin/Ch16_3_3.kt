package sixteen_three_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class ExtensionClass {
    fun myFun() {
        println("ExtensionClass myFun()")
    }
}

class DispatchClass {
    fun myFun() {
        println("DispatchClass myFun()")
    }

    fun ExtensionClass.some() {
        myFun()
        this.myFun()
        this@DispatchClass.myFun()
    }

    fun test() {
        val obj: ExtensionClass = ExtensionClass()
        obj.some()
    }
}

fun main(args: Array<String>) {
    val obj: DispatchClass = DispatchClass()
    obj.test()
}