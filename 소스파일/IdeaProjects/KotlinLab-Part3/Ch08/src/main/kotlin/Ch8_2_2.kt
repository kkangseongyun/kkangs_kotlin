package eight_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class User {
    val name1: String="kkang"
    var name2: String?=null
    val name3: String?=null
    var age: Int? = null

    constructor(name2: String, name3: String, age: Int){
        this.name2=name2
//        this.name3=name3//error
        this.age=age
    }
}
