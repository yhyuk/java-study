package com.test.question.q6;

import java.util.Calendar;

public class Q002 {

	public static void main(String[] args) {
		
		/*
		
		 2번 Question
		 
		 요구사항 : 오늘 태어난 아이의 백일과 첫돌이 언제인지 구하시오
		 
		*/

			
		Calendar baby_100 = Calendar.getInstance();
		Calendar baby_birth = Calendar.getInstance();
		
		
		// 일수 계산 할 때 오늘일자를 포함할 것인지, 아닌지 확인! 
		// 대부분 오늘 날짜 포함 --> -1
		// 월, 년 산술연산은 반드시 add() 쓸 것!!
		baby_100.add(Calendar.DATE, 100 - 1);
		baby_birth.add(Calendar.YEAR, 1);
		
		System.out.printf("백일 : %tF\n", baby_100);
		System.out.printf("첫돌 : %tF\n", baby_birth);
		
		
		// 방법2
		

	}
	
}
