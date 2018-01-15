package five_two_two_one

import java.util.ArrayList
import java.util.HashSet
import java.util.HashMap

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    val javaList: ArrayList<String> = ArrayList()
    javaList.add("hello")
    javaList.add("world")
    println("${javaList.get(0)} .. ${javaList.get(1)}")

    val javaMap: HashMap<String, String> = HashMap()
    javaMap.put("one", "hello")
    javaMap.put("two", "world")
    println("${javaMap.get("one")} .. ${javaMap.get("two")}")

    val javaSet: HashSet<String> = HashSet()
    javaSet.add("hello")
    javaSet.add("hello")
    javaSet.add("world")
    println("${javaSet.size} .. ${javaSet.elementAt(0)} .. ${javaSet.elementAt(1)}")
}