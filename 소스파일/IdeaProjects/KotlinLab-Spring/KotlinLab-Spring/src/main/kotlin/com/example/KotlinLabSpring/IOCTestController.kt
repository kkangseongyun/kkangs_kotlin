package com.example.KotlinLabSpring

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@RestController
class IOCTestController {

    @Autowired
    lateinit var service: IOCTestService

    @GetMapping("/ioc")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)

}

@RestController
class IOCTestController2 @Autowired constructor(val service: IOCTestService){

    @GetMapping("/ioc2")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)

}

@RestController
class IOCTestController3 {

    lateinit var service: IOCTestService

    @Autowired constructor(service: IOCTestService){
        this.service=service
    }

    @GetMapping("/ioc3")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)

}
@RestController
class IOCTestController4 {

    @set:Autowired lateinit var service: IOCTestService

    @GetMapping("/ioc4")
    fun hello(@RequestParam(value = "name") name: String) = service.sayHello(name)

}