package com.test.question.q03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q005 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 
		 5번 Question
		 
		 - 요구사항 : 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		 - 조건 : 수입의 3.3%
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("한달 수입 금액(원) : ");
		int money = Integer.parseInt(reader.readLine());
		double tax = money*0.033;
		
		System.out.printf("세후 금액(원): %,d원\n", money-(int)tax);
		System.out.printf("세금(원): %,d원\n", (int)tax);
		
	}
}
