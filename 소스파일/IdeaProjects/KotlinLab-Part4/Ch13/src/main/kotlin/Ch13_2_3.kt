/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
inline fun inlineTest2(argFun: (x: Int, y: Int) -> Int): Int{
    return argFun(10, 0)
}

fun callFun() {
    println("callFun.. top")
    val result = inlineTest2 { x, y  ->
        if( y <= 0) return
        x / y
    }
    println("$result")
    println("callFun.. bottom")
}

open class TestClass {
    open fun some() {}
}
inline fun inlineTest3(crossinline argFun: () -> Unit){
    val obj = object : TestClass() {
        override fun some() = argFun()
    }
}

fun crossInlineTest(){
    println("aaa")
    inlineTest3 {
        //        return//error
    }
}

fun main(args: Array<String>) {
    callFun()


}