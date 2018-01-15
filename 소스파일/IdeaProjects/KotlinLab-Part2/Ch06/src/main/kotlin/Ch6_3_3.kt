package six_three_three

import java.util.Arrays.asList

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(vararg a: String){
    val iterator=a.iterator()
    while(iterator.hasNext()){
        println(iterator.next())
    }
}

fun main(args: Array<String>) {
    val array1= arrayOf(10, 20, 30)

    val list1= asList(1, 2, array1[0], array1[1], array1[2], 100, 200)
    list1.forEach({println(it)})

    val list2=asList(1, 2, *array1, 100, 200)
    list2.forEach({println(it)})

    val array3= arrayOf<String>("hello","world")
    some(*array3)

    val list3= listOf<String>("a","b")
    some(*list3.toTypedArray())

}