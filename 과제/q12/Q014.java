package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//9자리 정수 입력 각자리 짝, 홀 숫자합 구하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("9자리 숫자 입력 : ");
		int num = Integer.parseInt(reader.readLine());
		
		int evenSum = 0; //짝수합
		int oddSum = 0; //홀수합
		
		if (num < 1000000000) { // 조건 : 9자리 이하만 가능
			for(;;) {
	
				if(num==0) {
					
					break;
					
				} else if (num%2==0) {
					
	            	evenSum += num%10;
	            	num /= 10;
	            	
	            } else if (num%2 == 1){
	            	
	            	oddSum += num%10;
	            	num /= 10;
	            	
	            }
            }
		} else {
			
			System.out.println("숫자가 9자리를 넘었습니다.");
			System.out.println("프로그램 종료합니다.");
			
		}
		
		System.out.printf("짝수의 합 : %d\n",evenSum);
		System.out.printf("홀수의 합 : %d\n",oddSum);
		
	}
}
