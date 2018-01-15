package eight_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class User1 {
    lateinit var lateData: String
}

//lateinit error
//lateinit var data1: String//error
//
//class User2(lateinit var data: String) {//error
//    lateinit val data2: String//error
//    lateinit var data3: String?//error
//    lateinit var data4: Int//error
//    lateinit var data5: String//ok
//}

fun main(args: Array<String>) {
    //lateinit
    val user=User1()
    user.lateData="hello"
    println(user.lateData)
}