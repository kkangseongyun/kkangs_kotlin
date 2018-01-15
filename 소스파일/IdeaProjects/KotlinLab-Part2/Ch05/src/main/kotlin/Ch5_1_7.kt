package five_one_seven

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun getStringLength(obj: Any): Int? {
//    val strData: String = obj//error
    if (obj is String) {
        return obj.length
    }
    return null
}
fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}


fun main(args: Array<String>) {
    var a1: Int =10
    var a2 : Double = a1.toDouble()//ok~~

    val l = 1L + 3 // Long + Int => Long

//    var intData=10
//    var doubleData: Double = intData as Double




}