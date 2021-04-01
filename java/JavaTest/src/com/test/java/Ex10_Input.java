package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import java.io.BufferedReader; // 창고에서 도구를 가져와 사용 한다는 뜻 --> 클래스를 import
// import java.io.InputStreamReader;

// 위 겹치는 import java.io. 부분을 아래 처럼 가능
// import java.io.*; // *(wild card - all) , Java에서의 "*"는 모든걸 포함한다는 뜻

// Ctrl + Shift + O
// --> import 안된 클래스를 한번에 자동 생성, 굉장히 많이 쓰임
// --> 한번 썻다가 안쓰는 클래스는 다시 단축키를 이용하면 자동 삭제됨

public class Ex10_Input {

	public static void main(String[] args) throws IOException {
		
		// Ex10_Input.java
		// BufferedReader : 클래스
		
		// System.out.print("문자 입력 : ");
		
		// int a = 10; <-- 이것과 아래의 코드는 형식상 똑같다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// reader : 입력을 받을 수 있는 도구
		
		// int data = reader.read(); // 잘 사용안함(Ex09참고) 한글자, 한글자씩 하기 때문 불편함
		// System.out.println(data);
		
		// String data = reader.readLine(); // 입력한 라인 전체를 반환한다. (******)
		// System.out.println(data);
		
		
		
		
		//이클립스 주석 단축키
		// - 단일라인 : Ctrl + /
		// - 다중라인 : Ctrl + Shift + /  --> 풀때는 Ctrl + Shift + \
		
		
		
		
		
		// 요구사항 : 이름 입력 > 인사하시오.
//		System.out.print("이름 입력 : ");
//		String name = reader.readLine();
//		
//		System.out.printf("안녕하세요. %s님\n", name);
		
		
		
		
		// 요구사항 : 태어난 년도를 입력 받아 나이를 출력 하시오.
//		System.out.print("출생년도 입력 : ");
//		String year = reader.readLine();
		
		
		// 나이 값 : 2021 - year
		// 연산 불가 : 2021 - "1995"
		// int age = 2021 - year; // Error : The operator - is undefined for the argument type(s) int, String
		// reader.readLine(); --> 항상 String만 받음. 그렇다면 어떻게 해결 할까?
		
		
		// "문자열" -> (변환) -> 숫자 변환 방법
		// "문자열" -> byte : Byte.parseByte("문자열")
		// "문자열" -> short : Short.parseShort("문자열")
		// "문자열" -> int : Integer.parseInt("문자열")
		// "문자열" -> long : Long.parseLong("문자열")
		// "문자열" -> float : Float.parseFloat("문자열")
		// "문자열" -> double : Double.parseDoulbe("문자열")
		// "문자열" -> boolean : Boolean.parseBoolean("문자열")
		// "문자열" -> char : X
		// "A" -> 'A' : "A".charAt(0)

		
//		int iyear = Integer.parseInt(year); // "1995"(문자) -> 1995(숫자) 변환과정
//		int age = 2021 - iyear;
//		System.out.printf("제 나이는 %d살 입니다.\n", age+1);

		
		
		
		
		// 요구사항 : 
		// 숫자(정수)를 2개 입력받아 + 연산을 하시오.
		// 연산 과정과, 결과를 모두 출력 하시오.
		
		
		System.out.print("첫번째 숫자: "); 
		String data1 = reader.readLine();
		int first = Integer.parseInt(data1);
		// 위 코드를 data1 변수지정 없이 아래 처럼 한줄 코드로 가능하다.
		// int first = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		String data2 = reader.readLine();
		int second = Integer.parseInt(data2);
		
		System.out.printf("%d + %d = %d\n", first, second, first+second);
		
		
	}
	
		

}
