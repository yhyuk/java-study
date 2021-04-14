package com.test.question.q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		 2번 Question
		 
		 요구사항 : 학생의 국어점수를 입력받아 성적 출력하시오
		 
		 조건 : 
		 - 90 ~ 100 : A
		 - 80 ~ 89 : B
		 - 70 ~ 79 : C
		 - 60 ~ 69 : D
		 - 0 ~ 59 : F
		 
		 
		 추가 : 
		 - 유효성 검사(점수: 0 ~ 100점 이내)
		 - --> 입력값이 올바르게 입력되었는지?
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 방법1. 문제의 조건대로 순차적으로 코드를 짠다.
		System.out.print("점수 :");
		int kor = Integer.parseInt(reader.readLine());
		
		if (kor >= 0 && kor <= 100) {
			
			if (kor >= 90 && kor <= 100) {	
				System.out.printf("입력한 %d점은 성적 A입니다.", kor);
			} else if (kor >= 80 && kor <= 89) {
				System.out.printf("입력한 %d점은 성적 B입니다.", kor);
			} else if (kor >= 70 && kor <= 79) {
				System.out.printf("입력한 %d점은 성적 C입니다.", kor);
			} else if (kor >= 60 && kor <= 69) {
				System.out.printf("입력한 %d점은 성적 D입니다.", kor);
			} else if (kor >= 0 && kor <= 59) {
				System.out.printf("입력한 %d점은 성적 F입니다.", kor);
			}
		
		} else {
			System.out.println("입력한 점수가 올바르지 않습니다.");
		}
		
		
		// 방법2 
		// 학점을 변수로 지정
		// 조건문 중복 최소화
		
		/*
		
		char grade; // 변하는 값은 변수로 지정 해주는게 좋을거 같다
		
		if (score >= 0 && score <= 100) {
	         
	         if (score >= 90) { // 최대한 중복을 제거해서 조건문을 쓸 수 있다.
	            grade = 'A';
	         } else if (score >= 80) {
	            grade = 'B';
	         } else if (score >= 70) {
	            grade = 'C';
	         } else if (score >= 60) {
	            grade = 'D';
	         } else {
	            grade = 'F';
	         }
	         
	         System.out.printf("입력한 %d점은 성적 %c입니다.", score, grade);
	         
	      } else {
	         System.out.println("유효하지 않은 점수입니다.");
	      }
		
		
		*/
	} //main
	
}
