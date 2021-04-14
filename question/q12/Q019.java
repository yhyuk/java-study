package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q019 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 숫자 2개를 입력받아 각각의 약수와 두숫자의 공약수를 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		int first = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자 : ");
		int second = Integer.parseInt(reader.readLine());
		
		System.out.printf("%d의 약수 : ", first); 
		for (int i=1; i<=first; i++) { //첫번째 숫자 약수 구하기
			
			if (first%i==0 && first>i) { //자기 자신 제외 ,로 구분
			
				System.out.print(i + ", ");
				
			} else if (first%i==0 && first==i) { //자기 자신 약수 끝.
				
				System.out.print(i);
			
			}
			
		}
		
		
		System.out.println();
		System.out.printf("%d의 약수 : ", second);
		for (int j=1; j<=second; j++) { //두번째 숫자 약수 구하기
			
			if (second%j==0 && second>j) { //자기 자신 제외 ,로 구분
				
				System.out.print(j + ", ");
				
			} else if (second%j==0 && second==j) { //자기 자신 약수 끝.
				
				System.out.println(j);
				
			}
			
		}
		
		int min = first>second ? first : second; 
		
		System.out.printf("%d와 %d의 공약수 : ", first, second);
		for (int i=1; i<=min; i++) { // 두 숫자 공약수 구하기
			
			if (i==1) {
				System.out.print(i);
			}
			else if(first%i==0 && second%i==0) {
				
				System.out.print(" ,"+ i); 
				
			} 
		}

	}
	
	
}
