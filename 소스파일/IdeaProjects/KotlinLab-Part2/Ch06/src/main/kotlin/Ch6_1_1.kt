package six_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    val a = 5
    if (a < 10) println("$a < 10")

    if (a > 0  && a <= 10) {
        println("0 < $a <= 10")
    } else if(a > 10 && a <= 20){
        println("10 < $a <=20")
    }else {
        println("$a > 20")
    }


    val result=if (a > 10) "hello" else "world"
    println(result)

//    if(a>10) "hello"//ok
//    val result2=if(a>10) "hello"//error

    val result2 = if (a < 10) {
        print("hello....")
        10+20
    } else {
        print("world...")
        20+20
    }
    println(result2)

    val result3 = if (a > 10) 20
    else if(a > 20) 30
    else 10
    println(result3)
}