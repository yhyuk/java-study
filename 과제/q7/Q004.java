package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		 4번 Question
		 
		 요구사항 : 근무 년수를 입력받아 출력
		 
		 조건 : 
		 - 1~4년차 : 초급 개발자
		 - 5~9년차 : 중급 개발자
		 - 10년차이상 : 고급개발자 
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("근무 년수: ");
		int work_day = Integer.parseInt(reader.readLine());
		
		
		if (work_day >= 1 && work_day <= 4) { // (work_day < 5) 요약 가능.
			
			System.out.printf("%d년차 초보 개발자입니다.\n", work_day);
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n", 5-work_day);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10-work_day);
		
		} else if (work_day >= 5 && work_day <= 9) { // (work_day < 10) 요약가능.
			
			System.out.printf("%d년차 중급 개발자입니다.\n", work_day);
			System.out.printf("당신은 %d년전까지 초급 개발자 였습니다.\n", work_day-4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.\n", 10-work_day);
		
		} else{
			
			System.out.printf("%d년차 고급 개발자입니다.\n", work_day);
			System.out.printf("당신은 %d년전까지 초급 개발자 였습니다.\n", work_day-4);
			System.out.printf("당신은 %d년전까지 중급 개발자 였습니다.\n", work_day-9);
		
		}
		
		
	}
}
