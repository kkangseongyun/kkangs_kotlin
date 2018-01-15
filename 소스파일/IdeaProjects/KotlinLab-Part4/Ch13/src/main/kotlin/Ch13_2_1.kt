/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
inline fun hoFunTest(argFun: (x1: Int, x2: Int) -> Int){
    argFun(10, 20)
}

fun main(args: Array<String>) {
    hoFunTest { x1, x2 -> x1 + x2 }


}