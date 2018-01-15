package nine_five_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class PropertyVisibilityTest {
    private var data: Int = 10

    fun getData(): Int {
        return data
    }
}
class PropertyVisibilityTest2 {
    internal var data: Int = 10
        private set(value) {
            field=value
        }
}

class ConstructorVisibilityTest private constructor(name: String) {
    public constructor(name: String, no: Int): this(name){ }
}

fun main(args: Array<String>) {
    val obj=PropertyVisibilityTest()
    println("${obj.getData()}")

    val obj2=PropertyVisibilityTest2()
    println("${obj2.data}")
//    obj2.data=20//error

}