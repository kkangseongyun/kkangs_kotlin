package seventeen_five_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(arg: Any){
    if(arg is Int){

    }
    val intVal=arg as Int
    intVal.plus(10)
}
fun some1(arg: List<Int>){
    if(arg is List<Int>){
        println(arg.sum())
    }
}

fun some2(arg: List<*>){
//    if(arg is List<Int>){//error
//
//    }
}

fun some3(arg: List<*>){
    val intList = arg as List<Int>
    println(intList.sum())
}

fun main(args: Array<String>) {
    some(10)
//    some("hello")

    some3(listOf(10, 20))
    some3(listOf("hello", "kkang"))
}
