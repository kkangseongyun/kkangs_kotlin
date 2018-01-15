package nineteen_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

typealias MyInt = Int
typealias MList<T> = MutableList<T>
typealias MC = MyClass
typealias MI = MyInterface

interface MyInterface
class MyClass: MI

typealias MyType = (Int) -> Boolean
val myFun: MyType = { it > 10 }

class Super {
    inner class Sub

    fun getSubInsance(): MySub {
        return Sub()
    }
}

typealias MySub = Super.Sub

fun main(args: Array<String>) {
    val no: MyInt = 10
    val list: MList<String> = mutableListOf("hello","kkang")
    val obj: MC = MC()
}