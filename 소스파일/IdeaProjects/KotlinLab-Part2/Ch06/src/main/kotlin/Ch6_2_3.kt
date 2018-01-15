package six_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    var x2=0
    var sum2=0
    while(true){
        sum2 += ++x2
        if(x2==10) break
    }
    println(sum2)

    aaa@ for (i in 1..3) {
        for (j in 1..3) {
            if (j>1) break@aaa
            println("i : $i , j : $j")
        }
    }
}