package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		 9번 Question
		 
		 요구사항 : 년도를 입력받아 해당 년도가 '평년'인지 '윤년'인지 출력
		 
		 조건 : 
		 - a. 년도를 4로 나눈다.
		 	- 떨어지면 b 검사
		 	- 떨어지지 않으면 "평년"
		 
		 - b. 년도를 100으로 나눈다.
		 	- 떨어지면 c 검사
		 	- 떨어지지 않으면 "윤년"
		 
		 - c. 년도를 400으로 나눈다.
		 	- 떨어지면 "윤년"
		 	- 떨어지지 않으면 "평년"
		 
		 - Calendar, Date 클래스 사용 X
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(reader.readLine());
		
		// 4, 400은 나누어 떨어지면 "윤년" (100은 제외)
		// 나머지 "평년"
		
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.printf("%d년은 '윤년'입니다.", year);
		} else{
			System.out.printf("%d년은 '평년'입니다.", year);
		}
		
	}
	
	
}
