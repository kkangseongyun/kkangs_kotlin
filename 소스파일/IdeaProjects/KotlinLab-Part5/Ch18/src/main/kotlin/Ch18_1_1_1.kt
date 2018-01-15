package eighteen_one_one_one

import kotlin.reflect.KClass

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val myVal: KClass<String> = String::class

//val myVal2: KClass<String> = Double::class//error

val myVal3: Class<*> = String::class.java


