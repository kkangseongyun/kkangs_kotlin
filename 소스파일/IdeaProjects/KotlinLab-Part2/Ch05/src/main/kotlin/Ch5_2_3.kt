package five_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    val list1= listOf<String>("hello","list")
    val iterator1=list1.iterator()
    while (iterator1.hasNext()){
        println(iterator1.next())
    }

    val map= mapOf<String, String>("one" to "hello", "two" to "map")
    val iterator2: Iterator<Map.Entry<String, String>> = map.iterator()
    while (iterator2.hasNext()){
        val entry=iterator2.next()
        println("${entry.key} - ${entry.value}")
    }

    val set= setOf<String>("hello","set")
    val iterator3=set.iterator()
    while (iterator3.hasNext()){
        println("${iterator3.next()}")
    }

    val array= arrayOf("hello","world")
    val iterator4=array.iterator()
    while (iterator4.hasNext()){
        println("${iterator4.next()}")
    }
}