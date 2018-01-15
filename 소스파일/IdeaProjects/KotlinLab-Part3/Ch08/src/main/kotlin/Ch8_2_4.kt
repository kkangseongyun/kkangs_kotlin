package eight_two_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val someData: String by lazy {
    println("i am someData lazy...")
    "hello"
}
class User1 {

    val name: String by lazy {
        println("i am name lazy...")
        "kkang"
    }
    val age: Int by lazy {
        println("i am age lazy...")
        10
    }

    init {
        println("i am init...")
    }
    constructor(){
        println("i am constructor...")
    }

}

fun main(args: Array<String>) {

    val user1=User1()
    println("name use before...")
    println("name : ${user1.name}")
    println("name use after....")
    println("age use before...")
    println("age : ${user1.age}")
    println("age use after....")

}