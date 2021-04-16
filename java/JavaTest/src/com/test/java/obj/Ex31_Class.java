package com.test.java.obj;

public class Ex31_Class {

	public static void main(String[] args) {
		
		//Ex31_Class.java
		
		//객체(Object)
		// - 철학 용어
		// - 데이터 + 행동(Behavior)
		// - 변수 + 메소드
		
		
		/*
		 *  클래스의 용도
		 *  1. 데이터 집합: 멤버 변수들의 집합
		 *  2. 행동 집합: 멤버 메소드들의 집합
		 *  3. 데이터 + 행동 집합 : 멤버변수  +멤버 메소드 들의 집합 -> 80~90%
		 * 
		 */
	
		divide(10, 2);
		add(10, 20);
	
		add(10, 20); // == Ex31_Class.add(10,20) , 우리동네	
		MyMath.add(10, 20); // 다른동네 
		//
		
	}// main
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void divide(int a, int b) {
		System.out.println(a / b);
	}
	
	
}//같은 동네



//행동의 집합(메소드)
class MyMath { // 다른 동네
	
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void substarct(int a, int b ) {
		System.out.println(a - b);
	}
	
	public static void mutiply(int a , int b) {
		System.out.println(a * b);
	}
}