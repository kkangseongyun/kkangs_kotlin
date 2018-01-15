package nine_four_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun smartCast(data: Any): Int{
    if(data is Int) return data*data
    else return 0
}

class MyClass1 {
    fun fun1(){
        println("fun1()...")
    }
}
class MyClass2 {
    fun fun2(){
        println("fun2()...")
    }
}
fun smartCast2(obj: Any){
    if(obj is MyClass1) obj.fun1()
    else if(obj is MyClass2) obj.fun2()
}


open class Super

class Sub1: Super()

fun main(args: Array<String>) {

    val data1: Int = 10
    val data2: Double = data1.toDouble()


    println("result : ${smartCast(10)}")
    println("result : ${smartCast(10.0)}")


    smartCast2(MyClass1())
    smartCast2(MyClass2())


    val obj1: Super = Sub1()

//    val obj2: Sub1 = Super()//error
}