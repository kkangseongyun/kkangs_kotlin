package seventeen_four_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//class MyClass<*>//error

class MyClass2<T>

fun myFun(arg: MyClass2<*>){ }


fun main(args: Array<String>) {
//    val list2: MutableList<Any?> = mutableListOf<Any>(10, 10.0, "kkang")//error
//    list2.forEach{ println(it)}

    val list3: MutableList<*> = mutableListOf<Any>(10, 10.0, "kkang")
    list3.forEach{ println(it)}
}