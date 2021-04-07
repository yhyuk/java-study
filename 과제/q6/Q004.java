package com.test.question.q6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q004 {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 
		  4번 Question
		  
		  요구사항 : 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		  
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("남자이름 : ");
		String man_name = reader.readLine();
		
		System.out.print("여자이름 : ");
		String woman_name = reader.readLine();
		
		System.out.print("만난날(년) : ");
		int couple_year = Integer.parseInt(reader.readLine());
		
		System.out.print("만난날(월) : ");
		int couple_month = Integer.parseInt(reader.readLine());
		
		System.out.print("만난날(일) : ");
		int couple_date = Integer.parseInt(reader.readLine());
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n", man_name, woman_name);
		
		// Calendar에서 컴퓨터가 월(month)은 0부터 시작
		// -> 입력받은 월(month)에서 -1
		// -> 입력받은 날로부터 이므로 -1
		Calendar couple = Calendar.getInstance();
		couple.set(couple_year, couple_month-1, couple_date);
		

		couple.add(Calendar.DATE, 100-1);
		System.out.printf("100일 : %tF\n", couple);
		
		couple = Calendar.getInstance();
		couple.add(Calendar.DATE, 200-1);
		System.out.printf("200일 : %tF\n", couple);
		
		couple = Calendar.getInstance();
		couple.add(Calendar.DATE, 300-1);
		System.out.printf("300일 : %tF\n", couple);
		
		couple = Calendar.getInstance();
		couple.add(Calendar.DATE, 500-1);
		System.out.printf("500일 : %tF\n", couple);
		
		couple = Calendar.getInstance();
		couple.add(Calendar.DATE, 1000-1);
		System.out.printf("1000일 : %tF\n", couple);
		
		/*
		
		<다른방법>
		- 100,200,300,500,1000일 각각 변수 지정해주기
		
		Calendar couple_100 = Calendar.getInstance();
		couple_100.set(couple_year, couple_month-1, couple_date);
		
		Calendar couple_200 = Calendar.getInstance();
		couple_200.set(couple_year, couple_month-1, couple_date);
		
		Calendar couple_300 = Calendar.getInstance();
		couple_300.set(couple_year, couple_month-1, couple_date);
		
		Calendar couple_500 = Calendar.getInstance();
		couple_500.set(couple_year, couple_month-1, couple_date);
		
		Calendar couple_1000 = Calendar.getInstance();
		couple_1000.set(couple_year, couple_month-1, couple_date);


		couple_100.add(Calendar.DATE, 100-1);
		couple_200.add(Calendar.DATE, 200-1);
		couple_300.add(Calendar.DATE, 300-1);
		couple_500.add(Calendar.DATE, 500-1);
		couple_1000.add(Calendar.DATE, 1000-1);
		
		
		System.out.printf("'%s'과(와) '%s'의 기념일\n", man_name, woman_name);
		System.out.printf("100일 : %tF\n", couple_100);
		System.out.printf("200일 : %tF\n", couple_200);
		System.out.printf("300일 : %tF\n", couple_300);
		System.out.printf("500일 : %tF\n", couple_500);
		System.out.printf("1000일 : %tF\n", couple_1000);
		
		*/
	}

	
}
