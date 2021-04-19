package com.test.java.obj;

public class Ex39_static {
	
	public static void main(String[] args) {
		
		//Ex39_static.java
		
	
		//외부 환경
		//1. 객체 변수 접근
		StaticItem item1 = new StaticItem();
		item1.a = 100;
		
		
		//2. 정적 변수 접근
		StaticItem.b = 200;
		
		item1.aaa();
	
		StaticItem.bbb();
		
		
	}//main

}

class StaticItem { 
	
	/*
	 * 	멤버
	 *  1.변수
	 *  	a. 객체 변수 : 개인정보 저장
	 *  	b. 정적 변수 : 공용정보 저장
	 *  
	 *  2. 메소드
	 *  	a. 객체 메소드 : 개인행동
	 *  		- 객체 변수 & 정적 변수 둘 다 접근 가능
	 *  	b. 정적 메소드 : 공용(단체) 행동
	 *  		- 객체 변수 접근 불가능
	 *  		- 정적 변수 접근 가능
	 * 
	 * 
	 */
	
	public int a = 10;
	public static int b = 20;
	
	//객체 메소드
	public void aaa() {
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a); //같은 객체 내부라서 생략가능
		System.out.println(StaticItem.b); //같은 클래스 내부라서 생략가능
	}
	
	//정적 메소드
	public static void bbb() {
		//System.out.println(a); // Error: Cannot make a static reference to the non-static field a
		//위 에러는 방법없음, 쓰지못함
		System.out.println(b);
	}
}

