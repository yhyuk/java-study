package com.test.question.q16;

public class Q004 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length-i; j++) {
				arr[i][j] = n;
				n++;
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
