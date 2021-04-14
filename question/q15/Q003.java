package com.test.question.q15;

import java.util.Arrays;

public class Q003 {
	
	public static void main(String[] args) {
		
		// int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드 구현 
		
		int[] list = {10,20,30,40};
		
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}
	
	public static String dump(int[] list) {

		String str = Arrays.toString(list);
		return str;
	}

}
