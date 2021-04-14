package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		//juminString(); //방법1 - 문자열
		juminArray(); //방법2 - 배열
		
	}//main
	
	public static void juminString() throws IOException {
		
		//방법1 - 문자열
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주민등록번호 : ");
		String userNum = reader.readLine();
		
		userNum = userNum.replace("-", ""); // "-" 제거
		
		int sum = 0;
		
		for(int i=0; i<userNum.length()-1; i++) {
			
			int digit = Integer.parseInt(userNum.substring(i, i+1)); // 각 주민번호 숫자
			sum += digit * ((i%8) + 2); // 2,3,4,5,6,7,8,9,2,3,4,5

		}
		
		//주민등록번호 공식
		sum = 11-(sum%11);
		sum = sum%10;
		
		if (sum == userNum.charAt(userNum.length()-1) - '0') 
			System.out.println("올바른 주민등록번호 입니다.");
		else 
			System.out.println("올바르지 않은 주민등록번호 입니다.");
		
	}
	
	public static void juminArray() throws IOException {
		
		//방법2 - 배열이용
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("주민등록번호 : ");
		String userNum = reader.readLine();
		int [] chk = {2,3,4,5,6,7,0,8,9,2,3,4,5}; // 곱해지는수
		
		int sum = 0; //누적값
		
		
		for (int i=0; i<chk.length; i++) {
			if(i==6) continue;
			
			sum += chk[i] * Integer.parseInt(userNum.substring(i,(i+1)));
		}
		
		int result = 11-sum%11;
		
		if (result>=10) result%=10;
		if(result == Integer.parseInt(userNum.substring(13))) {
			System.out.println("정확한 주민등록번호 입니다.");
		} else {
			System.out.println("잘못된 주민등록번호 입니다.");
		}
		
	}

}
