package com.test.question.q06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q005 {

	public static void main(String[] args) throws IOException {
		
		/*
		
		 5번 Question
		 
		 요구사항 : 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아빠 생일(년) : ");
		int father_year = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(월) : ");
		int father_month = Integer.parseInt(reader.readLine());
		
		System.out.print("아빠 생일(일) : ");
		int father_date = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(년) : ");
		int daughter_year = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(월) : ");
		int daughter_month = Integer.parseInt(reader.readLine());
		
		System.out.print("딸 생일(일) : ");
		int daughter_date = Integer.parseInt(reader.readLine());
		
		
		Calendar father_age = Calendar.getInstance();
		Calendar daughter_age = Calendar.getInstance();
		
		// 입력받은 년, 월, 일 값을 각각 넣어주기
		father_age.set(father_year, father_month, father_date);
		daughter_age.set(daughter_year, daughter_month, daughter_date);
		
		// 년,월,일 -> 초
		long father_ageTick = father_age.getTimeInMillis();
		long daughter_ageTick = daughter_age.getTimeInMillis();		
		
		// 초 -> 일
		long result = (daughter_ageTick - father_ageTick) / 1000 / 60 / 60 / 24;
		
		System.out.printf("아빠는 딸보다 총 %d일을 더 살았습니다.", result);
		
	}

	
}
