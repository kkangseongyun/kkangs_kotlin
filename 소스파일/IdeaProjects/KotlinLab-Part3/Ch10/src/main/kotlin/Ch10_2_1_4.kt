package ten_two_one_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface10 {
    fun myInterfaceFun()
}

open class Super1 {
    fun mySuperFun(){
        println("mySuperFun()....")
    }
}

class Sub1: Super1(), MyInterface10 {
    override fun myInterfaceFun() {
        println("myInterfaceFun cal....")
    }
}

fun main(args: Array<String>) {
    val obj1: Sub1 = Sub1()
    val obj2: Super1 = Sub1()
    val obj3: MyInterface10 = Sub1()

    //Sub1 타입 객체 이용........
    obj1.mySuperFun()
    obj1.myInterfaceFun()

    //Super1 타입 객체 이용......
    obj2.mySuperFun()
//    obj2.myInterfaceFun()//error

    //"MyInterface10 타입 객체 이용......"
//    obj3.mySuperFun()//error
    obj3.myInterfaceFun()
}