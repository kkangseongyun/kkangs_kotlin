package eight_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class User {
    var data: String
    val data2: Int

    init {
        data="kkang"
        data2=10
    }
}

fun main(args: Array<String>) {
    val user=User()
    println("data: ${user.data}")
    println("data2 : ${user.data2}")
}