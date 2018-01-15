package eighteen_two_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

annotation class TestAnnotation

class Test @TestAnnotation constructor(){
    @TestAnnotation
    val myVal: Int=10

    var myVal2: Int = 10
        @TestAnnotation set(value) { field = value }

    val myFun = @TestAnnotation{

    }
}