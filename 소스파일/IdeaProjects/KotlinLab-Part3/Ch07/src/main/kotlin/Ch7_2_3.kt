package seven_two_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */


class User1(name: String){
    init {
        println("init block... $name")
    }
    constructor(name: String, age: Int): this(name){
        println("constructor ... $name ... $age")
    }
}


class User2(name: String){
    constructor(name: String, age: Int): this(name){
    }
    constructor(name: String, age: Int, email: String): this(name, age) {
    }
}

fun main(args: Array<String>) {

    println("----- 주생성자로 생성한 경우 -------")
    val user1=User1("kkang")
    println("----- 보조생성자로 생성한 경우 -------")
    val user2=User1("kkang", 33)


    val user3=User2("kkang")
    val user4=User2("kkang", 30)
    val user5=User2("kkang", 30, "a@a.com")
}