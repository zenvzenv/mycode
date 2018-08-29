package cn.zw.spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HiZwBeforeMethod implements MethodBeforeAdvice{

	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("HiZwBeforeMethod : Before method hizw");
	}
	
}
