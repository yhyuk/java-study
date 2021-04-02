package com.test.question.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 
		 3번 Question
		 
		 - 요구사항 : 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오
		 - 조건 : 사각형 넓이 = 가로 * 높이, 사각형 둘레 = 가로 * 2 + 높이 * 2
		
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("너비(cm): ");
		int weight = Integer.parseInt(reader.readLine());	
		System.out.print("높이(cm): ");
		int height = Integer.parseInt(reader.readLine());
		
		System.out.printf("사각형의 넓이는 %dcm² 입니다.\n", weight*height);
		System.out.printf("사각형의 둘레는 %dcm 입니다.\n", (weight*2)+(height*2));
		
		

	}
	
}
