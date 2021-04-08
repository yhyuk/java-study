package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {

	public static void main(String[] args) throws IOException {
		
		/*
		
		 3번 Question
		 
		 요구사항 : 문자 1개를 입력받아 출력
		 
		 조건 : 
		 - f, F = Father
		 - m, M = Mother
		 - s, S = Sister
		 - b, B = Brother
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		char word = reader.readLine().charAt(0);
		
		if (word == 'f' || word == 'F') {
			System.out.println("Father");
		} else if (word == 'm' || word == 'M') {
			System.out.println("Mother");
		} else if (word == 's' || word == 'S') {
			System.out.println("Sister");	
		} else if (word == 'b' || word == 'B') {
			System.out.println("Brother");
		}
		
	}
}
