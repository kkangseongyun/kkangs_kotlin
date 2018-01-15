package com.example.KotlinLabSpring.aop

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component
import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.AfterThrowing
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around

/**
 * 깡샘의 코틀린 프로그래밍 - 루비페이퍼
 * 위의 책에 담겨져 있는 코드로 설명 및 활용 방법은 교제를 확인해 주세요.
 */





@Aspect
@Component
class LoggingAOP {
    @Before("execution(* com.example.KotlinLabSpring.aop.AOPTestService.*(..))")
    fun beforeLogging() {
        println("beforeLogging.......!!!")
    }
    @Before("execution(* com.example.KotlinLabSpring.aop.AOPTestService.*(String))")
    fun beforeLogging2() {
        println("beforeLogging2.......!!!")
    }

    @AfterReturning(pointcut = "execution(* com.example.KotlinLabSpring.aop.AOPTestService.*(..))", returning = "retVal")
    fun afterLogging(retVal: Any) {
        println("afterLogging $retVal")
    }

    @AfterThrowing("execution(* com.example.KotlinLabSpring.aop.AOPTestService.*(..))")
    fun afterThrowing() {
        println("afterThrowing....")
    }

    @Around("execution(* com.example.KotlinLabSpring.aop.AOPTestService.*(String))")
    fun around(pjp: ProceedingJoinPoint): Any {
        println("around before....")
        val returnVal= pjp.proceed()
        println("around after....")
        return returnVal
    }


}

