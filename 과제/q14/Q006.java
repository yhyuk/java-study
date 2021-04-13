package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q006 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("주민등록번호 : ");
		String userNum = reader.readLine();
		userNum = userNum.replace("-", "");
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
