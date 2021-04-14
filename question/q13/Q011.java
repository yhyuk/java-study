package com.test.question.q13;

public class Q011 {
	
	public static void main(String[] args) {
		
		// 2 ~ 100 사이의 소수
		
		for (int i=2; i<=100; i++) { //2부터 100까지
			
			int j;
			for (j=2; j<=i; j++) {
				if(i%j == 0) break; //소수는 1과 자기자신으로만 나눠짐
			}
			
			if (i==j) System.out.print(i + " ");

		}
		
	}

}
