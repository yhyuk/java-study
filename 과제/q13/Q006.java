package com.test.question.q13;

public class Q006 {

	public static void main(String[] args) {
		
		//구구단 출력
		for (int i=1; i<=9; i++) { 
			for (int j=2; j<=5; j++) { //2~5단
				
				System.out.printf("%d x %d = %2d ", j, i, i*j);
				System.out.print("   ");
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i=1; i<=9; i++) {
			for (int j=6; j<=9; j++) { //6단~9단
				
				System.out.printf("%d x %d = %2d ", j, i, i*j);
				System.out.print("   ");
				
			}
			System.out.println();
			
		}
		
	}
	
}
