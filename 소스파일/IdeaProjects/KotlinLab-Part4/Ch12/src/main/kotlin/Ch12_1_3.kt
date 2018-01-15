package twelve_one_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun superFun(){
    val superData="hello"
    fun subFun1(){
        println("subFun1() .. superData : ${superData}")
    }
    fun subFun2(a: Int, b: Int): Int{
        subFun1()
        return a+b
    }

    class SubClass {
        fun classFun(){
            println("classFun() .. superData : ${superData}")
        }
    }
    subFun1()
    SubClass().classFun()
}

fun main(args: Array<String>) {
    superFun()

    //함수가 변수에 대입
    val dataVal=10

//    val funVal=fun someFun() {//error
//        //..........
//    }
    // 람다타입
    val funVal1= { x1: Int ->
        println("hello world")
        x1 * 10
    }
    funVal1(10)

    //function reference
    fun someFun() {
        println("i am some Function")
    }

    val funVal2=::someFun

    funVal2()



}