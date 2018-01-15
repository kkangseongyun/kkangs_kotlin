package six_one_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun sayHello(): String{
    return "Hello World"
}
fun some(a: Any){
    println("some() : $a")
}
fun main(args: Array<String>) {


    10
    10+20
    sayHello()

    val data1=10
    val data2 = 10+20
    val data3=sayHello()

    some(10)
    some(10+20)
    some(sayHello())


    for(i in 1..10) println("hello")
    val data4=10

//    val data5=for(i in 1..10) println("hello")
//    val data6=val data7=10

//    some(for(i in 1..10) println("hello"));
//    some(val data8=10)



    val count=10
    val a = if(count>5){
        "true"
    }else {
        "false"
    }

    some(if(count>10) "true" else "false")
}