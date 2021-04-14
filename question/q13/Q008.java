package com.test.question.q13;

public class Q008 {
	
	public static void main(String[] args) {
	
		int sum = 0; 
		int i;
		
		for (i=1; i <= 100; i++) { 
			sum += i; 
			if (i%10 == 0) { 
				System.out.printf("%d ~ %d : %d\n",i-9, i, sum); 
				sum = 0; 
			} 
		}

	}
}
