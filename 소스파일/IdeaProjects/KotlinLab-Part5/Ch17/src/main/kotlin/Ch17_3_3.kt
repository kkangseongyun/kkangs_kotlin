package seventeen_three_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super

class Sub: Super()

class MyClass<in T>() {

//    val myVal: T? = null//error
//    var myVal2: T? = null//error

//    fun myFun(): T? {//error
//        return null
//    }
    fun myFun3(arg: T) { }
}

fun main(args: Array<String>) {
    val obj = MyClass<Sub>()
//    val obj2: MyClass<Super> =  obj//error

    val obj3 = MyClass<Super>()
    val obj4: MyClass<Sub> = obj3
}
