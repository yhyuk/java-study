package com.test.question.q12;

public class Q016 {

	public static void main(String[] args) {
		
		// 피보나치 수열..?
		/*
		 *  1+1 = 2
		 *  2+3 = 5
		 *  3+5 = 8
		 *  5+8 = 13
		 *  8+13 = 21
		 *  13+21 = 34
		 *  ....
		 */
		
		
		int a = 0, b = 1; //첫번째와, 두번째의 값이 1이어야 하므로, 0, 1
		int result = 1;
		
		for(int i=1; ; i++) {
			
			i = a+b;
			a = b;
			b = i;

			if(a < 89) { // 피보나치수 100 보다 작은 숫자 89
				
				System.out.printf("%d + ", a);
				result+=i;
				
			} else {
				
				System.out.printf("%d = %d", a, result);
				break;
				
			}
		}
	}
}
