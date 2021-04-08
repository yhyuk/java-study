package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {

	public static void main(String[] args) throws IOException {
		
		/*
		
		 6번 Question
		 
		 요구사항 : 영문자 1개를 입력받아 대/소문자를 변환 -> 출력
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		int word = reader.read();
		//a~z : 97~122 , A~Z : 65~90
		
		if (word >= 65 && word <= 90) { // 대문자 입력 시
			
			System.out.printf("결과 : %c", word+32);
			
		} else if (word >= 97 && word <= 122) {
			
			System.out.printf("결과 : %c", word-32); // 소문자 입력 시
			
		} else {
			
			System.out.println("잘못입력했습니다.");
			
		}
		
	}
	
	
}
