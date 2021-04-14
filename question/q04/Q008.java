package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q008 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		  8번 Question
		  
		  요구사항 : 사과 나무가 있다. 사과 나무 씨앗을 심을 날 부터 특정시간이 흘렀을 때 사과가 총 몇개 열리는지 구하는 메소드 선언하시오
		  
		  메소드 : int getApple(int, int)
		  
		  조건 : 사과 나무를 처음 심었을 때 나무의 길이 : 0m
		   		맑은 날 사과 나무의 성장률 : 5cm
		   		흐린 날 사과 나무의 성장률 : 2cm
		   		사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
		   		1m 넘는 시점부터 10cm 자랄 때마다 사과가 1개씩 열린다.
		   		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("맑은 날 : ");
		int sunny = Integer.parseInt(reader.readLine());
		
		System.out.print("흐린 날 : ");
		int cloudy = Integer.parseInt(reader.readLine());
		
		
		System.out.printf("사과가 총 %d개 열렸습니다.", getApple(sunny, cloudy));
		
	}
	
	public static int getApple(int sunny, int cloudy) {
		
		//방법1
		//100 부터 10 씩 1증가 (x-100)/10
		//100보다 작으면 음수값이 나온다.
		//int apple = (sunny*5 + cloudy*2 - 100)/10;
		//return apple;
		
		//방법2
		//3항 연산자 이용
		//100보다 작아도 음수값이 안나오고, 0 출력
		int height = 5 * sunny + 2 * cloudy;
	
	    int result = height >= 100 ? (height - 100) / 10 : 0;
	    
	    return result;
	}
	
}
