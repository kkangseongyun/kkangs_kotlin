package nineteen_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class Test {
    var sum: Int = 0
        get() = field
        set(value) {
            field=0
            for(i in 1..value){
                field += i
            }
        }
}

fun main(args: Array<String>) {
    val obj: Test = Test()
    obj.sum=10
    println(obj.sum)
    obj.sum=5
    println(obj.sum)
}