package eight_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class User {
    var name: String = "kkang"
        get() = field
        set(value) {field=value}

    val age: Int = 20
        get() = field
}

fun main(args: Array<String>) {
    val user=User()

    user.name="kim"
    println("name : ${user.name}")
    println("age : ${user.age}")
}