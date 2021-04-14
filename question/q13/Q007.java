package com.test.question.q13;

public class Q007 {

	public static void main(String[] args) {

		
		
		//방법1 - 2중 for
		for (int i=1; i<=10; i++) {
			
			int sum = 0, j;
			for(j=1; j<=i*10; j++) sum += j;
			System.out.printf("%d ~ %3d = %4d\n",i, j-1, sum);
			
		}
		
		/*
		//방법2 - for - if
		for (int i=1; i<=100; i++) {
			sum += i;
			if(i%10 == 0) {
				System.out.printf("1 ~ %d = %d\n", i, sum);
			}
			
		}
		*/
		
		
	}
	
}
