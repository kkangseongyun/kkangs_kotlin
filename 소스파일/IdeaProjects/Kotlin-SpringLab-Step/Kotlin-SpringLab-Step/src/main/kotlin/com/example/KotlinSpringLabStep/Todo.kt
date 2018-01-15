package com.example.KotlinSpringLabStep

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */
@Entity
class Todo(@Id @GeneratedValue var todoId: Long = 0, var content: String = "")