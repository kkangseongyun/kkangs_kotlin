package ten_two_two

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

interface MyInterface8 {

    var prop1: Int // abstract

//    val prop2: String = "kkang"//error

//    val prop2: String//error
//        get() = field

//    var prop3: String//error
//        get() = "kkang"

    val prop4: String
        get() = "kkang"

    var prop5: String
        get() = "kkang"
        set(value) {

        }
}

interface MyInterface9 {

    var data1: Int

    var data2: Int
        get() = 0
        set(value){
            if(value > 0)
                calData(value)
        }

    val data3: Boolean
        get(){
            if(data1 > 0) return true
            else return false
        }


    private fun calData(arg: Int) {
        data1 =  arg * arg
    }

}

class MyClass9: MyInterface9 {
    override var data1: Int = 0
}

fun main(args: Array<String>) {
    val obj=MyClass9()
    println("data1 : ${obj.data1}, data2 : ${obj.data2}, data3 : ${obj.data3}")
    obj.data2=5
    println("data1 : ${obj.data1}, data2 : ${obj.data2}, data3 : ${obj.data3}")
}