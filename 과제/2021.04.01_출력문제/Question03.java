package com.test.java;

public class Input_Ex03 {

	public static void main(String[] args) {
		
		// 요구사항 : 주어진 데이터를 변수를 만들어 아래와 같은 문장을 출력하시오.
		// 조건 : 날짜,내역,금액 x N개를 저장할 변수 생성
		
		// 데이터
		// 2020-01-01 : 카페라테(4,800원)
		// 2020-01-01 : 돼지불백(8,500원)
		// 2020-01-02 : 마트 장본것들(125,840원)
		// 2020-01-03 : 교통 카드 충전(45,000원)
		// 2020-01-03: 편의점(16,200원)
		
		String day1 = "2020-01-01";
		String day2 = "2020-01-02";
		String day3 = "2020-01-03";
		
		String list1 = "카페라떼";
		String list2 = "돼지불백";
		String list3 = "마트 장본 것들";
		String list4 = "교통 카드 충전";
		String list5 = "편의점";
		
		int money_list1 = 4800;
		int money_list2 = 8500;
		int money_list3 = 125840;
		int money_list4 = 45000;
		int money_list5 = 16200;
		
		int summoney = money_list1 + money_list2 + money_list3 + money_list4 + money_list5;
		
		System.out.println("[날짜]           [내역]              [금액]");
		System.out.println("----------------------------------------");
		System.out.printf("%s\t%s\t\t%,7d원\n", day1, list1, money_list1);
		System.out.printf("%s\t%s\t\t%,7d원\n", day1, list2, money_list2);
		System.out.printf("%s\t%s\t%,7d원\n", day2, list3, money_list3);
		System.out.printf("%s\t%s\t%,7d원\n", day3, list4, money_list4);
		System.out.printf("%s\t%s\t\t%,7d원\n", day3, list5, money_list5);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("총 지출 금액 : %,d원", summoney);
		
		
	}
	
}
