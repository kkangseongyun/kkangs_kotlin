/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

inline fun inlineTest(argFun1: (x: Int) -> Int, noinline argFun2: (x: Int) -> Int){
    argFun1(10)
    argFun2(10)
}


fun main(args: Array<String>) {

    inlineTest({it * 10}, {it * 20})


}