package six_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(): Int {
    return 50
}

fun testWhen(data: Any){
    when(data){
        1 -> println("data value is 1")
        "hello" -> println("data value is  hello")
        is Boolean -> println("data type is Boolean")
    }
}
fun main(args: Array<String>) {
    val a2=1
    when (a2) {
        1 -> println("a2 == 1")
        2 -> println("a2 == 2")
        else -> {
            println("a2 is neither 1 nor 2")
        }
    }

    val data1="hello"
    when(data1){
        "hello"->println("data1 is hello")
        "world"->println("data1 is world")
        else -> println("data1 is not hello or world")
    }

    val data2=50
    when(data2){
        10, 20 -> println("data2 is 10 or 20")
        30, 40 -> println("data2 is 30 or 40")
        some() -> println("data2 is 50")
        30 + 30 -> println("data2 is 60")
    }

    val data3=154
    when(data3){
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1 <= data3 <= 10")
        in 11..20 -> println("11 <= data3 <== 20")
        else -> println("data3 > 20")
    }

    val list= listOf<String>("hello","world","kkang")
    val array= arrayOf<String>("one","two","three")
    val data4="kkang"
    when(data4){
        in list -> println("data4 in list")
        in array -> println("data4 in array")
    }

    val data5=15
    when {
        data5<=10 -> println("data5 < 10")
        data5>10 && data5<=20 -> println("10 < data5 <= 20")
        else -> println("data5 > 20")
    }


    val data6=3
    val result2= when(data6){
        1 -> "1...."
        2 -> "2...."
        else -> {
            println("else....")
            "hello"
        }
    }
    println(result2)
}