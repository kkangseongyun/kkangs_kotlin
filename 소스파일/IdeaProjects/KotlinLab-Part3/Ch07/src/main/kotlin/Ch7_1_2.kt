package seven_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MyClass {
    var name: String="world"

    fun sayHello(){
        println("hello $name")
    }
}

fun main(args: Array<String>) {
    val obj1=MyClass()
    val obj2=MyClass()

    obj1.name="kkang"
    obj2.name="kim"

    obj1.sayHello()
    obj2.sayHello()
}