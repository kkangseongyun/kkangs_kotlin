package nine_three_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super(name: String){
    constructor(name: String, no: Int): this(name){}
}


class Sub1(name: String): Super(name) {
    constructor(name: String, no: Int): this(name){ }
}


class Sub2: Super{
    constructor(name: String): super(name){ }
    constructor(name: String, no: Int): super(name, no){}
}


fun main(args: Array<String>) {
    val sub1=Sub1("name", 10)

}