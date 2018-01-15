package com.example.KotlinSpringLabStep

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@Controller
class TodoController(@Autowired private val todoRepository: TodoRepository) {

    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun listTodo(model: Model) : String {
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }

    @RequestMapping(value="/", method = arrayOf(RequestMethod.POST))
    fun addTodo(todo: Todo, model: Model) : String {

        todoRepository.save(todo)
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }

    @RequestMapping(value = "/delete", method = arrayOf(RequestMethod.GET))
    fun deleteTodo(@RequestParam(name = "todoId") todoId: Long, model: Model): String {
        todoRepository.deleteByTodoId(todoId)
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }
}