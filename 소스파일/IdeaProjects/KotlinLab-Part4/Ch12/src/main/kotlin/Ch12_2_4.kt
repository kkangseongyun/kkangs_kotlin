package twelve_two_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    //member reference 활용~~~~~~~~~~~~~~~~~~~~
    class User(val name: String, val age: Int)
    //기본형
    val lambdas1: (User) -> Int = { user: User -> user.age}
    println("lambdas1 return : ${lambdas1(User("kkang", 33))}")
    //it의 활용
    val lambdas2: (User) -> Int = { it.age }
    println("lambdas2 return : ${lambdas2(User("kkang", 33))}")
    //member reference 활용
    val lambdas3: (User) -> Int = User::age
    println("lambdas3 return : ${lambdas3(User("kkang", 33))}")
}