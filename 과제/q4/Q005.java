package com.test.question.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		  5번 Question
		  
		  요구사항 : 숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어를 반환하는 메소드를 선언 -> 호출 하시오
		  
		  메소드 서명 :
		  String getNumber(int)
		  	int : 숫자
		  	return String : '홀수' or '짝수'
		  	
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		
		int input_num = Integer.parseInt(reader.readLine());
		
		System.out.printf("입력하신 숫자 '%s'는(은) '%s'입니다.",input_num, getNumber(input_num));
	}
	
	public static String getNumber(int num) {
		
		return num%2 == 0 ? "짝수" : "홀수";
	
	}
	
}
