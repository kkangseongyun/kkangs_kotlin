package four_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */


val data1: Int = 10
val data2 = 20
var data3 = 30

fun main(args: Array<String>) {
//    data2 = 40//error
    data3=40//ok~~~~

    val obj=Test()
    obj.some()
    println(obj.myVal)
}

class Test {
    final var myVal=10

    fun some(){
        myVal=30
    }
}