package fifteen_two_one

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun some(array: Array<Any>){
    try {
        println("try top...")

        val intData: Int= array[0] as Int

        val data: String = array[2] as String

        val data2: Int = data.toInt()

    }catch (e: ClassCastException){
        println("catch... ClassCastException")
    }catch (e: ArrayIndexOutOfBoundsException){
        println("catch... ArrayIndexOutOfBoundsException")
    }catch (e: Exception){
        println("catch... Exception... ${e.toString()}")
    }

}
fun some1(arg: String): Int {

    val parseData: Int = try {
        println("try..top")
        arg.toInt()
    }catch (e: Exception){
        println("${e.toString()}")
        0
    }finally {
        println("finally...")
        100
    }
    return parseData
}
fun main(args: Array<String>) {
    //에러가 발생하지 않았을때 수행흐름
    try {
        println("try top...")

        val data: String = "10"
        //error 상황
//        val data: String = "kkang"

        val intData: Int? = data.toInt()

        println("try bottom...")
    }catch (e: Exception){

        println("catch.....")

    }finally {

        println("finally....")

    }


    //try-catch-finally 다양하게....................

    try{

    }catch (e: Exception){

    }

    try {

    }finally {

    }

    try {

    }catch (e: Exception){

    }catch (e: Exception){

    }


    //catch 여러개인경우..............
    //cast exception
    val array= arrayOf("0", 1, "6")
    some(array);

    //index out of bound exception
    val array2= arrayOf(10,"5")
    some(array2)

    //Number format exception
    val array3=arrayOf(10, 0, "world")
    some(array3)

    //표현식..................
    println("${some1("10")}")

    println("${some1("a")}")
}