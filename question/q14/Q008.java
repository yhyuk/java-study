package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q008 {
	
	public static void main(String[] args) throws IOException {
		
		//영어단어 1개 입력 받아 출력
		//HelloWorld --> Hello World
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단어 : ");
		String word = reader.readLine();
		
		String alpha = word.substring(0, 1);
		
		for (int i=1; i<word.length(); i++) {
			
			char result = word.charAt(i);
			
			if (result >= 'A' && result <= 'Z') { //대문자찾기
				
				alpha += " " + result; //공백처리
				
			} else alpha += result;

		}

		System.out.printf("결과: %s\n", alpha);

		
		
	}

}
