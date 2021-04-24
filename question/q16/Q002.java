package com.test.question.q16;

public class Q002 {
	
	public static void main(String[] args) {
		
		// 역순출력
		
		int[][] arr = new int[5][5]; //5x5
		int n = 25; //시작값을 1이 아닌 최대값 25
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n --;
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
