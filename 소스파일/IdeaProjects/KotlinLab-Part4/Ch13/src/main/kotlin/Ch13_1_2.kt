
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    //매개변수 하나인 함수타입 이용 ~~~~~~~~~~~~~~~~~~~~~~
    fun hoFun1(argFun: (Int) -> Int){
        val result=argFun(10)
        println("result : $result")
    }
    hoFun1({x -> x * x})
    hoFun1 {x -> x* x }

    val array= arrayOf(10, 20, 15, 22, 8)
    array.filter{ x -> x > 10 }
            .forEach{ x -> println(x) }

    fun hoFun_1(no: Int, argFun1: (Int)->Int, argFun2: (Int)->Boolean){

    }
    hoFun_1(10, {it * it}, {it > 10})
    hoFun_1(10, {it * it}) {it > 10}
//    hoFun_1(10){it * it} {it > 10}//error

    //default 값 이용 ~~~~~~~~~~~~~~~~~~~~~~~
    fun some(x1:Int = 10){
        println(x1)
    }
    some()

    fun hoFun2(
            x1: Int,
            argFun1: (Int) -> Int,
            argFun2: (Int) -> Boolean = { x -> x > 10}
    ){
        val result = argFun1(x1)
        println("result : ${argFun2(result)}")
    }

    hoFun2(2, { x: Int -> x * x }, {x -> x > 20})
    hoFun2(4, { x: Int -> x * x })

}


