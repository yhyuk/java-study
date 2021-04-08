package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		 5번 Question
		 
		 요구사항 : 숫자 2개와 연산자 1개를 입력받아 연산과정과 결과 출력
		 
		 조건 :
		 - 정수만 입력
		 - 연산 결과는 소수 이하가 생기면 첫째자리까지 출력
		 - 연산자는 산술연산자만 입력하시오.
		 - +, -, *, /, % 5개
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		int first = Integer.parseInt(reader.readLine());

		System.out.print("두번째 숫자 : ");
		int second = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자 : ");
		char operator = reader.readLine().charAt(0);
		
		if (operator == '+') {
			System.out.printf("%d + %d = %d", first, second, first+second);
		} else if (operator == '-') {
			System.out.printf("%d - %d = %d", first, second, first-second);
		} else if (operator == '*') {
			System.out.printf("%d * %d = %d", first, second, first*second);
		} else if (operator == '/') {
			System.out.printf("%d / %d = %.1f", first, second, first/(double)second);
		} else if (operator == '%') {
			System.out.printf("%d %% %d = %d", first, second, first%second);
		}
		
	}
	
}
