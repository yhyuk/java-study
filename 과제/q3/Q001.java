package com.test.question.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 
		 1번 Question
		 
		 - 요구사항 : 태어난 년도를 입력받아 나이를 출력하시오.
		 - 조건 : 우리나이로 출력, 현재시각은 2021년
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도: ");
		
		int year = Integer.parseInt(reader.readLine());	
		System.out.printf("나이: %d세\n",2021-year);
	}
	
}
