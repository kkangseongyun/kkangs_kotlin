package seventeen_four_one_one

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

fun some1(arg: MyClass<in Int>){
    arg.myFun()
    arg.myFun2(10)
    arg.myFun3(10)
}

fun main(args: Array<String>) {
    some1(MyClass<Int>(10))
    some1(MyClass<Number>(10))
}
