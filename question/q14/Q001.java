package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//문장 입력받아 역순 출력하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String sentence = reader.readLine();
		
		for (int i=sentence.length()-1; i>=0; i--) {
			System.out.print(sentence.charAt(i));
		}
		
		
	}
	
}
