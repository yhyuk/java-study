package com.test.question.q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생 수 : ");
		int studentNum = Integer.parseInt(reader.readLine());
		
		String[] studentName = new String[studentNum];
		
		
		for(int i=0; i<studentName.length; i++) {
			System.out.print("학생명 : ");
			studentName[i] = reader.readLine();
		}
		
		System.out.printf("입력한 학생은 총 %d명 입니다.\n", studentNum);
		
		//정상 출력
		for(int i=0; i<studentName.length; i++) {
			System.out.printf("%d. %s\n",i+1, studentName[i]);
		}
		
		//반대로 출력
		for(int i=studentName.length-1; i>=0; i--) {
			System.out.printf("%d. = %s\n", 3-i, studentName[i]);
		}
		
	}

}
