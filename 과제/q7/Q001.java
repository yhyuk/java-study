package com.test.question.q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		
		 1번 Question
		 
		 요구사항 : 숫자 2개를 입력받아 큰수, 작은수 출력
		 
		 추가조건 : 
		 - 두숫자가 얼마의 차이를 보이는지 출력
		 - ex)입력한 두숫자는 2가 차이납니다.
		 
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		int first = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자 : ");
		int second = Integer.parseInt(reader.readLine());
		
		
		if (first > second) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n", first, second);
			System.out.printf("입력한 두 숫자의 차이는 %d입니다.\n", first-second);
			System.out.println("입력한 두 숫자 : 첫번째 > 두번째 입니다.\n");
		} else {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다.\n", second, first);
			System.out.printf("입력한 두 숫자의 차이는 %d입니다.\n", second-first);
			System.out.println("입력한 두 숫자 : 두번째 > 첫번째 입니다.\n");
		}
		
	}
	
}
