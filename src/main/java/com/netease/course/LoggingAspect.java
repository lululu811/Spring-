package com.netease.course;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* com.netease.course.DemoTest.*(..)) && args(a, ..)")
	private void DemoDoLogging(JoinPoint jPoint,int a ) {
		System.out.println(jPoint.toString()+a);

	}

}
