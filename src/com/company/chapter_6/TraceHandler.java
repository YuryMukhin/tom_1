package com.company.chapter_6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ymukhin on 8/30/2017.
 */
public class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
