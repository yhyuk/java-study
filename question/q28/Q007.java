package com.test.question.q28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Calendar;

public class Q007 {
	
	public static void main(String[] args) {
		
		/*
		 *  직원들의 지각/조퇴 횟수 카운트해서 출력하기
		 *  출결.dat: 날짜, 이름, 출근시간, 퇴근시간
		 *  출력: 이름, 지각, 조퇴
		 *  
		 *  조건: 출근 오전9시, 퇴근 오후6시
		 */
		
		String data = "D:\\class\\java\\파일_입출력_문제\\출결.dat";
		
		String date, name, go, leave; 
		
		try {
			
			System.out.println("[이름]  [지각]  [조퇴]");
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			Calendar late = Calendar.getInstance();
			Calendar early = Calendar.getInstance();
			late.set(0, 0, 0, 9, 0);
			
			String temp="";
			while ((temp=reader.readLine()) != null) {
				String str[] = temp.split(",");
				data = str[0];
				name = str[1];
				go = str[2];
				leave = str[3];
					
			}
			
		} catch (Exception e) {}
		
		
		
	}

}
