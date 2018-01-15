package eighteen_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

annotation class TestAnnotation

class Test {

    @TestAnnotation
    fun myFun1() { }

    fun myFun2() { }
}

fun main(args: Array<String>) {

    val methods = Test::class.java!!.methods

    for(method in methods){
        val methodName = method.name
        if(method.isAnnotationPresent(TestAnnotation::class.java)){
            println("$methodName function has TestAnnotation annotation...")
        }
    }
}