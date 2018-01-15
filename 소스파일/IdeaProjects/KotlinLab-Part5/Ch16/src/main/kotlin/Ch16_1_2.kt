package sixteen_one_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Super {
    open fun superFun() {
        println("Super... superFun....")
    }
}

class Sub: Super() {
    var data: Int = 20
    override fun superFun() {
        println("Sub .. superFun.... ${data}")
    }
    fun some1(data: Int) {
        this.data=data
        superFun()
        super.superFun()
    }
}

fun Sub.some2(data: Int){
    this.data = data
    superFun()

//    super.superFun()//error
}

fun main(args: Array<String>) {
    val obj: Sub = Sub()
    obj.some1(10)
    obj.some2(100)
}

