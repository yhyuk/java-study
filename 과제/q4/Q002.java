package com.test.question.q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q002 {

	public static void main(String[] args) throws IOException {
		
		/*
		
		  2번 Question
		  
		  요구사항 : 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언 -> 호출 하시오
		  - 메소드 인자값 / 반환값
		 
		  메소드 서명 :
		  String getName(String)
		  	- String : OOO(이름)
		  	- return String : OOO(이름)님
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("이름 : "); 
		
		String name = reader.readLine(); // 이름 입력
		
		// 방법2
		// 변수 추가해서 메소드에서 한번에 불러오는 방식
		// String result = getName(name); 
	    // System.out.println(result);   
		
		System.out.printf("고객 : %s\n", getName(name)); // 입력한 이름 출력
		
	}
	
	public static String getName(String name){
		
		// 방법2
		// 요구사항이 님을 붙이는 메소드를 선언->호출 하는것이므로 주석처리 안한 부분이 요구사항에 더 가깝다.
		// return "고객: " + name + "님";
		return name + "님";
		
	}
	
}

