package com.lap;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectFlat {
   
@DeclareParents(defaultImpl = CarImp.class , value = "com.lap.Flat")
    Car car ;

    @Before("execution(public int com.lap.Flat.getMyNum(..))")
    public void beforeMehtod(JoinPoint jp) {
        System.out.println("hi this is befor");
        System.out.println(jp.getArgs());
    }
    @Before("execution(public int com.lap.Car.numberOfDoors(..))")
    public void beforeCarMehtod(JoinPoint jp) {
        System.out.println("hi this is befor Car");
        System.out.println(jp.getArgs());
    }

    @AfterReturning(pointcut = "execution(public int com.lap.Flat.getMyNum(..))", returning = "myNum")
    public void afterMethod(JoinPoint jp, Object myNum) {
        System.out.println("hi this is after");
        System.out.println(jp.getSignature());
        System.out.println(myNum);
    }

    @Around("execution(public int com.lap.Flat.getMyNum(..))")
    public Object aroundMethod(ProceedingJoinPoint pjp) {
        System.out.println("this is the around before");
        // Object myNum = null;
        Object myNum = null;
        try {
            myNum = pjp.proceed();
        } catch (Throwable e) {
            e.getStackTrace();
        }
        System.out.println("this is the around after");

        return myNum;
    }

}
