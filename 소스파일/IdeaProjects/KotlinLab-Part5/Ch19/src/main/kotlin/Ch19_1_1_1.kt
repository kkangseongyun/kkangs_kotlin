package nineteen_one_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface Print {
    fun print(arg: String)
}

class MyDelegatee: Print {
    override fun print(arg: String) {
        println("i am delegatee : $arg")
    }
}

class MyDelegator(obj: MyDelegatee): Print by obj

fun main(args: Array<String>) {
    val obj: MyDelegatee = MyDelegatee()
    MyDelegator(obj).print("hello kkang")
}