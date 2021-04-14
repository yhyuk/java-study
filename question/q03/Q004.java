package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q004 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		/*
		 
		 4번 Question
		 
		 - 요구사항 : 자건거의 바퀴 지름은 26인치, 사용자가 페달 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		 - 조건 : 기어비 1:1 -> 페달 1회전 == 자전거 바퀴 1회전, 모든 출력 숫자는 천단위 표기
		 - 66. 04
		
		*/
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		int bicycle = Integer.parseInt(reader.readLine());
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.0fm를 달렸습니다.", 
							bicycle, ((66.04*3.14)*bicycle)*0.01);
		
		
	}
}
