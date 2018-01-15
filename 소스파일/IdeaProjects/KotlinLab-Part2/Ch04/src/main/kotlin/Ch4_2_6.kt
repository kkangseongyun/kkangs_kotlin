package four_two_six

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun loopPrint(no: Int = 1){
    var count=1
    while(true){
        println("loopPrint..")
        if(no == count) return
        else count++
    }
}

fun recPrint(no: Int = 1, count: Int = 1){
    println("recPrint...")
    return if(no==count) return else recPrint(no -1, count)
}

tailrec fun tailrecPrint(no: Int = 1, count: Int = 1){
    println("tailrecPrint...")
    return if(no==count) return else tailrecPrint(no -1, count)
}

tailrec fun sum(n: Int): Int {
    if (n <= 0) return n
    else return n + sum(n - 1)
}
tailrec fun sum2(n: Int, result: Int = 0): Int {
    if (n <= 0) return result
    else return sum2(n - 1, n + result)
}
fun main(args: Array<String>) {
    loopPrint(3)
    recPrint(3)
    tailrecPrint(3)

    println(sum(3))
    println(sum2(3))
}