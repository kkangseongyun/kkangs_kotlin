package fifteen_one_three

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

//null check chain
class Address {
    val city: String?="seoul"
}

class User {
    val address: Address? = Address()
}

fun main(args: Array<String>) {

    var data1: String? = "kkang"

//    val length: Int = data1.length//error

    val length1: Int? = if(data1 != null){
        data1.length
    } else {
        null
    }

    var length2: Int? = data1?.length
    println(length2)

    data1=null
    length2 = data1?.length
    println(length2)


    //null check chain ~~~~~~~~~~~~~~~~~~~~
    val user: User? = User()

    println(user?.address?.city)

    //let { } ~~~~~~~~~~~~~~~~~~~~~~~~~~~
    val array= arrayOf("hello", null, "kkang")

    array.forEach {
        if(it != null){
            println("$it .. ${it.length}")
        }
    }

    array.forEach {
        it?.let {
            println("$it .. ${it.length}")
        }
    }
}