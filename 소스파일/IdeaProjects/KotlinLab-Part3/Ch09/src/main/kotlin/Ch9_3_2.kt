package nine_three_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super {
    constructor(name: String, no: Int){
        println("Super ... constructor(name, no)")
    }
    init {
        println("Super ... init call....")
    }
}
class Sub(name: String): Super(name, 10){
    constructor(name: String, no: Int): this(name){
        println("Sub ... constructor(name, no) call")
    }
    init {
        println("Sub ... init call....")
    }
}

fun main(args: Array<String>) {

    Sub("kkang")
    println("...................................")
    Sub("kkang",10)
}