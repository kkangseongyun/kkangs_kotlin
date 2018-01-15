package six_three_five

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    var data=10
    var result1 = data++
    println("result=$result1, data=$data")

    var data2=10
    var result2=data2
    data2=data2+1
    println("result2=$result2, data2=$data2")

    var data3=10
    var result3 = ++data3
    println("result3=$result3, data3=$data3")

    var data4=10
    data4 = data4 + 1
    var result4=data4
    println("result4=$result4, data4=$data4")
}