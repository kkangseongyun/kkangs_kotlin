package eight_one_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

var myVal: String="hello"
    get() = field.toUpperCase()
    set(value){
        field = "hello" + value
    }

class User1(val name: String){

    var age: Int=0
        set(value) {
            if(value>0) field=value
            else field=0
        }

    fun myFun(){
        var no=0
//            get() = field * 10//error
    }
}

class User2(var name: String){
    var myName: String = name
        get() = field.toUpperCase()
        set(value) {
            field="Hello"+value
        }
}

class User3(name: String){
    var name: String = name
        get() = field.toUpperCase()
        set(value) {
            field="Hello"+value
        }
}


fun main(args: Array<String>) {

    //주생성자와 프로퍼티
    val user1=User1("kkang")
    println("name : ${user1.name}")

    //주생성자 프로퍼티 Custom 1
    val user2=User2("kkang")
    user2.name="lee"
    user2.myName="kim"
    println("name : ${user2.name}")
    println("myName : ${user2.myName}")

    //주생성자 프로퍼티 Custom 2
    val user3=User3("kkang")
    user3.name="kim"
    println("name : ${user3.name}")

}