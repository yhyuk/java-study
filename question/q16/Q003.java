package com.test.question.q16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행 입력 : ");
		int row = Integer.parseInt(reader.readLine());
		
		System.out.print("열 입력 : ");
		int line = Integer.parseInt(reader.readLine());
		
		
		
		int[][] arr = new int[row][line];
		int n = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[j][i] = n;
				n++;
			}
		}
		
		output(arr);
		
		
		
	}
	private static void output(int[][] num) {
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[0].length; j++) {
				System.out.printf("%3d", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}
}
