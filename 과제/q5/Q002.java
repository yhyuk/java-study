package com.test.question.q5;

public class Q002 {
	
	public static void main(String[] args) {
		
		/*
		
		  2번 Question
		  
		  요구사항 : 인자로 받은 이름들을 직급 순으로 출력하는 메소드 선언 -> 출력 하시오
		 
		  메소드 :	void position(String)
					void position(String, String)
					void position(String, String, String)
					void position(String, String, String, String)
		  		 	
		*/
		
		position("홍길동", "유재석", "박명수", "정형돈");
		
	}
	
	public static void position(String name1) {
		
		System.out.printf("사원 : %s\n", name1);
		
	}
	
	public static void position(String name1, String name2) {
		
		System.out.printf("사원 : %s\n", name1);
		System.out.printf("대리 : %s\n", name2);
		
	}
	
	public static void position(String name1, String name2, String name3) {
		
		System.out.printf("사원 : %s\n", name1);
		System.out.printf("대리 : %s\n", name2);
		System.out.printf("과장 : %s\n", name3);
		
	}
	
	public static void position(String name1, String name2, String name3, String name4) {
		
		System.out.printf("사원 : %s\n", name1);
		System.out.printf("대리 : %s\n", name2);
		System.out.printf("과장 : %s\n", name3);
		System.out.printf("부장 : %s\n", name4);
		
	}
	
	
}
