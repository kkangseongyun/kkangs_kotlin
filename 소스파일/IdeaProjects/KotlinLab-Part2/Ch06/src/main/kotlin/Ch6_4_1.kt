package six_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

data class MyClass(val no: Int){
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

operator fun MyClass.minus(arg: Int): Int{
    return no + arg
}

class Test(val no: Int) {
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

fun main(args: Array<String>) {
    val obj: MyClass = MyClass(10)

    val result1 = obj + 5
    val result2 = obj - 5

    println("result1 : $result1 .. result2 : $result2")

    println("${Test(30) + 5}")
}