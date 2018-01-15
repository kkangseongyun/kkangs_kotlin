package five_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val intData : Int = 10
val result=intData.minus(5)

val a3: Byte=0b00001011
val a4: Int=123
val a5: Int=0x0F
val a6: Long = 10L
val a7: Double=10.0
val a8: Double=123.5e10
val a9: Float=10.0f

val oneMillion: Int = 1_000_000

fun main(args: Array<String>) {
    println(result)
    println(oneMillion)
}