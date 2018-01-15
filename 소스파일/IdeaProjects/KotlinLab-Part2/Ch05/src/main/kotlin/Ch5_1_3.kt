package five_one_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun getLength(obj : Any) : Int {
    if(obj is String) {
        return obj.length
    }
    return 0
}

fun cases(obj : Any): String{
    when(obj) {
        1 -> return "One"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a string"
        else -> return "unknown"
    }
}

fun main(args: Array<String>) {
    println(getLength("Hello"))
    println(getLength(10))

    println(cases(1))
    println(cases(10))
}