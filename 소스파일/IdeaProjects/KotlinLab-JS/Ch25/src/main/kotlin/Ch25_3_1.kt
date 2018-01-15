package twenty_five_three_one

import ch25_3_3
import kotlin.browser.document

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

data class User(val no: Int, val name: String)

fun ch25_3_1(){
    val obj = User(10, "kkang")

    val resultDom= document.getElementById("result_3_1_dynamic_1")
    resultDom?.innerHTML="no : ${obj.no}, name : ${obj.name}"

    //dynamic test~~~~~~~~~~~~~~~~
    fun dynFun(arg: dynamic): dynamic{
        return 10
    }

    var dynData: dynamic = 10
    dynData = "hello"

    dynFun(10)
    dynFun(true)

    //js 코드를 코틀린으로
    var data1: dynamic = 10
    data1="kkang"

    var resultDom2= document.getElementById("result_3_1_dynamic_2")
    resultDom2?.innerHTML="data1 : $data1"

    //null check
    val myData2: dynamic = null
    val myData3: dynamic? = null
    val myData4: dynamic? = 10

    //실제 존재하지 않는 멤버 접근도 가능해 진다.
//    myData2.a1=10
//    myData2.aaa(10, "hello")
}


fun main(args: Array<String>) {
    ch25_3_1()

    ch25_3_3()
}
