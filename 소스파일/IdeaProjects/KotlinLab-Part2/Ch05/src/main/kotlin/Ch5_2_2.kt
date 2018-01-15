package five_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    val immutableList: List<String> = listOf("hello", "world")
    println("${immutableList.get(0)} .. ${immutableList.get(1)}")


    val mutableList: MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("kkang")
    mutableList.set(1, "korea")
    println("${mutableList.get(0)} .. ${mutableList.get(1)} .. ${mutableList.get(2)}")


    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("kkang")
    arrayList.set(1, "world")
    println("${arrayList.get(0)} .. ${arrayList.get(1)}")

    val immutableMap1= mapOf<String, String>(Pair("one","hello"), Pair("two", "world"))
    println("${immutableMap1.get("one")} .. ${immutableMap1.get("two")}")
    val immutableMap2= mapOf<String, String>("one" to "hello", "two" to "kkang")
    println("${immutableMap2.get("one")} .. ${immutableMap2.get("two")}")

    val mutableMap= mutableMapOf<String, String>()
    mutableMap.put("one", "hello")
    mutableMap.put("two","map")
    println("${mutableMap.get("one")} .. ${mutableMap.get("two")}")

    val immutableSet= setOf<String>("hello","hello","world")
    println("${immutableSet.elementAt(0)} .. ${immutableSet.elementAt(1)}")
    val mutableSet= mutableSetOf<String>()
    mutableSet.add("hello")
    mutableSet.add("set")
    println("${mutableSet.elementAt(0)} .. ${mutableSet.elementAt(1)}")
}