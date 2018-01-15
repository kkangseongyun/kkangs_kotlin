/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//람다함수 탈출 테스트...
inline fun hoTest(argFun: (String)->Unit){
    argFun("hello")
    argFun("kim")
    argFun("kkang")
}
fun labelTest(){
    println("test top....")
    hoTest {
        if(it.length < 4) return@hoTest
        println(it)
    }
    println("test bottom....")
}
fun main(args: Array<String>) {
    //람다함수 탈출~~~~~~~~~~~~~~~
    val array = arrayOf(1,-1, 2)
    fun arrayLoop() {
        println("loop top..")
        array.forEach {
            if(it < 0) return@forEach
            println(it)
        }
        println("loop bottom..")
    }
    arrayLoop()

    //람다 탈출 테스트 2 ...............
    labelTest()



    //anonymous 의 경우
    fun arrayLoop2() {
        println("loop before..")
        array.forEach(fun(value: Int){
            if (value < 0) return
            println(value)

        })
        println("loop after..")
    }
    arrayLoop2()
}