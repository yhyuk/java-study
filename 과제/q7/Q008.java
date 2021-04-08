package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q008 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 
		 8번 Question
		 
		 요구사항 : 주차 요금을 계산하시오
		 
		 조건 : 
		 - 무료 주차 : 30분
		 - 10분 초과당 : 2,000원
		 - Calendar를 사용해서 한번 풀고, 사용안하고 풀기
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int in_hour = Integer.parseInt(reader.readLine());
		
		System.out.print("분 : ");
		int in_min = Integer.parseInt(reader.readLine());
		
		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int out_hour = Integer.parseInt(reader.readLine());
		
		System.out.print("분 : ");
		int out_min = Integer.parseInt(reader.readLine());
		
		
		fee(in_hour, in_min, out_hour, out_min);
		//fee_Cal(in_hour, in_min, out_hour, out_min);
		
		
	}//main
	
	
	public static int fee(int in_hour, int in_min, int out_hour, int out_min) {
		
	 	// 방법1. Calendar X

		int in_time = in_hour * 60 + in_min; // 들어온시간(분)
		int out_time = out_hour * 60 + out_min; // 나간시간(분)
		int parking_time = out_time - in_time; // 총 주차시간(분)
		
		int parking_money = (parking_time - 30)/ 10 * 2000; 
		if (parking_time >= 30) {
			System.out.printf("주차시간은 %d분이며, 주차 요금은 %,d원입니다.", parking_time, parking_money);
		} else if (parking_time <= 30) {
			System.out.printf("주차시간이 %d분이며, 주차 요금은 없습니다.", parking_time);
		}
		
		return parking_time;
		
		/*

		 * 시,분을 분으로 바꾸는방법
	     if (minuteOut > minuteIn) {
	        totalMinute = (hourOut - hourIn - 1) * 60 + (60 + (minuteOut - minuteIn));
	     } else {
	    	 totalMinute = (hourOut - hourIn) * 60 + (minuteOut - minuteIn);
	     }
	       
	     if (totalMinute <= 30) {
	        fee = 0;
	     } else {
	        fee = (totalMinute - 30) / 10 * 2000;
	     }
	     
		*/
		
	}
	
	public static int fee_Cal(int in_hour, int in_min, int out_hour, int out_min) {
		
		// 방법2. Calendar O
	
		Calendar in_time = Calendar.getInstance();
		in_time.set(Calendar.HOUR_OF_DAY, in_hour);
		in_time.set(Calendar.MINUTE, in_min);
		//in_time.set(Calendar.SECOND, 0); //오차범위줄이기 위해서
		//in_time.set(Calendar.MILLISECOND, 0);
		
		Calendar out_time = Calendar.getInstance();
		out_time.set(Calendar.HOUR_OF_DAY, out_hour);
		out_time.set(Calendar.MINUTE, out_min);
		//out_time.set(Calendar.SECOND, 0);
		//out_time.set(Calendar.MILLISECOND, 0);
		
	
	    
		long in_timeTick = in_time.getTimeInMillis();
		long out_timeTick = out_time.getTimeInMillis();		
		
		long parking_time = (out_timeTick - in_timeTick)/1000/60;
		
		long parking_money = ((parking_time - 30)/10)*2000;
		
		if (parking_time >= 30) {
			System.out.printf("주차 요금은 %,d원입니다.", parking_money);
		} else if (parking_time <= 30) {
			System.out.printf("주차 요금은 없습니다.");
		}
		
		return (int) parking_money;
		
	}
	
	
}
