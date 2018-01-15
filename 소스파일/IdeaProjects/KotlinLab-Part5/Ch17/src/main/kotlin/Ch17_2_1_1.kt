package seventeen_two_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface1
interface MyInterface2

class MyHandler1: MyInterface1, MyInterface2

class MyHandler2: MyInterface1

class  MyClass<T> where T: MyInterface1, T: MyInterface2{
    //..............
}

fun main(args: Array<String>) {
    val obj = MyClass<MyHandler1>()

//    val obj2 = MyClass<MyHandler2>()//error
}