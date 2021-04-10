package com.test.question.q12;

public class Q015 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		for (int i=0; ; i++) {
			num += i;
			sum += num;
			
			if(num <= 90) { // num <= 100하면 106값 까지 +
				
				System.out.printf("%d + ",num);
				
			} else {
				
				System.out.printf("%d = %d", num, sum);
				break;
				
			}
		}

	}
	
}
