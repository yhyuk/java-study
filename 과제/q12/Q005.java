package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 : ");
		int first = Integer.parseInt(reader.readLine());
				
		System.out.print("종료 숫자 : ");
		int second = Integer.parseInt(reader.readLine());
		
		
		int sum = 0;
		for(int i=first; i<=second; i++) {
			
			sum += i;
			if(i<second) System.out.printf("%d + ", i);
			else if(i==second) System.out.printf("%d = %d", i, sum);
		}
	
	}
	
}
