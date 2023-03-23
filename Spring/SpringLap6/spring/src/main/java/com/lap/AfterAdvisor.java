package com.lap;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method,
            Object[] args, Object target) throws Throwable {
        System.out.println("additional concern after returning advice");
        System.out.println("method info:" + method.getName() + " " + method.getModifiers());
        System.out.println(args.length);
        for (Object arg : args)
            System.out.println(arg);
        System.out.println("target Object:" + target);
        System.out.println(returnValue);
    }

}
