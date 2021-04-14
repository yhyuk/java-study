package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		  4번 Question
		  
		  요구사항 : 숫자를 2개 입력받아 산술 결과를 반환하는 메소드 5개 선언 -> 호출 하시오
		  
		  메소드 서명 : 
		  int add(int, int), 
		  int subtract(int, int),
		  int multiply(int, int),
		  double divide(int, int),
		  int mod(int, int)
		 
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int first = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int second = Integer.parseInt(reader.readLine());
		

		int result;
		
		result = add(first, second);
		System.out.printf("%d + %d = %d\n", first, second, result);
		result = add(first, first);
		System.out.printf("%d + %d = %d\n", first, first, result);
		
		result = subtract(first, second);
		System.out.printf("%d - %d = %d\n", first, second, result);
		
		result = multiply(first, second);
		System.out.printf("%d * %d = %d\n", first, second, result);
		result = multiply(first, first);
		System.out.printf("%d * %d = %d\n", first, first, result);
		
		System.out.printf("%d / %d = %.1f\n", first, second, divide(first, second));
		
		result = mod(first, second);
		System.out.printf("%d %% %d = %d\n", first, second, result);
		
		
	}
	
	public static int add(int first, int second) {
		
		return first + second;
		
	}
	

	public static int subtract(int first, int second) {
		
		return first - second;
		
	}
	
	public static int multiply(int first, int second) {
		
		return first * second;
		
	}
	
	public static double divide(int first, int second) {
		
		return first / (double)second;
		
	}
	
	public static int mod(int first, int second) {
		
		return first % second;
		
	}
}
