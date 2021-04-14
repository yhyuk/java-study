package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
	 	
	 	 7번 Question
	 	 
	 	 요구사항 : 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력
	 	 
	 	 조건 : 1 ~ 10 사이의 정수만 입력받으시오
	 	
	 	 추가조건 :
	 	 - 입력 받는 숫자를 한글로 바꾸시오.
	 	 - ex) 1 -> 하나, 2 -> 둘, 셋,넷, 다섯, 여섯....열
	 	 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int num2 = Integer.parseInt(reader.readLine());	
		
		System.out.print("숫자 입력 : ");
		int num3 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int num4 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int num5 = Integer.parseInt(reader.readLine());
		
		int even_num1, even_num2, even_num3, 
			even_num4, even_num5;
		
		int odd_num1, odd_num2, odd_num3, 
			odd_num4, odd_num5;
		
		even_num1 = num1%2 == 0 ? 1 : 0;
		even_num2 = num2%2 == 0 ? 1 : 0;
		even_num3 = num3%2 == 0 ? 1 : 0;
		even_num4 = num4%2 == 0 ? 1 : 0;
		even_num5 = num5%2 == 0 ? 1 : 0;

		odd_num1 = num1%2 == 1 ? 1 : 0;
		odd_num2 = num2%2 == 1 ? 1 : 0;
		odd_num3 = num3%2 == 1 ? 1 : 0;
		odd_num4 = num4%2 == 1 ? 1 : 0;
		odd_num5 = num5%2 == 1 ? 1 : 0;

		//짝수의 개수
		int even_num = even_num1 + even_num2 + even_num3 + 
						even_num4 + even_num5; 
				
		//홀수의 개수
		int odd_num = odd_num1 + odd_num2 + odd_num3 + 
						odd_num4 + odd_num5;
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", even_num, odd_num);
		
		if (even_num > odd_num) {
			
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", even_num-odd_num);
		
		} else {
			
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", odd_num-even_num);
		
		}
		
	}
	
}
