package com.test.question.q13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//알파벳 피라미드
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 행 입력하세요 : ");
		int num = Integer.parseInt(reader.readLine());
		
		
		for (int i=0; i<num; i++) {
			for (int j=1; j<num-i; j++) { //가운데정렬
				System.out.print(" ");
			}
			for (int k=0; k<i+1; k++) { //abccba
				System.out.printf("%c",(char)(97+k));
			}
			for (int k=0; k<i+1; k++) {
				System.out.printf("%c",(char)(i+97)-k);
			}
			
			System.out.println();
		}
		


	}
	
}
