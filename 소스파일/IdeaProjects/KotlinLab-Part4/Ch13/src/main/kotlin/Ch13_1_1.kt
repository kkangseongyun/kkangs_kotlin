
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    fun normalFun(x1: Int, x2: Int): Int{
        return x1 + x2
    }

    fun hoFun(x1: Int, argFun: (Int) -> Int){
        val result=argFun(10)
        println("x1 : $x1, someFun1 : $result")
    }

    hoFun(10, {x -> x * x })

}


