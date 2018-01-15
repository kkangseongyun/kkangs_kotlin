package five_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {

    var array = arrayOf(1, "kkang", true)
    array[0]=10
    array[2]="world"
    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")

    var arrayInt = arrayOf<Int>(10, 20, 30)
    println("${arrayInt.get(0)} .. ${arrayInt.get(1)} .. ${arrayInt.get(2)}")

    var arrayInt2= intArrayOf(10, 20, 30)
    var arrayDouble= doubleArrayOf(10.0, 20.0, 30.0)

    var array2= arrayOfNulls<Any>(3)
    array2[0]=10
    array2[1]="hello"
    array2[2]=true
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")

    var emptyArray=Array<String>(3,{""})
    emptyArray[0]="hello"
    emptyArray[1]="world"
    emptyArray[2]="kkang"
    println("${emptyArray[0]} .. ${emptyArray[1]} .. ${emptyArray[2]}")

    var array3=Array(3,  { i -> i*10})
    println("${array3[0]} .. ${array3[1]} .. ${array3[2]}")

    var array4=Array<Int>(3, {i -> i * 10})
    var array5=IntArray(3, { i -> i *10})
}

