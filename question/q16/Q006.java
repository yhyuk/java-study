package com.test.question.q16;

public class Q006 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int n = 1;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		
		/*
	    1    2    3    4   10
	    5    6    7    8   26
	    9   10   11   12   42
	   13   14   15   16   58
	   28   32   36   40  136
		*/
		
		int total =0;
		
		for(int i=0; i<arr.length-1; i++) {
			
			int heightSum = 0;
			for(int j=0;j<arr[i].length-1; j++) {
				heightSum += arr[i][j];
			}
			arr[i][arr.length-1] = heightSum;
			total += heightSum;
	
		}
		
		for(int i=0; i<arr.length-1; i++) {
			
			int lengthSum = 0;
			for(int j=0;j<arr[i].length-1; j++) {
				lengthSum += arr[j][i];
			}
			arr[arr.length-1][i] = lengthSum;
	
		}

		arr[arr.length-1][arr.length-1] = total;
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
