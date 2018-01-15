package eleven_three_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

sealed class Shape(){

    class Circle(val radius: Double) : Shape()
    class Rect(val width: Int, val height: Int) : Shape()
}

class Triangle(val bottom: Int, val height: Int): Shape()


fun main(args: Array<String>) {
    val shape1: Shape = Shape.Circle(10.0)

    val shape2: Shape = Triangle(10, 10)


}
