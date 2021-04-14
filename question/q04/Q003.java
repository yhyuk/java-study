package com.test.question.q04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q003 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 
		  3번 Question
		  
		  요구사항 : 숫자 1개를 입력받아 4자리로 출력하는 메소드를 선언 -> 출력 하시오
		  
		  메소드 서명 : void digit(int)
		  
		  조건 : 인자가 4자리 이상이면 그대로 출력한다.
		  
		*/
		
		System.out.print("숫자 입력 : ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(reader.readLine());
		
		digit(num);
		
	}
	
	public static void digit(int num) {
		
		System.out.printf("%04d", num);
	}
	
}
