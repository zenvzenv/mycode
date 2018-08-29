package cn.zw.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HiZwAfterMethod implements AfterReturningAdvice{

	public void afterReturning(Object returnValue, Method method, Object[] arg2,
			Object target) throws Throwable {
		System.out.println("HiZwAfterMethod : After method hizw");
	}

}
