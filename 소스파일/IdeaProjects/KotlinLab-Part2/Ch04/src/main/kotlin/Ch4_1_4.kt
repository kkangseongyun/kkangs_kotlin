package four_one_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

var myBool = false
val myVal: String = "hello"
    get() {
        if(myBool)
            return field
        else
            return field.toUpperCase()
    }

const val myConst: Int = 10

//const var myConst2: Int = 10//error

class MyClass {
//    const val myConst3 = 30//error

    object A{
        const val myConst4=40
    }
}
fun some(){
//    const val myConst4= 40//error
}


fun main(args: Array<String>) {
    println(myVal)
    myBool=true
    print(myVal)

}