package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q010 {
	
	public static void main(String[] args) throws IOException {
		
		//입력받은 금액을 한글로 출력
		//5자리까지
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("금액(원) : ");
		String money = reader.readLine();
		
		String result = "";
		String won = "";
		String dan = "";

		
		if (money.length() <= 5) { //유효성 검사 5자리 조건
			
			System.out.print("일금 : ");
			for(int i=0; i<money.length(); i++) {
				
				switch(money.charAt(i)) { // 각 자리값
					case 48: won = ""; break;
					case 49: won = "일"; break;
					case 50: won = "이"; break;
					case 51: won = "삼"; break;
					case 52: won = "사"; break;
					case 53: won = "오"; break;
					case 54: won = "육"; break;
					case 55: won = "칠"; break;
					case 56: won = "팔"; break;
					case 57: won = "구"; break;
				}
				
				switch(money.length()-i) { // 자리수로 단위 계산
					case 5: dan = "만"; break;
					case 4: dan = "천"; break;
					case 3: dan = "백"; break;
					case 2: dan = "십"; break;
					case 1: dan = ""; break;
				}
				
				result = won+dan;
				System.out.print(result);
			}
			System.out.print("원");	
			
		} else {
			System.out.println("5자리가 넘었습니다. 종료합니다.");
		}
		
		
	}

}
