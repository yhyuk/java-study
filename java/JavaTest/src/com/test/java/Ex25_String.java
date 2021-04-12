package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_String {
	
	public static void main(String[] args) throws IOException {
		
		// Ex25_String.java ( 중요 )
		
		// 문자열, String
		// - 문자열 관련된 여러가지 기능을 자바가 제공
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		//m1();
		//m2(reader);
		//m3(reader);
		m4(reader);
	}

	private static void m4(BufferedReader reader) {
		// 유효성
		// - 이름입력 > 2~5자 이내 + 한글만...
		
		//소문자로만 구성
		String id = "test";
		
		for (int i=0; i<id.length(); i++) {
			
			char c = id.charAt(i);
			int code = (int)c;
			
			
			//유효성 검사 -> 잘못된 경우를 찾는것이 좋다.
			if (code < 97 || code > 122) {
				System.out.println("잘못된 문자가 있습니다.");
				break; // 잘못된 문자 발견시 더이상 유효성검사 X
			}
			
			
		}
		System.out.println("종료");
	}

	private static void m3(BufferedReader reader) throws IOException {
		
		/*
		 *  문자열 추출 
		 *  - 원하는 위치의 문자를  추출
		 *  - char charAt(int index)
		 *  - index : 추출하고자 하는 문자의 위치(첨자, index, 서수)
		 *  - 서수를 0부터 센다. > Zero-based Index (자바)
		 * 
		 */
		String txt = "안녕하세요";
		
//		char c = txt.charAt(6);
//		System.out.println(c);
		
		for (int i=1; i<=10; i++) {
			//10회전(사용빈도 낮음)
		}
		
		for (int i=0; i<10; i++) {
			//10회전(사용빈도 높음)
			//이유:
			//- 컴퓨터는 숫자를 0부터 읽으며, int length()과 char charAt(index)
			//- 보통 문자열 추출할때 for문을 많이 쓰기때문
		}
		

		for (int i=0; i<txt.length(); i++) { 
			System.out.println(txt.charAt(i));
		}
	}

	private static void m2(BufferedReader reader) throws IOException {

		/*
		 *  길이 - 유효성검사
		 * 
		 *  예시>
		 *  회원 가입 -> 이름입력 -> [유효성 검사] -> DB저장(10글자)
		 *  -> 20자 입력 -> DB 에러 발생
		 * 
		 */
		
		
		

		//이름 입력 > 2~5자 이내
//		System.out.print("이름 입력 : "); 
//		String name = reader.readLine();
//		 
//		if (name.length() >= 2 && name.length() <= 5) {
//		System.out.println("회원가입 진행..."); } else {
//		System.out.println("이름은 2~5자 이내로 입력하세요."); }

		
		//올바른 이름을 입력할때 까지 위의 작업을 반복해보자.
		String name = "";
		
		while (true) {
			System.out.print("이름 : ");
			name = reader.readLine();
			
			if (name.length() >= 2 && name.length() <= 5) {
				break;
			} else {
				System.out.println("이름은 2~5자 이내로 입력하세요.");
			}
		} //while
		
		System.out.println("회원 가입..");
		
		
	
	}

	private static void m1() throws IOException {
		
		/*
		 *  문자열 길이
		 *  - 문자열을 구성하는 문자의 갯수(글자 수)
		 *  - int length();
		 * 
		 */
		
		String txt = "";
		
		txt = "ABCDEF"; //6글자
		
		System.out.println(txt.length()); //txt의 문자갯수? 6개
		System.out.println("ABCDEF".length()); //변수로 쓸수있는것은 상수로 사용ㄱ ㅏ능
		
		txt = "123 홍길동 !@#";
		System.out.println(txt.length()); // 숫자, 한글, 영어, 특수문자, 공백 -> 모두 1글자 취급
		
		System.out.println((int)' '); //스페이스(32)
		System.out.println((int)'	'); //탭(9)
		System.out.println((int)'\t');
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		txt = reader.readLine();
		
		//요구사항] 사용자 입력한 문장이 몇글자?
		System.out.printf("입력한 문장은 총 %d개의 문자로 구성되어어있습니다.", txt.length());
		
		
	}

}
