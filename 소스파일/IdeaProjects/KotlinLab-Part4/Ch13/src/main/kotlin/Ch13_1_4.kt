/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    //function reference를 이용한 함수 전달

    fun hoFun6(argFun: (x: Int) -> Int){
        println("${argFun(10)}")
    }

    hoFun6 { it * 5 }

    fun nameFun(x: Int): Int {
        return x * 5
    }
    hoFun6(::nameFun)

    //anonymous function 이용~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //lambdas return
//    val lambdasFun={ x: Int ->
//        println("i am lambdas function")
//        return x * 10//error
//    }
    //실행구문이 한 줄인 경우
    val anonyFun1 = fun(x: Int): Int = x * 10
    //실행구문이 여러줄인 경우
    val anonyFun2 = fun(x: Int): Int {
        println("i am anonymous function")
        return x * 10
    }

    fun hoFun7(argFun: (Int)->Int){
        println("${argFun(10)}")
    }
    hoFun7(fun(x: Int): Int = x * 10)

}


