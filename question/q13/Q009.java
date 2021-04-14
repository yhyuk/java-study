package com.test.question.q13;

public class Q009 {
	
	public static void main(String[] args) {
		
		//1+2+4+7+11+16 ... +N = 469
		//1, 2, 3, 4, 5 .. +씩 커짐

		int sum = 0;
		int n = 1;
		
		for (int i=1; true; i++) {

			if (n > 100) { //n이 100보다 크면 종료
				break;
			}
			
			System.out.printf("%d + ", n);
			
			sum += n; //증감된수 ++
			n += i; //1,2,3,4,... 증감
			
		}
		
		System.out.printf("\b\b\b = %d\n", sum);
		
		
	}

}
