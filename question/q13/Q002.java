package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 *  별찍기-2
		 *  - 오른쪽정렬
		 *  - 1개 시작, 1개씩 증가
		 *  
		 *       *
		 *      **
		 *     ***
		 *    ****
		 *   *****
		 *   
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 행 입력 : ");
		int row = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<row; i++) {
			
			for(int j=1; j<row-i; j++) System.out.print(" "); //오른쪽정렬, 빈칸 채우기
			for(int j=0; j<i+1; j++) System.out.print("*"); //1개씩 ++

			System.out.println();
			
		}
	}
}
