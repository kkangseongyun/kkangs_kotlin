package eleven_five_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//object의 기초이용법

class Outer {

    private var no: Int = 0

    private val myInner = object {
        val name: String = "kkang"
        fun innerFun(){
            println("innerFun....")
            no++
        }
    }

    fun outerFun(){
        myInner.name
        myInner.innerFun()
    }
}

fun main(args: Array<String>) {
    val obj=Outer()
//    obj.myInner.name//error
//    obj.myInner.innerFun()//error
}
