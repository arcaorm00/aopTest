package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public void aferThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("[" + methodName+ " �޼ҵ尡 ������������ ����Ǿ����ϴ�.]");
	}
	
	public void aferReturning(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("[" + methodName+ " �޼ҵ带 ���� �Ϸ��߽��ϴ�.]");
	}
	
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println("[Ÿ���� �Ǵ� " + methodName + " �޼ҵ带 ������ ���Դϴ�.]");
	}
	
	/*
	public void before() {
		System.out.println("[Ÿ���� �Ǵ� �޼ҵ带 �����ϱ� ���Դϴ�.]");
	}
	*/
	
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println("[Ÿ���� �Ǵ� " + methodName + " �޼ҵ带 �����ϱ� ���Դϴ�.]");
	}
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + " ����");
		long start = System.currentTimeMillis();
		try {
			re = joinPoint.proceed(); //Ÿ���� �Ǵ� �޼ҵ带 ȣ��
		}catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println(methodName + " ����");
		long finish = System.currentTimeMillis();
		System.out.println("�޼ҵ� ���� �ҿ�ð�: " + (finish-start));
		return re;
	}
}
