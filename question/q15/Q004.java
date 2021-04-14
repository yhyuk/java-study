package com.test.question.q15;

public class Q004 {
	
	public static void main(String[] args) {
		
		//1~20 사이의 난수를 담고있는 배열 생성 최대값과 최솟값 구하기
		
		int[] randomArray = new int[20];
		int max = 0;
		int min = 100;
		
		System.out.print("원본 : ");
		
		for(int i=0; i<randomArray.length; i++) {
			
			int random = (int) (Math.random() * 20) +1;
			randomArray[i] = random;
			
			System.out.printf("%d,", randomArray[i]);
			if(randomArray[i] >= max) {
				max = randomArray[i];
			}
			if(randomArray[i] <= min) {
				min = randomArray[i];
			}
			
		}
		System.out.print("\b");
		System.out.println();
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최소값 : %d\n", min);
		
	}

}
