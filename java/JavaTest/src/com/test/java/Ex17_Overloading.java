package com.test.java;

public class Ex17_Overloading {

	public static void main(String[] args) {
		
		/*
		
			Ex07_Overloading.java
			
			메소드 오버로딩, Method Overloading
			- 같은 이름의 메소드를 여러개 만들 수 있는 기술
			- 메소드가 인자 리스트의 형태를 다양하게 구성해서 동일한 매소드명을 가질 수 있게하는 기술
			- 프로그램 성능 X, 개발자에게 도움 O
			
			
			메소드 오버로딩 조건O
			1. 인자의 갯수
			2. 인자의 타입
			
			메소드 오버로딩 조건X
			1. 인자의 이름
			2. 반환값의 타입
		
		*/
		
		
		// 메소드 선언하는 중..
		// 1. public static void test() {}					// O
		// 2. public static void test() {}					// X 1번 때문에 안됨
		// 3. public static void test(int n) {}				// O
		// 4. public static void test(int m) {}   			// X 3번 때문에 안됨
		// 5. public static void test(String s) {}  		// O
		// 6. public static void test(int n, int m) {} 		// O
		// 7. public static void test(int n, String s) {}	// O
		// 8. public static void test(String s, int n) {}	// O
		// 9. public static String test(int n) {}			// X 3번 때문에 안됨
		
		
		// test();
		
		test(10); // 3
		test("홍길동"); // 5
		
		//3.
		//test(10);
		
		//9.
		//String result = test(10);
	}
	
	public static void test() {
		System.out.println("사과");	
	}
	
	
//	public static void test() {
//		System.out.println("딸기");
//	}
	
//	public static void test(int n) {
//		
//		
//		
//	}
//	
//	public static void test(int m) {
//		
//		
//		
//	}
	
	public static void test(String s) {
		
	}
	
	public static String test(int n) {
		
		return "문자열";
		
	}
	
	
	
}
