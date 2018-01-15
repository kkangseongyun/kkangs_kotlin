/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {

    val list2= listOf<Int>(12, 8, 9, 20)

    val resultList=ArrayList<Int>()
    for(i in list2){
        if(i>10) resultList.add(i)
    }
    for(i in resultList){
        println(i)
    }

    val resultList2=list2.filter { it > 10 }
    for(i in resultList2){
        println(i)
    }



    val map2= mapOf<String, Int>("one" to 15, "two" to 5)
    val resultMap2=map2.filter { entry -> entry.value > 10 }
    for(i in resultMap2){
        println(i)
    }

}