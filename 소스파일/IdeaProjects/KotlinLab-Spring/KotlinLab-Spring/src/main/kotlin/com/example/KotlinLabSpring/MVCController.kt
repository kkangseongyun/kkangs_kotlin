package com.example.KotlinLabSpring.mvc

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
data class MyRequestParams(var no: Int = 0 , var name: String = "")

data class MyModelData(var data1: String = "", var data2: String = "")

@Controller
class MVCController {

    @RequestMapping("/mvc")
    fun doIndexGet(params: MyRequestParams, model: Model): String{

        model.addAttribute("params", "Hello ${params.no} -  ${params.name}")
        model.addAttribute("myModel", MyModelData("hello","world"))
        return "index"
    }
}

