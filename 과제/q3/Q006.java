package com.test.question.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {

	public static void main(String[] args) throws IOException  {
		
		/*
		 
		 6번 Question
		 
		 - 요구사항 : 영문 소문자 하나를 입력 받은 뒤 대문자로 변환해서 출력하시오.
		 - 도움 : 대문자와 소문자의 문자 코드값이 어떤 관계인가?, (int)'A' -> 65, (char)65 -> 'A'
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력: ");
		int letter = reader.read();

		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다 ",letter,(letter-32));
	}
	
}
