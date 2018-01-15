/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    //run : 기본 이용 방법~~~~~~~~~~~~~~~~
    val result= run {
        println("lambdas function call...")
        10 + 20
    }
    println("result : $result")


    //기초 고차함수..~~~~~~~~~~~~~~~~~~~~~~~
    class User1() {

        var name: String?=null
        var age: Int?=null

        constructor(name: String, age: Int) : this() {
            this.name=name
            this.age=age
        }

        fun sayHello(){
            println("hello $name")
        }
        fun sayInfo(){
            println("i am $name, $age years old")
        }
    }
    //run : 객체의 함수로 이용 ~~~~~~~~~~~~~

    val user = User1()
    user.name="kkang"
    user.age=33
    user.sayHello()
    user.sayInfo()

    //객체에서의 run 이용
    val runResult=user.run {
        name="kim"
        age=28
        sayHello()
        sayInfo()
        10 + 20
    }

    println("run result : $runResult")


    //apply~~~~~~~~~~~~~~~~~~~~`
    //리턴 되는 것이 객체이다. 적용된 객체의 값이 그대로 리턴된다.
    val user3=user.apply {
        name="park"
        sayHello()
        sayInfo()
    }
    println("user name : ${user.name}, user3 name : ${user3.name}")
    user.name="aaa"
    user3.name="bbb"
    println("user name : ${user.name}, user3 name : ${user3.name}")

    //let~~~~~~~~~~~~~~~~~~
    fun letTestFun(user: User1){
        println("letTestFun1() : ${user.name} .. ${user.age}")
    }

    val user4=User1("kkang", 33)
    letTestFun(user4)

    //let 이용한다면...
    User1("kim", 28).let { user ->
        letTestFun(user)
    }
    //it 으로 축약
    User1("kim", 28).let {
        letTestFun(it)
    }

    //with
    user.run {
        name="kkang"
        sayHello()
    }

    with(user){
        name="kkang"
        sayHello()
    }
}


