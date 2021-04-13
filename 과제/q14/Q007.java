package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws IOException {
		
		//숫자를 입력받아 3자리마다 ,를 붙이시오.
		//%,d 사용금지
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		String num = reader.readLine();
		
		System.out.println(num.lastIndexOf(3));
		
		
	}
	
	
}
