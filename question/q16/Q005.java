package com.test.question.q16;

public class Q005 {
	
	public static void main(String[] args) {
		
		// 숫자 다이아 형태 출력
		// 2중for 두번쓰자
		int[][] arr = new int[5][5]; //5x5
		int n = 1;
		
		for(int i=0; i<3; i++) { // 0~2행
			//중간 가운데 start 
			//[0][2]시작 --> [2][4]종료 
			for(int j=2-i; j<=i+2; j++) { 
				arr[i][j] = n;
				n++;
			}
		}
		//output(arr); 
		//-----------------------------------
		for(int i=3; i<5; i++) { // 3~4행
			// 3행부터 start 
			// [3][1]시작 --> [4][2]종료
			for(int j=i-2; j<=6-i; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		
		output(arr);
		
		
		
	}
	
	private static void output(int[][] num) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}
