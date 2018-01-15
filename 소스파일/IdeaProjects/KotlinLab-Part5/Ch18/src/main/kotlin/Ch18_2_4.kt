package seven_five

import test.JavaAnnotation
import test.JavaAnnotation2
import test.JavaAnnotation3

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

annotation class KotlinAnnotation(val no: Int, val name: String)

@KotlinAnnotation(10, "kkang")
//@JavaAnnotation(10, "kkang")//error
@JavaAnnotation(intValue = 10, stringValue = "kkang")
@JavaAnnotation2(10, strValue = "kkang")
@JavaAnnotation3(10, 20, strVale = arrayOf("kkang", "kim"))
class Test { }


