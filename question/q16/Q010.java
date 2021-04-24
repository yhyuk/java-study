package com.test.question.q16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q010 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//마방진 : 가로, 세로, 대각선의 합이 같다.

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 마방진 열/행 입력하세요.(홀수만 입력) : ");
		int size = Integer.parseInt(reader.readLine());
		
		int[][] magicSquare = new int[size][size];
		int num = 1;
		int i = 0;
		int j = 0;
		
		j = size/2; //1행 중앙 시작점
		
		
		while(num <= size*size) {
			magicSquare[i][j] = num;

			if(num % size == 0) {
				i++;
			} else {
				i--;
				j++;
			}
			
			//i값
			if(i < 0) {
				i = size-1;
			}
			if(i >= size) {
				i = 0;
			}

			
			//j값
			if(j < 0) {
				j=size-1;
			}
			if(j >= size) {
				j =0;
			}
			
			num++;
			
		}
		output(magicSquare);
		
	}
	
	private static void output(int[][] num) {
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num.length; j++) {
				System.out.printf("%2d ", num[i][j]);
			}
			System.out.println();
		}
	}

}


