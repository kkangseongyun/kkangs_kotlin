package twelve_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun sum(x1: Int, x2: Int): Int {
    return x1+x2
}

val sum1={ x1: Int , x2: Int -> Unit }

val sum2 = { 10 + 20 }

val sum3 = { x1:Int, x2: Int ->
    println("call sum3()....")
    x1 + x2
}

fun main(args: Array<String>) {
    val result=sum(10, 20)
    val result1=sum1(10, 20)
    println("result.. $result1")
    println("sum2() ${sum2()}")

    val result3=sum3(10, 20)
    println(result3)

    //람다함수 정의후 바로 호출
    test()
}
fun test() {
    { println("hello")}()
    run { println("world") }
}