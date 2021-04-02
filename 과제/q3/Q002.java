package com.test.question.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 
		 2번 Question
		 
		 - 요구사항 : 숫자 2개를 입력 받아 연산 과정과 연산 결과를 출력하시오
		 - 조건 : 천단위 표기, 나누기는 소수점 1자리까지
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자: ");
		int num1 = Integer.parseInt(reader.readLine());	
		System.out.print("두번째 숫자: ");
		int num2 = Integer.parseInt(reader.readLine());
		
		System.out.printf("%d + %d = %d\n",num1,num2, num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2, num1-num2);
		System.out.printf("%d * %d = %d\n",num1,num2, num1*num2);
		System.out.printf("%d / %d = %.1f\n",num1,num2, num1/(double)num2);
		System.out.printf("%d %% %d = %d\n",num1,num2, num1%num2);
		
		
	}
	
}