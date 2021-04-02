package com.test.question.q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws IOException {
		
		/*
		 
		 7번 Question
		 
		 - 요구사항 : 섭씨 온도를 입력받아서 화씨 온도로 변환하시오
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("섭씨(℃) : ");
		int celsius = Integer.parseInt(reader.readLine());
		System.out.printf("섭씨 %d℃는 화씨 %.1f℉ 입니다.", celsius, celsius*1.8+32);
		
		
		short a=100;
		byte b;
		
		b=(byte)a;
		
		
		
	}
	
}
