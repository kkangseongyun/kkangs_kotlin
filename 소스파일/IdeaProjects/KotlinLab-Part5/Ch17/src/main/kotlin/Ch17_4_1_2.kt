package seventeen_four_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MyClass<T>(val data: T){
    fun myFun(): T {
        return data
    }
    fun myFun2(arg: T){

    }
    fun myFun3(arg: T): T{
        return data;
    }
}

fun some2(arg: MyClass<out Number>){
    arg.myFun()
//    arg.myFun2(10)//error
//    arg.myFun3(10)//error
}

fun main(args: Array<String>) {
    some2(MyClass<Number>(10))
    some2(MyClass<Int>(10))
}
