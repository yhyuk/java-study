package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		int sw = 0;
		
		for(int i=start; i<=end; i++) {
			System.out.printf("%d", i);
			
			if (sw == 0) {
			
				sum += i;
				sw = 1; // (+) -> (-) 
				if (i==end) System.out.print(" = ");
				else System.out.print(" - ");
				
			} else {
				
				sum -= i;
				sw = 0; // (-) -> (+)
				if (i==end) System.out.print(" = ");
				else System.out.print(" + ");
				
			}
			
		}
		System.out.print(sum);
		
	}
	
}

