package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("종료 값 : ");
		int end = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		
		for(int i=1; i<=end; i++) {
			
			sum += i;
			
			if (sum <= end) System.out.printf("%d + ", i); // 종료값 넘어가면 종료
			else {
				System.out.printf("%d = %d", i, sum);
				break;
			}

		}
	}
}
