package seventeen_four_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MyClass<in T>{
    fun myFun(a: T){ }
    fun myFun2(){}
}

fun some(arg: MyClass<*>){
//    arg.myFun(10)//error
    arg.myFun2()
}
fun some1(arg: MyClass<in Any?>){
    arg.myFun(10)
    arg.myFun2()
}
fun some2(arg: MyClass<in Nothing>){
//    arg.myFun(10)//error
    arg.myFun2()
}
