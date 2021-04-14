package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("종료할 누적값 : ");
		int endValue = Integer.parseInt(reader.readLine());

		int sum = 0;
		
		for(int i=1; sum<=endValue; i++) {
			
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num%2==0) {
				
				sum += num;
				System.out.printf("현재값 : %d\n\n",sum);
				
			} else {
				
				sum -= num;
				System.out.printf("현재값 : %d\n\n",sum);
				
			}
			if(sum>=endValue) {
				
				System.out.printf("총 값 : %d\n", sum);
				break;
				
			}
		}
	}
	
}
