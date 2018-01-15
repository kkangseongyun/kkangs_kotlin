package eleven_two_one_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun main(args: Array<String>) {
    val direction: Direction = Direction.NORTH

    println("${direction.name} ... ${direction.ordinal}")

    val directions: Array<Direction> = Direction.values()
    directions.forEach { t -> println(t.name)  }

    val direction1=Direction.valueOf("WEST")
    println("${direction1.name} .. ${direction1.ordinal}")

}