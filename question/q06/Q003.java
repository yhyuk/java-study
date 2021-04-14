package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q003 {

	public static void main(String[] args) throws IOException {
		
		/*
		
		 3번 Question
		 
		 요구사항 : 태어난 년도를 입력하면 나이를 출력하시오
		 
		 조건 : 실행은 현재년도 기준, 우리나이 나이로 출력
		 
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도 : ");
		
		int year = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		
		int age = now.get(Calendar.YEAR) - year;
		
		System.out.printf("나이(만) : %d세\n", age);
		System.out.printf("나이 : %d세", age+1);
		
		
	}

}
