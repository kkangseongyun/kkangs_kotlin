/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun closureTest(x: Int): (Int)->Int{
    println("argument $x")
    return { it * x }
}

fun closureTest2(): (Int)-> Unit{
    var sum=0
    return {
        for(i in 1..it){
            sum += i
        }
    }
}



fun main(args: Array<String>) {
    val someFun1= closureTest(2)
    val someFun2= closureTest(3)

    println("${someFun1(10)}")
    println("${someFun2(10)}")

    val someFun3=closureTest2()

    someFun3(5)

}