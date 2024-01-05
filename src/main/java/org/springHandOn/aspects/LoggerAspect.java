package org.springHandOn.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* org.springHandOn.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(
                joinPoint.getSignature().getName().toString()
                        + " method execution start ");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        logger.info(
                String.format(joinPoint.getSignature().getName().toString() +
                        "method execution end ,Took %s", timeElapsed));
    }

    @Around("@annotation(org.springHandOn.interfaces.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info(
                joinPoint.getSignature().getName().toString()
                        + " method execution start ");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        logger.info(
                String.format(joinPoint.getSignature().getName().toString() +
                        "method execution end ,Took %s", timeElapsed));

    }
}
