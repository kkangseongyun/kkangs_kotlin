package twenty_six_one_three
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@JsName("$")
external fun jQuery(selector: String): dynamic

fun testJQuery(){
    jQuery("#result_3_1").text("hello jQuery")
}

fun Ch26_1_3(){
    testJQuery()
}