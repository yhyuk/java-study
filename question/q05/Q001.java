package com.test.question.q05;

public class Q001 {

	public static void main(String[] args) {
		
		/*
		
		  1번 Question
		  
		  요구사항 : 인자로 받은 숫자들의 합을 구하는 메소드 선언 -> 호출 하시오
		 
		*/
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		
	}
	
	public static void sum(int num1) {
		
		System.out.printf("%d = %d", num1, num1);
		
	}
	
	public static void sum(int num1, int num2) {
		
		System.out.printf("%d + %d = %d",
						num1, num2,
						num1 + num2);
		
	}
	
	public static void sum(int num1 , int num2, int num3) {
		
		System.out.printf("%d + %d + %d = %d",
						num1, num2, num3,
						num1 + num2 + num3);
	}
	
	public static void sum(int num1, int num2, int num3, int num4) {
		
		System.out.printf("%d + %d + %d + %d = %d",
						num1, num2, num3, num4,
						num1 + num2 + num3 + num4);
		
	}
	
	public static void sum(int num1, int num2, int num3, int num4, int num5) {
		
		System.out.printf("%d + %d + %d + %d + %d = %d",
						num1, num2, num3, num4, num5,
						num1 + num2 + num3 + num4 + num5);
		
	}
}
