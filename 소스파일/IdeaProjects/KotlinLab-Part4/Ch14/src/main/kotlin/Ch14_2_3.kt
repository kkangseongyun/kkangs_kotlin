/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {

    //drop, dropWhile, dropLastWhile
    println("drop test ~~~~~~~~~~~~~~~")
    listOf(1, 2, 3, 4).drop(2)
            .forEach { println(it) }

    println("dropWhile test ~~~~~~~~~~~~~~~")

    listOf(2, 1, 12, 5, 23).dropWhile { it < 10 }
            .forEach { println(it) }

    listOf(21, 1, 12, 5, 23).dropWhile { it < 10 }
            .forEach { println(it) }

    println("dropLastWhile test ~~~~~~~~~~~~~~~")
    listOf(1, 12, 5, 23, 5, 4).dropLastWhile { it < 10 }
            .forEach { println(it) }

    //slice
    println("slice test ~~~~~~~~~~~~~~~")
    listOf(1, 12, 5, 23, 5, 4).slice(1 .. 3)
            .forEach { println(it) }

    listOf(1, 12, 5, 23, 5, 4).slice(listOf(0, 2, 4))
            .forEach { println(it) }

    //take~~~~~~~~~~~~~~
    println("take test ~~~~~~~~~~~~~~~")
    listOf(1, 12, 5, 23, 5, 4).take(3)
            .forEach { println(it) }

    println("takeLast test ~~~~~~~~~~~~~~~")
    listOf(1, 12, 5, 23, 5, 4).takeLast(3)
            .forEach { println(it) }

    println("takeWhile test ~~~~~~~~~~~~~~~")
    listOf(11, 12, 5, 23, 5, 4).takeWhile { it > 10 }
            .forEach { println(it) }
}