package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 개수 : ");
		int cnt = Integer.parseInt(reader.readLine());
		
		
		int evenNum = 0; //짝수합
		int oddNum = 0; //홀수합
		
		for(int i=1; i<=cnt; i++) {
			
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			if (num%2==0) {
				evenNum+=num;
			} else {
				oddNum+=num;
			}
			
		}
		
		System.out.printf("짝수의 합 : %,d\n", evenNum);
		System.out.printf("홀수의 합 : %,d\n", oddNum);
		
	}
    public static int input() throws NumberFormatException, IOException {
	      
    	  //입력값 메소드 만들기
	      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      
	      System.out.print("숫자: ");
	      
	      return Integer.parseInt(reader.readLine());
	      
    } 
}
