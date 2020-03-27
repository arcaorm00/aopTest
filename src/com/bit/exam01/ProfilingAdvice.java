package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public void aferThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("[" + methodName+ " 메소드가 비정상적으로 종료되었습니다.]");
	}
	
	public void aferReturning(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("[" + methodName+ " 메소드를 정상 완료했습니다.]");
	}
	
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("[타깃이 되는 " + methodName + " 메소드를 실행한 후입니다.]");
	}
	
	/*
	public void before() {
		System.out.println("[타깃이 되는 메소드를 실행하기 전입니다.]");
	}
	*/
	
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println("[타깃이 되는 " + methodName + " 메소드를 실행하기 전입니다.]");
	}
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + " 시작");
		long start = System.currentTimeMillis();
		try {
			re = joinPoint.proceed(); //타깃이 되는 메소드를 호출
		}catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println(methodName + " 종료");
		long finish = System.currentTimeMillis();
		System.out.println("메소드 동작 소요시간: " + (finish-start));
		return re;
	}
}
