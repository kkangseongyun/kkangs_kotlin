package eight_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class User1 {
    var greeting: String = "Hello"
        set(value) {
            field = "Hello" + value
        }
        get() = field.toUpperCase()

    var age: Int=0
        set(value)  {
            if(value >0 ){
                field=value
            }else {
                field=0
            }
        }
}

class User2 {

    val name: String = "kkang"
        get() = field.toUpperCase()
//        set(value) { field = "Hello" + value}//error


    val age: Int
        get() = 10


//    var phone: String//error
//        get() = "01000000"
}


fun main(args: Array<String>) {
    val user1=User1()
    user1.greeting="kkang"
    println(user1.greeting)
    user1.age=-1
    println("age : ${user1.age}")
}