package com.test.question.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		  
		  7번 Question
		  
		  요구사항 : 지하철 탑승 소요 시간을 구하시오
		  		(지나가는 역의 개수, 환승역의 횟수 등을 전달 받아 총 소요시간을 반환하는 매소드 선언 -> 호출
		  
		  메소드 : int getTime(int, int)
		  
		  조건 : 각 역간의 소요 시간 (2분)
		  		환승역의 소요 시간 (3분)
		  
		  추가조건 :
		 
		 여유가 된다면 3번째 매개변수 추가해보기
		 
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("역의 개수 : ");
		int station = Integer.parseInt(reader.readLine());
		
		System.out.print("환승역의 횟수 : ");
		int transfer = Integer.parseInt(reader.readLine());
		
		
		System.out.printf("평상시 총 소요 시간은 %d분 입니다.\n", getTime_day(station, transfer));
		System.out.printf("출근시 총 소요 시간은 %d분 입니다.\n", getTime_go(station, transfer));
		System.out.printf("퇴근시 총 소요 시간은 %d분 입니다.\n", getTime_leave(station, transfer));
		
	}
	
	
	public static int getTime_day(int station, int transfer) {
	
		int total_time = station*2 + transfer*3;
		return total_time;
		
	}
	
	public static int getTime_go(int station, int transfer) {
		
		int total_time = station*2 + transfer*4;
		return total_time;
		
	}
	
	public static int getTime_leave(int station, int transfer) {
		
		int total_time = station*2 + transfer*5;
		return total_time;
		
	}
	
}
