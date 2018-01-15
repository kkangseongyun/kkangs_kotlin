package twenty_five_four_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val someVal="someVal.."

fun someFun(){
    println("someFun call....")
}
@JsName("helloFun")
fun someFun2(arg: String){
    println("someFun2 call... $arg")
}

@JsName("helloVal")
val someVal2="someVal2"

@JsName("HelloClass")
class SomeClass {
    @JsName("helloClassFun")
    fun someClassFun(){
        println("someFun call....")
    }
}

