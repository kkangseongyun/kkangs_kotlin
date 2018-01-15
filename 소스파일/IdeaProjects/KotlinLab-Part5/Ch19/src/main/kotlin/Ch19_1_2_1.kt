package nineteen_one_two_one

import kotlin.reflect.KProperty

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

class MySumDelegate {

    var result: Int = 0

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("getValue call... ref : $thisRef, property :  '${property.name}'")
        return result;
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        result=0
        println("setValue call... value : $value, '${property.name}")
        for(i in 1..value){
            result += i
        }
    }
}

class Test {
    var sum: Int by MySumDelegate()
}

fun main(args: Array<String>) {
    val obj: Test = Test()
    obj.sum=10
    println(obj.sum)
    obj.sum=5
    println(obj.sum)
}
