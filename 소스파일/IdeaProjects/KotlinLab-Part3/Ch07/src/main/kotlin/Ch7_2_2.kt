package seven_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */


class User1 { }


class User2(name: String) { }


class User3 {
    constructor(name: String){ }
}


class User4 {
    constructor(){}
    constructor(name: String){}
    constructor(name: String, age: Int){}
}


class User5 {
    init {
        println("i am init block....")
    }
    constructor(){
        println("i am constructor....")
    }
}


//class User6 {
//    init {
//        println("i am init block....$name")//error
//    }
//    constructor(val name: String){//error
//        println("i am constructor....$name")
//    }
//    fun sayHello(){
//        println("hello $name")//error
//    }
//}



fun main(args: Array<String>) {

    val user1=User1()
    val user2=User2("kkang")
//    val user3=User3()//error
    val user4=User3("kkang")


    val user5=User4()
    val user6=User4("kkang")
    val user7=User4("kkang", 10)


    val user8=User5()

}