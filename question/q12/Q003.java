package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		
		for (int i=1; i<=num; i++) {
			
			sum += i;
			
		}
		
		System.out.printf("1 ~ %d = %,d", num, sum);
		
	}
	
}
