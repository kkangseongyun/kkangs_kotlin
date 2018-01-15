package eleven_three_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//일반 클래스와 Sealed 클래스의 차이
sealed class Shape{
    class Circle(val radius: Double) : Shape()
    class Rect(val width: Int, val height: Int) : Shape()
}

open class NonSealedShape{
    class Circle(val radius: Double) : NonSealedShape()
    class Rect(val width: Int, val height: Int) : NonSealedShape()
}

fun main(args: Array<String>) {
    val sealedObj: Shape = Shape.Circle(10.0)

    val nonSealedObj: NonSealedShape = NonSealedShape.Circle(10.0)

//    val sealedObj1: Shape = Shape()//error

    val nonSealedObj1: NonSealedShape = NonSealedShape()
}