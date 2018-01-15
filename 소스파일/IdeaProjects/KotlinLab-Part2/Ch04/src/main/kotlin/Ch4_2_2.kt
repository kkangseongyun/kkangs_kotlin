package four_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(a: String){
    println("some(a: String) call....")
}
fun some(a: Int){
    println("some(a: Int) call....")
}
fun some(a: Int, b: String){
    println("some(a: Int, b: String) call....")
}
fun main(args: Array<String>) {
    some("hello")
    some(10)
    some(10, "hello")
}