package eleven_one_two_seven

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    var user=User(age=30, name="kkang")
    println(user.toString())

    var user2=user.copy(name="kim")
    println(user2.toString())
}

