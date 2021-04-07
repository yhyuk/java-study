package com.test.question.q6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		 6번 Question
		 
		 요구사항 : 	여러 배달음식을 같은 시간에 받기를 원하는 고객이있다.
		 			고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		 조건 :	전화를 걸면 짜장면은 10분 뒤에 도착합니다.
				전화를 걸면 치킨은 18분 뒤 도착합니다.
				전화를 걸면 피자는 25분 뒤 도착합니다.
				날짜가 바뀌는 경우는 처리하지 않습니다.
		 		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//기준점 시, 분 입력받기
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		
		System.out.print("분 : ");
		int min = Integer.parseInt(reader.readLine());
		
		//입력받은 기준점(시, 분)을 분으로 계산하기
		int time = hour*60+min;
		
		// 짜장면 10분 후
		int black = time-10;
		int black_hour = black / 60;
		int black_min = black % 60;
		
		// 치킨 18분 후
		int chicken = time-18;
		int chicken_hour = chicken / 60;
		int chicken_min = chicken % 60;
		
		// 피자 25분 후
		int pizza = time-25;
		int pizza_hour = pizza / 60;
		int pizza_min = pizza % 60;
		
		System.out.printf("짜장면 : %d시 %02d분\n", black_hour, black_min);
		System.out.printf("치킨 : %d시 %02d분\n", chicken_hour, chicken_min);
		System.out.printf("피자 : %d시 %02d분\n", pizza_hour, pizza_min);
		
	}

	
}
