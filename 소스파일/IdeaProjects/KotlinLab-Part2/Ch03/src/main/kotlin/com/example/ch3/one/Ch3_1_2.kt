package com.example.ch3.one

import java.util.*

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */

var sum=0

fun calSum(){
    for (i in 1..10){
        sum += i
    }
}

class T1_User{
    val name="kkang"
    fun sayHello(){
        val date= Date()
        println("date :" +date)
        println("Hello!! "+name)
    }
}

fun main(args: Array<String>) {
    calSum()
    println(sum)
    T1_User().sayHello()
}

