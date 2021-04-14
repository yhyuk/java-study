package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자를 입력받아 각 자릿수의 합구하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		String num = reader.readLine();
		
		int sum =0;
		
		for(int i=0; i<num.length(); i++) {
			sum += (num.charAt(i) - '0'); // 입력받은값 한글자씩 빼서 sum에 누적
			
		}
		
		System.out.printf("%s의 각자리 합 : %d",num, sum);
		
		
		
	}
	
}
