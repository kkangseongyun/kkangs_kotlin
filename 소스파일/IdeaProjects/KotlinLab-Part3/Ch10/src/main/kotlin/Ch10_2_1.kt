package ten_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface {
    var data1: String
    fun myFun1() {
        //..............
    }
    fun myFun2()
}

class MyClass: MyInterface {
    override var data1: String = "hello"
    override fun myFun2() {
        //.............
    }
}

fun main(args: Array<String>) {
//    val obj=MyInterface()//error
    val obj1=MyClass()
    obj1.myFun1()
    obj1.myFun2()
}