package com.lap;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("this is the method name from around before "+mi.getMethod());
        Object result = mi.proceed();
        System.out.println("this is the method name from around after "+mi.getArguments());

        return result;
    }
    
}
