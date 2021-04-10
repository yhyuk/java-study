package com.test.question.q12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=1; i<=10; i++) {
			
			System.out.print("숫자 :");
			int num = Integer.parseInt(reader.readLine());
			
			if (num<100) { //두자리이상 X
				switch(num) {
					case 1:
						System.out.println("일");
						break;
					case 2:
						System.out.println("이");
						break;
					case 3:
						System.out.println("삼");
						break;
					case 4:
						System.out.println("사");
						break;
					case 5:
						System.out.println("오");
						break;
					case 6:
						System.out.println("육");
						break;
					case 7:
						System.out.println("칠");
						break;
					case 8:
						System.out.println("팔");
						break;
					case 9:
						System.out.println("구");
						break;
	
				}
			} else {
				System.out.println("2자리 이상 입력하셨습니다.");
				System.out.println("프로그램 종료합니다.");
				break;
			}
			
			
		}
		
	}
	
}
