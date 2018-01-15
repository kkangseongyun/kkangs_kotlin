package seventeen_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MyClass<T> {
    var info: T? = null
}

class MyClass2<T>(no: T){
    var info: T? = null
}

class MyClass3<AA> {
    var info: AA? = null
}

fun main(args: Array<String>) {
    val obj1=MyClass<String>()
    obj1.info="hello"

    val obj2=MyClass<Int>()
    obj2.info=10

    val obj3=MyClass2<Int>(10)
    obj3.info=20

    val obj4=MyClass2("hello")
    obj4.info="world"
}