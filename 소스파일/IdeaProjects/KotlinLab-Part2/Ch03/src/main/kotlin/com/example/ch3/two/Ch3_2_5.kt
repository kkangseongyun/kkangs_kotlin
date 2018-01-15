package com.example.ch3.two

import java.util.Date
import java.sql.Date as SqlDate

fun main(args: Array<String>) {
    val date=Date()
    val date2=SqlDate(System.currentTimeMillis())

    println("java.util.Date() : "+date)
    println("java.sql.Date() : "+date2)
}