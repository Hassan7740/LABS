package com.lap;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

public class BeforeAdvisor implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object target)throws Throwable {  
        System.out.println("additional concern before actual logic");  
        System.out.println("method info:"+method.getName()+" "+method.getModifiers());  
        System.out.println("argument info:");  
        System.out.println(args.length);
        for(Object arg:args)  
            System.out.println(arg);  
        System.out.println("target Object:"+target);  
        System.out.println("target object class name: "+target.getClass().getName());  
    }  
}
