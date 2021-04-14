package com.test.question.q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q012 {
	
	public static void main(String[] args) throws IOException {
		
		//연산식을 입력받아 실제 연산하기
		
		/* 
		 *  조건 :
		 *  - 산술 연산자만 구현 (+, -, *, /, %)
		 *  - 연산식의 공백은 무관
		 *  - 산술연산자가 존재하는지 체크
		 *  - 피연산자의 갯수가 2개인지 체크
		 *  
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("연산입력 : ");
		String input = reader.readLine();
		input = input.replace(" ", "");
		
		String intStr = "";
		int n = 0;
		
		// %:37 *:42 +:43 -:45 /:47
		// 37 ~ 47
		
		// 48 ~ 57
		for(int i=0; i<input.length(); i++) {
			
			//숫자를 제외한 문자추출
			char ch = input.charAt(i);
			if(ch <= 48 || ch >= 57) {
				intStr += ch;
			}

		}

		for(int i=0; i<intStr.length(); i++) {
			switch(intStr) {
				case "+":
					n = input.indexOf('+');
					break;
				case "-":
					n = input.indexOf('-');
					break;
				case "*":
					n = input.indexOf('*');
					break;
				case "/":
					n = input.indexOf('/');
					break;
				case "%":
					n = input.indexOf('%');
					break;
				default:
					System.out.println("연산자가 올바르지 않습니다.");
			}
			
			String strNum1 = input.substring(0,n);
			String strNum2= input.substring(n+1);
			
			
			int intNum1 = Integer.parseInt(strNum1);
			int intNum2 = Integer.parseInt(strNum2);
	
			
			if (intStr.equals("+")) {
				System.out.printf("%d %s %d = %d",intNum1, intStr, intNum2, intNum1+intNum2);
			} else if (intStr.equals("-")) {
				System.out.printf("%d %s %d = %d",intNum1, intStr, intNum2, intNum1-intNum2);
			} else if (intStr.equals("*")) {
				System.out.printf("%d %s %d = %d",intNum1, intStr, intNum2, intNum1*intNum2);
			} else if (intStr.equals("/")) {
				System.out.printf("%d %s %d = %f",intNum1, intStr, intNum2, intNum1 / (double)intNum2);
			} else if (intStr.equals("%")) {
				System.out.printf("%d %s %d = %d",intNum1, intStr, intNum2, intNum1 % intNum2);
			} else if (intNum1 <= 48 || intNum1 >= 57) System.out.println("피연산자가 부족합니다.");
			else if (intNum2 <= 48 || intNum2 >= 57) System.out.println("피연산자가 부족합니다.");
			
		}

	}

}
