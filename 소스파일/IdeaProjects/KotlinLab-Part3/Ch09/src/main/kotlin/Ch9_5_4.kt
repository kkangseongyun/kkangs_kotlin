package nine_five_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//상속에 의한 오버라이드 접근제한자
open class Super1 {
//    open private fun myFun1() { //error
//
//    }
    open fun myFun2() {

    }
    open protected fun myFun3() {

    }
}

class Sub1: Super1() {
//    override private fun myFun2() {//error
//
//    }

    override fun myFun3() {

    }
}