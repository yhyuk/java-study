package com.test.question.q28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q004 {
	
	public static void main(String[] args) {
		
		//입력받아 회원정보 출력하기
		
		String data = "D:\\class\\java\\파일_입출력_문제\\단일검색.dat";
		Scanner scan = new Scanner(System.in);
		String num, name, address, phone;
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			
			System.out.print("이름: ");
			String input = scan.nextLine();
			
			String temp;
			while ((temp=reader.readLine()) != null) {
				
				String[] str = temp.split(",");
				num = str[0];
				name = str[1];
				address = str[2];
				phone = str[3];
				
				if(input.equals(str[1])) {
					System.out.printf("[%s]\n번호: %s\n주소: %s\n전화:%s\n"
										,name
										,num
										,address
										,phone);
				} 
			}
			reader.close();
			
		} catch (Exception e) {}
		
	}

}
