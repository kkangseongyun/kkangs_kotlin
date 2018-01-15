package seventeen_six_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface<T> {
    fun myFun(): T
}

class MyClass: MyInterface<String> {
    override fun myFun(): String {
        return "hello"
    }
}

class MyClass2: MyInterface<Unit> {
    override fun myFun() {

    }
}