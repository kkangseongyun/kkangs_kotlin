package seventeen_four_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(array: MutableList<Int>){
    array.add(10)
}
fun some1(array: MutableList<out Any?>){
//    array.add(10)//error
}
fun some2(array: MutableList<*>){
//    array.add(10)//error
}
fun main(args: Array<String>) {

    val list1 = mutableListOf<Int>(10, 20)
    some1(list1)

    val list2 = mutableListOf<Int>(10, 20)
    some2(list2)
}