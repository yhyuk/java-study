package com.test.java;

import java.util.Arrays;

public class Ex28_Array {
	
	public static void main(String[] args) {
		
		/*
		 *  배열의 차원
		 *  - 1차원 배열
		 *  - 2차원 배열
		 *  - 3차원 배열
		 *  ....
		 *  - N차원 배열  
		 * 
		 * 
		 */
		
		//m1();
		//m2();
		//m3();
		int[][] num = new int[5][5];
		int n =1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				num[i][j] = n;
				n++;
				System.out.printf("%3d", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
	}//main

	private static void m3() {

		//5x5 배열
		int[][] num = new int[5][5];
		
		int n = 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				num[i][j] = n;
				//num[j][i] = n;
				n++;
				//System.out.printf("i : %d, j : %d\n", i, j);
			}
		}
		
		output(num);
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

	private static void m2() {
		
		//배열 초기화 리스트
		
		//1차원 배열
		int[] num1 = new int[] {10,20,30,40,50};
		
		//2차원 배열 (2x3)
		int[][] num2 = new int[][] {{10,20,30}, {40,50,60}};
		int[][] num2_1 = new int[][] {
										{10,20,30}, 
										{40,50,60}
									}; //가독성 좋게 이런식으로 작성가능
		
		//3차원 배열 (2x3x4)							
									
		int[][][] num3 = new int[][][] {
											{
												{10,20,30,40}, {10,20,30,40}, {10,20,30,40}
											},
											{
												{10,20,30,40}, {10,20,30,40}, {10,20,30,40} 
											}, 
											{
												{10,20,30,40}, {10,20,30,40}, {10,20,30,40} 
											}
										};							
		
	}

	private static void m1() {

		//1차원 배열
		int[] num1 = new int[5];
		
		//2차원 배열
		int[][] num2 = new int[3][4]; //3층짜리 각각 4개의 방이 있는 건물! > 12개방
		
		//3차원 배열
		int[][][] num3 = new int[2][3][4]; //2개의 동에 3층짜리 각각 4개의 방이 있는 건물! > 24개방
		
		//초기화
		
		//1차원 배열
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		
		
		//2차원 배열
		num2[0][0] = 10;
		num2[0][1] = 20;
		num2[0][2] = 30;
		num2[0][3] = 40;

		
		num2[1][0] = 50;
		num2[1][1] = 60;
		num2[1][2] = 70;
		num2[1][3] = 80;

		
		num2[2][0] = 90;
		num2[2][1] = 100;
		num2[2][2] = 110;
		num2[2][3] = 120;

		
		//3차원 배열
		
		num3[0][0][0] = 10;
		num3[0][0][1] = 20;
		num3[0][0][2] = 30;
		num3[0][0][3] = 40;
		
		num3[0][1][0] = 60;
		num3[0][1][1] = 70;
		num3[0][1][2] = 80;
		num3[0][1][3] = 90;
		
		num3[0][2][0] = 110;
		num3[0][2][1] = 120;
		num3[0][2][2] = 130;
		num3[0][2][3] = 140;
		
		num3[1][0][0] = 510;
		num3[1][0][1] = 520;
		num3[1][0][2] = 530;
		num3[1][0][3] = 540;
		
		num3[1][1][0] = 550;
		num3[1][1][1] = 560;
		num3[1][1][2] = 570;
		num3[1][1][3] = 580;
		
		num3[1][2][0] = 590;
		num3[1][2][1] = 5100;
		num3[1][2][2] = 5110;
		num3[1][2][3] = 5120;
		
		//다차원 배열 탐색
		//1차원 배열 -> 단일 for문
		for(int i=0; i<num1.length; i++) {
			System.out.printf("%d",i, num1[i]);
		}
		System.out.println();
		
		//2차원 배열 -> 2중 for문
		for(int i=0; i<num2.length; i++) {
			for (int j=0; j<num2[i].length; j++) {
				//System.out.printf("num2[i] = %d\n", i, num2[i]);
				System.out.printf("%5d", num2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//3차원배열 -> 3중 for문
		
		for(int i=0; i<num3.length; i++) {
			for(int j=0; j<num3[i].length; j++) {
				for(int k=0; k<num3[i][j].length; k++) {
					System.out.printf("%5d", num3[i][j][k]);
					
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		
		
		//2차원 배열의 길이(방 갯수)
		//int[][] num2 = new int[3][4]; // 3층4칸 -> 12개방	
		System.out.println(num2.length); //3
		System.out.println(num2[0].length); //4
		System.out.println(num2[1].length); //4
		System.out.println(num2[2].length); //4
		
		
		
		
	}
	
	

}
