/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
fun main(args: Array<String>) {
    println("sorted ~~~~~~~~~~~~~~~~`")
    listOf(1, 5, 2).sorted()
            .forEach { println(it) }

    listOf("lee","kkang","park").sorted()
            .forEach { println(it) }

    println("sortedBy ~~~~~~~~~~~~~~~~`")
    listOf(1, 3, 2).sortedBy { it % 3 }
            .forEach { println(it) }

    println("sortedDescending ~~~~~~~~~~~~~~~~`")
    listOf("lee","kkang","park").sortedDescending()
            .forEach { println(it) }
}