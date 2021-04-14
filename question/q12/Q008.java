package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q008 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("year : ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("month : ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("date : ");
		int date = Integer.parseInt(reader.readLine());
		
		int total = totalDay(year, month, date);
		char weekDay = ' ';
		switch(total%7) {  //요일 구하기, 1:월 ~ 0:일
			case 1:
				weekDay = '월';
			case 2:
				weekDay = '화';
			case 3:
				weekDay = '수';
			case 4:
				weekDay = '목';
			case 5:
				weekDay = '금';
			case 6:
				weekDay = '토';
			case 0:
				weekDay = '일';
		}
		
		System.out.printf("%d-%02d-%02d일은 %,d일째 되는 날이며 %c요일 입니다.\n", 
					year, month, date, totalDay(year, month, date), weekDay);
		
	}
	public static boolean leepYear(int year) {
		
		// 윤년구하기
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true; //윤년
		} else {
			return false; //평년
		}
	}
	
	public static int totalDay(int year, int month, int date) {
		
		int total = 0; 
		
		for(int i=1; i<year; i++) { // 1.1.1 ~ 2021.03.31
			total += 365;
			if(leepYear(i)) {
				total++;
			}
		}
		
		for(int i=1; i<month; i++) {  // 각 월 일수 구하기 (윤년 구분)
			switch(i) {
				case 1: case 3: case 5: case 7:
				case 8: case 10: case 12:
					total += 31;
					break;
				case 4: case 6: case 9: case 11:
					total += 30;
				case 2:
					total += leepYear(year) ? 29 : 28; 
					break;
	
			}
		}
		total += date; // 총 일수
		
		return total;
	}
	
}

