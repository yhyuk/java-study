package com.test.question.q16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q009 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 
		 *  Question : 가운데로 점점 숫자가 증가하는 달팽이 2차 배열
		 *  
		 *  가로의 j값의 증감
		 *  세로의 i값의 증감
		 *  
		 *  1set(0~5) : (0,0)(0,1)(0,2)(0,3)(0,4)
		 *  2set(6~9) : (1,4)(2,4)(3,4)(4,4)
		 *  3set(10~13) : (4,3)(4,2)(4,1)(4,0)
		 *  4set(14~16) : (3,0)(2,0)(1,0)
		 *  
		 *  j 끝까지 증감 -> i 끝까지 증감 -> j 끝까지 감소 -> i 끝까지 감소
		 *  
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = Integer.parseInt(reader.readLine());
		
		
		
		int[][] arr = new int[size][size];
		int num = 1; //start
		int count = size * size; //end
		int j = 0, x = size; //가로
		int i = 0, y = size-1; //세로
		
		while(num<=count) {
			
			//1set
			for(int k=0; k<x; k++) {
				arr[i][j] = num;
				j++; num++;
			}x--; i++; j--;
			
			//2set
			for(int k=0; k<y; k++) {
				arr[i][j] = num;
				i++; num++;
			}y--; i--; j--;
			
			//3set
			for(int k=0; k<x; k++) {
				arr[i][j] = num;
				j--; num++;
			}x--; i--; j++;
			
			//4set
			for(int k=0; k<y; k++) {
				arr[i][j] = num;
				i--; num++;
			}y--; i++; j++;

		}
		
		output(arr);

	}
	
	private static void output(int[][] num) {
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%3d", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

}
