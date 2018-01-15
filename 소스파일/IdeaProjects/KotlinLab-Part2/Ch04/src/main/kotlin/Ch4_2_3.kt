package four_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun sayHello(name: String = "kkang", no: Int){
    println("Hello!!"+name)
}
fun main(args: Array<String>) {
//    sayHello(10)//error
    sayHello("lee", 20)
    sayHello(no=10)
    sayHello(name="kim", no=10)
}

