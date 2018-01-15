package six_three_seven

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

fun main(args: Array<String>) {
    class User
    val user1=User()
    val user2=User()
    val user3=user1
    println("user1==user2 is ${user1==user2}")//false
    println("user1===user2 is ${user1===user2}")//false
    println("user1==user3 is ${user1==user3}")//true
    println("user1===user3 is ${user1===user3}")//true

    val user4=User()
    val user5: User?=user4
    println("user4==user5 is ${user4==user5}")//true
    println("user4===user5 is ${user4===user5}")//true

    val int1=Integer(10)
    val int2=Integer(10)
    val int3=int1
    println("int1==int2 is ${int1==int2}")//true
    println("int1===int2 is ${int1===int2}")//false
    println("int1==int3 is ${int1==int3}")//true
    println("int1===int3 is ${int1===int3}")//true


    val data1: Int=10
    val data2: Int=10
    println("data1==data2 is ${data1==data2}")//true
    println("data1===data2 is ${data1===data2}")//true


    val data3=1000
    val data4=1000
    val data5: Int?=1000
    val data6: Int?=1000
    println("data3==data4 is ${data3==data4} $data4 $data3")
    println("data3===data4 is ${data3===data4}")
    println("data5===data6 is ${data5==data6}")
    println("data5===data6 is ${data5===data6}")

    val boxed1:Int? = 127
    val boxed2:Int? = 127
    val boxed3:Int?=128
    val boxed4:Int?=128
    println("boxed1===boxed2 is ${boxed1===boxed2}")
    println("boxed3===boxed4 is ${boxed3===boxed4}")


    val double1: Double?=10.0
    val double2: Double?=10.0
    println("double1==double2 is ${double1==double2}")
    println("double1===double2 is ${double1===double2}")

    val str1: String="hello"
    val str2: String="hello"
    println("str1==str2 is ${str1==str2}")
    println("str1===str2 is ${str1===str2}")
    //

    val str3: String?="hello"
    val str4: String?="hello"
    println("str3==str4 is ${str3==str4}")
    println("str3===str4 is ${str3===str4}")

}