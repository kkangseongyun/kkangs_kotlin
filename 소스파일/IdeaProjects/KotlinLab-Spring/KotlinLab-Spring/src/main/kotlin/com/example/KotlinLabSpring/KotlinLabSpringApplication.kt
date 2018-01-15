package com.example.KotlinLabSpring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@SpringBootApplication
class KotlinLabSpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinLabSpringApplication::class.java, *args)
}
