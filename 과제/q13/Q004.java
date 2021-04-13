package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 *  별찍기-4
		 *  - 1개 시작, 1칸씩 공백 증가
		 *  
		 *   *
		 *    *
		 *     *
		 *  	*
		 *  	 *
		 *  
		 */
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 행 입력 : ");
		int row = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<i; j++) System.out.print(" "); //공백채우기

			System.out.println("*");
			
		}

	}

}
