package com.test.question.q16;

public class Q001 {
	
	public static void main(String[] args) {
		
		// ㄹ 형식으로 출력
		
		int[][] arr = new int[5][5]; //5x5
		
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) { // 2로 나눈 나머지가 0이라면 0,2,4행
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = n;
					n++;
				}
			} 
			else { // 2로 나눈 나머지가 0이 아니라면, 1,3행
				for(int j=4; j>=0; j--) {
					arr[i][j] = n;
					n++;
				}
			}
		}
		
		
		output(arr);
		
		
	}
	
	private static void output(int[][] num) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%3d", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}
