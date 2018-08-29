package cn.zw.spring.aop.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HiZwAroundMethod implements MethodInterceptor{

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("Method name:"+methodInvocation.getMethod().getName());
		System.out.println("Method arguments:"+Arrays.toString(methodInvocation.getArguments()));
		//相当于MethodBeforeAdvice
		System.out.println("HiZwAroundMethod : Before method hizw");
		Object result=methodInvocation.proceed();
		System.out.println("HiZwAroundMethod : After method hizw");
		return result;
	}
}
