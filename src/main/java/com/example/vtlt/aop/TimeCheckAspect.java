package com.example.vtlt.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

// TODO : AspectJ 적용방법 재확인
@Aspect
@Component
@Slf4j
public class TimeCheckAspect {
    @Around("execution(* com.example.vtlt.controller..*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();

        String threadName = Thread.currentThread().toString();
        String methodName = joinPoint.getSignature().toShortString();

        stopWatch.start();

        try {
            return joinPoint.proceed();
        } finally {
            stopWatch.stop();
            log.info("Thread: {} | Method: {} | Execution Time: {}ms",
                    threadName, methodName, stopWatch.getTotalTimeMillis());
        }
    }
}