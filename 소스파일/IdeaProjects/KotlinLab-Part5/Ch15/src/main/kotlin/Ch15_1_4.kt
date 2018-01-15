package fifteen_one_four

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    var data: String? ="kkang"

    var length: Int = if(data != null){
        data.length
    }else {
        -1
    }

    data=null

    length=data?.length ?: -1

    println(length)

    data ?: println("data is null")
    
}