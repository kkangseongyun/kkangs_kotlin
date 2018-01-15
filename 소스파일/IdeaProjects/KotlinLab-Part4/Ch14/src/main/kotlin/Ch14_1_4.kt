/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    //fold, reduce, foldRight
    var result=listOf(1, 2).fold(10, { total, next ->
        println("$total ... $next")
        total + next
    })
    println("fold test : $result")

    result=listOf(1, 11, 5).fold(10) { max, next ->
        if (next > max) next else max
    }
    println("fold test : $result")

    result=listOf(1, 2, 3).foldRight(4) { next, total ->
        println("$total ... $next")
        total + next }
    println("foldRight test : $result")

    result=listOf(1, 2, 3).reduce { sum, next -> sum + next }
    println("reduce test : $result")


}