package com.test.question.q28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;

public class Q006 {
	
	public static void main(String[] args) {
		
		/*
		 *  문법검사
		 *  대상 괄호 : (), {}
		 *  Stack 사용
		 *  
		 *  괄호.java
		 *  자바소스.java
		 */
		
		String data = "D:\\class\\java\\파일_입출력_문제\\괄호.java";
		String data2 = "D:\\class\\java\\파일_입출력_문제\\자바소스.java";
		
		Stack<Character> stack = new Stack<Character>();
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(data));
			//BufferedReader reader = new BufferedReader(new FileReader(data2));
			
			String temp;
			
			char ch, check;
			boolean result = false;
			while ((temp=reader.readLine()) != null) {
				
				for(int i=0; i<temp.length(); i++) {
					
					ch = temp.charAt(i);
					
					switch(ch) {
						case '(': case'{':
							stack.push(ch);
							break;
						case ')': case'}':
							if (stack.isEmpty()) result = true;
							else {
								check = stack.pop();
								if ((check == '(' && ch != ')') ||
									(check == '{' && ch != ')'))
									result = true;
								else break;
							}
					}
				}
				if(stack.isEmpty()) result = true;
				else result = false;
			}
			reader.close();
			
			System.out.println(result);
			

		} catch (Exception e) {}
	}
}
