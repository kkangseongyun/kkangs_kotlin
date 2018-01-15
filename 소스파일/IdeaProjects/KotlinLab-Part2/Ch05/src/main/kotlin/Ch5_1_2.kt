package five_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

val isTrue1: Boolean = true && false
val isTrue2: Boolean = true || false
val isTrue3: Boolean = !true

val charData='C'

fun check(c: Char) {
//    if (c == 1) {//error
//
//    }
}

fun sum(no: Int): Int{
    var sum=0;
    for(i in 1..no){
        sum += i
    }
    return sum
}

fun main(args: Array<String>) {
    println(isTrue1)
    println(isTrue2)
    println(isTrue3)


    var str: String = "Hello"
    println("str[1] : ${str[1]}")

    val str2="Hello \n World"
    val str3="""Hello
    World"""
    println(str2)
    println(str3)

    val name: String="kkang"
    println("result : $name .. ${sum(10)}")

    val str4=String
}