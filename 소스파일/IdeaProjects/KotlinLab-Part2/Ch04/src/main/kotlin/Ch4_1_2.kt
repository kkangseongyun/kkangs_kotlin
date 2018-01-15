package four_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val topData1: Int = 10
var topData2: Int = 20

class User {
    val objData1: String = "hello"
    var objData2: String = "world"

    fun some(){
        val localData1: Int
        var localData2: String

        localData1=40
        println(localData1)

        localData2="hello"
        println(localData2)
    }
}
