package sixteen_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Test {
    val classData: Int = 0
}

//val Test.extensionData1: Int = 0//error

val Test.extensionData2: Int
    get() = 10

fun main(args: Array<String>) {
    val obj=Test()
    println("classData ${obj.classData} ... extensionData2 : ${obj.extensionData2}")
}