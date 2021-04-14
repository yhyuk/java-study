package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q009 {
	
	public static void main(String[] args) throws IOException {
		
		//금지어를 마스킹 처리하시오.
		//금지어 : 바보, 멍청이
		//마스킹표시 : **, ***
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("입력하세요 : ");
		String input = reader.readLine();
		
		String badword = "바보";
		String badword2 = "멍청이";
		
		int search = 0;
		int cnt = 0;
		
		while ((search = input.indexOf(badword, search+1)) >= 0) {
		      cnt++;
		}
		while ((search = input.indexOf(badword2, search+1)) >= 0) {
		      cnt++;
		}

		input = input.replace(badword, "**");
		input = input.replace(badword2, "***");
		
		System.out.println(input);
		System.out.printf("금지어를 총 %d회 마스킹했습니다\n", cnt);	
		
		

	}

}
