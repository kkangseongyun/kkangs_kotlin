package nine_five_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//top-level시 접근제한자
val myData1: Int = 10

private val myData2: String = "hello"

class MyClass1() { }

private class MyClass2() { }

fun myFun1() {
    println("myFun() call..")
}

private fun myFun2(){
    println("myFun() call..")
}

//class 구성요소의 접근제한
open class Super {
    val publicData: Int = 10
    protected val protectedData: Int = 10
    private val privateData: Int = 10
}
class Sub: Super() {
    fun visibilityTest() {
        println("$publicData .. ")
        println("$protectedData ..")
//        println("$privateData ..")//error
    }
}

class SomeClass {
    fun visibilityTest() {
        val obj=Super()
        println("${obj.publicData} .. ")
//        println("${obj.protectedData} ..")//error
//        println("${obj.privateData} ..")//error
    }
}

fun main(args: Array<String>) {
    //top-level시 접근제한자
    println("$myData1 .. ")
    println("$myData2 .. ")
    val obj1=MyClass1()
    val obj2=MyClass2()
    myFun1()
    myFun2()
}