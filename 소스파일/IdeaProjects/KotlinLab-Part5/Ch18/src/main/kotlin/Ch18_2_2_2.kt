package eighteen_two_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
annotation class TestAnnotation

@TestAnnotation
class Test {
//    @TestAnnotation constructor(no: Int){}//error

//    @TestAnnotation//error
    val myVal: Int = 10

    @TestAnnotation
    fun myFun(@TestAnnotation no: Int) {
        val result = @TestAnnotation if (no>10){
            10
        }else {
            0
        }
    }
}