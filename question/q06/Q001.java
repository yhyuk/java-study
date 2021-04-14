package com.test.question.q06;

import java.util.Calendar;

public class Q001 {

	public static void main(String[] args) {
		
		/*
		
		 1번 Question
		
		 요구사항 : 아래의 코드를 참고해서 현재 시간을 출력하는 메소드 선언 -> 호출
		 
		 메소드 : void nowTime()
		  
		*/
		
		nowTime();
		nowTime_AMPM();
		
	}

	private static void nowTime_AMPM() {
		
		//현재시간(오전, 오후)
		Calendar now = Calendar.getInstance();
		System.out.printf("현재시간 : %s %d시 %02d분 %02d초\n"
			, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
							, now.get(Calendar.HOUR)
							, now.get(Calendar.MINUTE)
							, now.get(Calendar.SECOND));
					
	}

	private static void nowTime() {
		
		//현재시간
		Calendar now = Calendar.getInstance();
		System.out.printf("현재시간 : %d시 %02d분 %02d초\n"
							, now.get(Calendar.HOUR_OF_DAY) 
							, now.get(Calendar.MINUTE)
							, now.get(Calendar.SECOND));
	}
	
}
