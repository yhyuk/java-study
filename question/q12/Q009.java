package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q009 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		int random = (int) (Math.random() * 10) + 1;
		

		int i=1;
		for (i=1; i<=10; i++) {
			
			System.out.print("숫자 : ");
			int user = Integer.parseInt(reader.readLine());
			
			if(user == random) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
			
		}
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
		System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n", i);
		System.out.println("프로그램을 종료합니다. ");
		
	}
	
}


