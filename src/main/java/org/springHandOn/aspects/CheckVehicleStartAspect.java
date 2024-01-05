package org.springHandOn.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CheckVehicleStartAspect {
    @Before("execution(* org.springHandOn.services.*.*(..)) && args(isVehicleStart,..)")
    public void checkVehicleStart(JoinPoint joinPoint,Boolean isVehicleStart)throws Throwable{
        if(!isVehicleStart){
            throw new RuntimeException("Vehicle did not start");
        }
    }
}
