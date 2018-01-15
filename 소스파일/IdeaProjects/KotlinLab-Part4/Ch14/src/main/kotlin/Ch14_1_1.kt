/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {
    val list2= listOf<Int>(12, 8, 9, 20)

    //forEach
    val resultList2=list2.filter { it > 10 }
    for(i in resultList2){
        println(i)
    }

    list2.filter { it > 10 }
            .forEach { println(it)}

    //forEachIndexed()
    listOf(1, 2, 3).forEachIndexed { index, value -> println("index : $index, value : $value")  }


}