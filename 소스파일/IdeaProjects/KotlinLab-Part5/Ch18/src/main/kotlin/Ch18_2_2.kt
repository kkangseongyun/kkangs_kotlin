package eighteen_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

annotation class TestAnnotation(val count: Int)

class Test {

    @TestAnnotation(count=3)
    fun some(){
        println("some.....")
    }
}

fun main(args: Array<String>) {

    val obj: Test = Test()

    val methods = Test::class.java!!.methods

    for(method in methods){
        if(method.isAnnotationPresent(TestAnnotation::class.java)){
            val annotation=method.getAnnotation(TestAnnotation::class.java)
            val count = annotation.count
            for(i in 1..count){
                obj.some()
            }
        }
    }
}
