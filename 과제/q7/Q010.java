package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q010 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
	 	
	 	 10번 Question
	 	 
	 	 요구사항 : 날짜를 입력받아 조건에 맞게 결과 출력
	 	 
	 	 조건 : 
	 	 - 입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
	 	 - 입력받은 날짜가 휴일이면 아무것도 안한다.
	 	
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년 :");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("월 :");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("일 :");
		int day = Integer.parseInt(reader.readLine());
		
		Calendar time = Calendar.getInstance(); // 입력한 년, 월, 일 time에 저장
		time.set(year, month-1, day);
		
		int week = time.get(Calendar.DAY_OF_WEEK); // 요일(평일, 주말)
		
		int saturday = 7-week; // 평일 -> 토요일로 이동
		time.add(Calendar.DATE, saturday);
		

		if (week <= 6 && week >= 2) { 		//2~6 : 월~금 1,7 : 일,토
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF' 입니다", time);
		} else {
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다.");
		}
		
	}
	
}
