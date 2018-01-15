package eleven_two_one_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

enum class Direction(var no: Int, val str: String) {
    NORTH(0, "north"), SOUTH(1, "south"), WEST(2, "west"), EAST(3, "east")
}

fun main(args: Array<String>) {
    val direction: Direction = Direction.NORTH

    println("no : ${direction.no}, ${direction.str}")

    direction.no=10

    println("no : ${direction.no}, ${direction.str}")

}