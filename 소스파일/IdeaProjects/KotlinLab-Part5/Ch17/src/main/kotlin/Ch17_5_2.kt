package seventeen_five_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

inline fun <reified T> some(arg: Any){
    if(arg is T){
        println("true")
    }else {
        println("false")
    }
}

fun main(args: Array<String>) {
    some<String>("hello")
    some<Int>("hello")
}