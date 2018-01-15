package six_three_nine

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    var sum=0
    for(i in 1..10){
        sum += i
    }
    println(sum)

    println("5 in 1..10 : ${5 in 1..10}")
}