package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 *  별찍기-3
		 *  - 가운데정렬 (피라미드)
		 *  - 1개 시작, 2개씩 증가
		 *  
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 *  
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 행 입력 : ");
		int row = Integer.parseInt(reader.readLine());
		
		
		for (int i=0; i<row; i++) {
			
			for (int j=1; j<row-i; j++) System.out.print(" "); //가운데정렬, 빈칸채우고 없애기
			for (int k=0; k<i*2+1; k++) System.out.print("*"); //2씩 ++
			
			System.out.println();
			
		}

		
	}
	
}
