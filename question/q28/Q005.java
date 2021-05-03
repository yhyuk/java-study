package com.test.question.q28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q005 {
	
	public static void main(String[] args) {
		
		/*
		 *  검색_회원: 회원번호, 이름, 주소
		 *  검색_주문: 주문번호, 물품명, 구매수량, 회원번호
		 *  
		 *  출력: 번호, 주문번호, 이름, 상품명, 개수, 배송지
		 */
		Scanner scan = new Scanner(System.in);
		
		String data = "D:\\class\\java\\파일_입출력_문제\\검색_회원.dat";
		String data2 = "D:\\class\\java\\파일_입출력_문제\\검색_주문.dat";
		
		String num, name,address; //회원번호, 이름, 주소
		String pcNum, pcName, pcGet, pcMember; //주문번호, 물품명, 구매수량, 회원번호
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			BufferedReader reader2 = new BufferedReader(new FileReader(data2));
			
			System.out.print("이름: ");
			String input = scan.nextLine();
			
			String temp;
			System.out.println("==== 구매내역 ====");
			System.out.println("[주문번호]  [이름]  [상품명]  [개수]  [배송지]");

			while ((temp=reader.readLine()) != null) {
				
				String[] str = temp.split(",");
				num = str[0];
				name = str[1];
				address = str[2];
				
				if(input.equals(str[1])) {
					
					while ((temp=reader2.readLine()) != null) {
						String[] str2 = temp.split(",");
						pcNum = str2[0];
						pcName = str2[1];
						pcGet = str2[2];
						pcMember = str2[3];
						
						if(str[0].equals(str2[3])) {
							System.out.printf("%6s %8s %5s %6s %12s\n"
									, pcNum
									, name
									, pcName
									, pcGet
									, address);
						}
						
					}
					
				}
			}
			reader.close();
			
		} catch (Exception e) {}
		
		
	}

}
