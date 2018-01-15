package com.example.KotlinSpringLabStep

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import javax.transaction.Transactional
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@EnableJpaRepositories(basePackages = arrayOf("com.example.KotlinSpringLabStep"))
class Config

interface TodoRepository : JpaRepository<Todo, Long> {
    @Transactional
    fun deleteByTodoId(todoId: Long)
}

