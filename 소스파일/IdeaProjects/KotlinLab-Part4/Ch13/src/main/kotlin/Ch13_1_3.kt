/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    //함수 리턴~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    fun hoFun5(str: String): (x1: Int, x2: Int) -> Int {
        when (str){
            "-" -> return { x1, x2 -> x1 - x2 }
            "*" -> return { x1, x2 -> x1 * x2 }
            "/" -> return { x1, x2 -> x1 / x2 }
            else -> return { x1, x2 -> x1 + x2 }
        }
    }

    val resultFun=hoFun5("*")
    println("result * : ${resultFun(10, 5)}")
}


