package com.test.question.q04;

public class Q001 {
	
	public static void main(String[] args) {
		
		/*
		 
		  1번 Question
		  
		  요구사항 : 호출하면 인사말을 출력하는 메소드 3개를 선언 -> 호출 하시오
		  메소드 서명 : void hello(), introduce(), bye()
		 
		*/
		
		hello();
		introduce();
		bye();
		
	}
	
	public static void hello() {
		
		System.out.println("안녕하세요.");
		
	}
	
	public static void introduce() {
		
		System.out.println("저는 홍길동입니다.");
		
	}
	
	public static void bye() {
		
		System.out.println("안녕히가세요.");
		
	}
	
}
