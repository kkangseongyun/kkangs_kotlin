package nine_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

open class Shape {
    open fun print() {
        //................
    }
}

open class Rect: Shape()  {
    override fun print() {
        //................
    }
}

class RoundRect: Rect() {
    override fun print() {
        //...........
    }
}

