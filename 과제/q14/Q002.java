package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {
	
	public static void main(String[] args) throws IOException {
		
		//이메일주소 입력받아 아이디와 도메인 각각 분리
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이메일 : ");
		String mail = reader.readLine();
		
		int find = mail.indexOf("@");
		
		String mailID = mail.substring(0,find); // 시작(0) 부터 find('@')까지 : ID
		String mailDomain = mail.substring(find+1); // find('@')+1 부터 ~ 끝까지 : Domain
		
		System.out.printf("아이디 : %s\n", mailID);
		System.out.printf("도메인 : %s\n", mailDomain);
		
		
		
	}

}
