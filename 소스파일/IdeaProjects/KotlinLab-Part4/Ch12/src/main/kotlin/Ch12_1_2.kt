package twelve_one_two

import java.io.File
import java.io.FileWriter

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(a: Int): Int {
    return (Math.random()*a).toInt()
}
fun some1(a: String): Boolean {
    try {
        val file= File("a.txt")
        val out= FileWriter(file);
        out.write(a)
        out.flush()
        return true
    }catch (e: Exception){
        return false
    }
}
fun some2(a: Int, b: Int): Int{
    return a+b
}
fun some3(): Int{
    return 10
}
fun some4(a: Int, b: Int) {
    val result=a + b
}

