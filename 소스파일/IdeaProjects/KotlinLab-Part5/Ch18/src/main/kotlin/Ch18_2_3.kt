@file: JvmName("MyTest")
package eighteen_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

annotation class TestAnnotation

annotation class TestAnnotation2

class Test constructor(@param: TestAnnotation var email: String){

    @get:[TestAnnotation TestAnnotation2]
    var no: Int=10

    @property: TestAnnotation
    var name: String = "kkang"

    @field: TestAnnotation
    var age: Int = 30

    @setparam: TestAnnotation
    var phone: String= "0100000"
}
fun @receiver: TestAnnotation Test.myFun(){ }
