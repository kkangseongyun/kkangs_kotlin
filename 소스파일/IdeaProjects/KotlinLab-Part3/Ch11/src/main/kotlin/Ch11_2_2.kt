package eleven_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

enum class Direction {
    NORTH {
        override val data1: Int = 10
        override fun myFun(){
            println("north myFun....")
        }
    },
    SOUTH {
        override val data1: Int = 20
        override fun myFun(){
            println("south myFun....")
        }
    };

    abstract val data1: Int
    abstract fun myFun()
}

fun main(args: Array<String>) {
    val direction: Direction = Direction.NORTH
    println(direction.data1)
    direction.myFun()


}