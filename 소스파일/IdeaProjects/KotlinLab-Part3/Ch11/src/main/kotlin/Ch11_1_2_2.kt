package eleven_one_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

data class User(val name: String, val age: Int)

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val user=User("kkang", 20)
    val person=Person("kkang", 20)

    println(user.equals(person))
}