/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

external fun alert(message: Any?): Unit

external val jsData: Int
external fun jsFun(arg:Int): Unit
external class JsClass(msg: String) {
    fun sayHello()
    companion object {
        fun sayHello2(arg: String)
    }
}

external fun jsFun2(arg1: String, arg2: Int = definedExternally, arg3: String = definedExternally): Unit

open external class JsSuper {
    open fun superFun()
}

class Sub: JsSuper() {
    fun subFun(){
        console.log("i am kotlin subFun")
    }

    override fun superFun() {
        super.superFun()
        console.log("i am kotlin superFun")
    }
}
external interface KotlinInterfaceType{
    fun argFun1()
    fun argFun2()
}
external fun jsFun3(argFun: KotlinInterfaceType)

fun ch25_3_3(){
    alert("hello kkang")
    jsFun(jsData)

    val obj=JsClass("kim")
    obj.sayHello()

    JsClass.sayHello2("lee")

    val obj2=Sub()
    obj2.superFun()
    obj2.subFun()

    jsFun3(object: KotlinInterfaceType{
        override fun argFun1() {
            console.log("argFun1 call....")
        }

        override fun argFun2() {
            console.log("argFun2 call....")
        }
    })
}


