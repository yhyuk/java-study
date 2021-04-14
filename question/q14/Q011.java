package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q011 {

	public static void main(String[] args) throws IOException {
		
		//입력받은 문자에서 숫자 추출 -> 숫자 합
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력하세요 : ");
		String input = reader.readLine();
		String intStr = "";
		int sum = 0;
		
		for(int i=0; i<input.length(); i++) {
			//문자열에서 숫자만 구하기
			char ch = input.charAt(i);
			if(48 <= ch && ch <= 57) {
				intStr += ch;
			}
		}
		
		for(int i=0; i<intStr.length(); i++) {
			//위에서 구한 숫자 합계 구하기 
			sum += (intStr.charAt(i) - '0');
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
		
		
	}
	
}
