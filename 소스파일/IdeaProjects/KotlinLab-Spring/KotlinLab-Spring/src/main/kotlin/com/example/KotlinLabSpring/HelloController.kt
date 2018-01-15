package com.example.KotlinLabSpring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
data class Result(val id: Int, val title: String, val content: String)

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(@RequestParam(value = "id", defaultValue = "0") id: Int,
              @RequestParam(value = "title", defaultValue = "DefaultTitle") title: String,
              @RequestParam(value = "content", defaultValue = "DefaultContent") content: String) =
            Result(id, title, content)
}