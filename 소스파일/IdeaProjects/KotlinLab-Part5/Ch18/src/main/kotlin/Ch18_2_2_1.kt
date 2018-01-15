package eighteen_two_two_one

import kotlin.reflect.KClass

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

annotation class TestAnnotation1(val count: Int)

annotation class TestAnnotation2(val otherAnn: TestAnnotation1, val arg1: KClass<*>)

class User

//annotation class TestAnnotation3(val user: User)//error

@TestAnnotation1(10)
@TestAnnotation2(TestAnnotation1(20), String::class)
class Test { }

const val myData: Int = 10
@TestAnnotation1(myData)
class Test2 { }