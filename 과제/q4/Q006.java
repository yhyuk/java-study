package com.test.question.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		  
		  6번 Question
		  
		  요구사항 : 국, 영, 수 점수를 전달하면 '합격' or '불합격' 단어를 반환하는 메소드 선언 -> 호출하시오
		  
		  메소드 : String test(int, int, int)
		  			int, int, int : 국어, 영어, 수학
		  			return String : '합격' or '불합격'
		  
		  조건 : 1. 평균 점수 60점 이상은 '합격'
		  		2. 평균 점수 60점 미만은 '불합격'
		 
		  추가조건 : 과락 있음 ---> 한 과목 이상 40점 미만이면 불합격이다.
		  
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("국어 : ");
		int kor = Integer.parseInt(reader.readLine());
		
		System.out.print("영어 : ");
		int eng = Integer.parseInt(reader.readLine());
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(reader.readLine());
		
		
		System.out.printf("%s입니다.",test(kor,eng,math));
		
		
		
	}
	
	public static String test(int kor, int eng, int math) {
		
		int average = (kor+eng+math) / 3;
		return average >= 60 ? "합격" : "불합격";
		
	}
	
	
}
