package com.example.KotlinLabSpring.aop

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@RestController
class AOPTestController {

    @Autowired
    lateinit var service: AOPTestService

    @GetMapping("/aop")
    fun hello(@RequestParam(value = "name") name: String): String {
        service.sayHello()
        service.sayHello(name)
        service.returnThrow()
        return "Hello"
    }

}

