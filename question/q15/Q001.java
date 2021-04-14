package com.test.question.q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q001 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//숫자를 5개 입력받아 배열에 담은 뒤 역순 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] num = new int[5]; // 왜?? 5로해야되지?
		
		for(int i=1; i<=num.length; i++) {
			System.out.print("숫자 : ");
			num[i-1] = Integer.parseInt(reader.readLine());
		}
		
		for(int i=num.length-1; i>=0; i--) {
			System.out.printf("num[%d] = %d\n", i, num[i]);
		}
        
	}

}
