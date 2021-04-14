package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 *  별찍기
		 *  - 왼쪽정렬
		 *  - 5개 시작, 1개씩 감소
		 *  
		 *   *****    
		 *    ****
		 *     ***
		 *    	**
		 *    	 *
		 *   
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 행 입력 : ");
		int row = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<row; i++) {
			
			for (int j=0; j<i; j++) System.out.print(" "); //왼쪽정렬, 빈칸채우기
			for (int j=0; j<row-i; j++) System.out.print("*"); //1개씩 --
			
			System.out.println();
			
		}
		
	}

}
