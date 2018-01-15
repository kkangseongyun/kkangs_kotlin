package twelve_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

typealias MyType = (Int) -> Boolean

fun main(args: Array<String>) {

    //함수 타입..................
    val name: String = "kkang"
    val no: Int = 10

    fun myFun(x1: Int, x2: Int): Boolean {
        return x1 > x2
    }

    val lambdaFun: (Int) -> Int = { x: Int -> x * 10 }


    //typealias~~~~~~~~~~~
    val myFun: MyType = { it > 10 }


    //타입 추론에 의한 생략~~~~~~~~~~~~~~~~~~~~~~~
//    val lambdaFun1 =  { x -> x * 10 }//error

    val lambdaFun2: (Int) -> Int = { x -> x+ 10 }

}


