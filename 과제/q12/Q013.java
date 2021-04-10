package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q013 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=======================");
		System.out.println("\t자판기");
		System.out.println("1. 콜라 \t\t: 700원");
		System.out.println("2. 사이다 \t: 600원");
		System.out.println("3. 비타500 \t: 500원");
		System.out.println("=======================");
		
		for (;;) {
			
			System.out.print("금액 투입(원) : ");
			int money = Integer.parseInt(reader.readLine());
			System.out.println("-----------------------");
			
			System.out.print("음료 선택(번호) : ");
			int drinkNum = Integer.parseInt(reader.readLine());
			System.out.println("-----------------------");
			
			if (drinkNum == 1) {
					System.out.println("^^ 콜라를 제공합니다.");
					System.out.printf("^^ 잔돈 %,d원을 제공합니다.\n", money-700);	
			} else if (drinkNum == 2) {
					System.out.println("^^ 사이다를 제공합니다.");
					System.out.printf("^^ 잔돈 %,d원을 제공합니다.\n", money-600);
			} else if (drinkNum == 3) {
					System.out.println("^^ 비타500을 제공합니다.");
					System.out.printf("^^ 잔돈 %,d원을 제공합니다.\n", money-500);
			} else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			
			System.out.println("계속하시려면 엔터를 입력하세요.");
			String reset = reader.readLine();
		
		}
		
		
	}
	
}
