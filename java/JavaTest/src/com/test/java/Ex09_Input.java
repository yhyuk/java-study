package com.test.java;

import java.io.IOException;

public class Ex09_Input {

	public static void main(String[] args) throws IOException {
		
		// Ex09_Input.java
		
		/*
		 
		콘솔 입력
		
		(1->2->3 : 오래된 순서, 시간의 순서, 3으로 갈수록 최신)

		1. System.in.read() 메소드
		- 입력한 문자의 코드값을 반환
		- 1byte 입력만 받는다. (한글은 입력 불가 -> 이유: 한글은 2byte)
		- read() 하나당 1개의 단어만 가능
		
		
		2. BufferedReader 클래스
		
		3. Scanner 클래스
 
		*/
		
		
		// 요구사항 : 사용자에게 문자 1개를 입력 받아서 그대로 화면에 출력하시오.
		// 입력 : A
		// 출력 : 입력하신 문자는 'A' 입니다.
		
		System.out.print("문자 입력 : ");
		
		// 사용자에게 키보드 입력을 해주세요.. --> System.in.read();
		// - 언제 입력할지 예측할 수 가 없기 때문에, 이 구문에서 잠시 프로그램이 멈춤 상태가 된다.
		// - 입력 대기 상태 or Block 걸렸다.
		// - 입력은 엔터로 마무리한다.
		
		
		// 윈도우키 + r
		// - notepad :메모장
		// - mspaint : 그림장
		// - explorer : 파일탐색기
		// - iexplore : 인터넷
		// - msedge : 인터넷
		// - wordpad : 워드패드
		// - calc : 계산기
		// - cmd : 콘솔 창
		
		// read() -> 입력한 문자의 문자 코드값을 반환한다.
		
		// 문자코드값 외우기!!(앞에 숫자라도 다 외우자!)
		// A(65) ~ Z(90) 	대문자A~Z
		// a(97) ~ z(122)	소문자a~z
		// 0(48) ~ 9(57)	숫자0~9
		// 01000001
		
		int data = System.in.read();
		System.out.printf("입력하신 문자는 '%d'입니다.\n", data);
		System.out.printf("입력하신 문자는 '%c'입니다.\n", data);
		
		data = System.in.read();
		System.out.printf("입력하신 문자는 '%d'입니다.\n", data);
		System.out.printf("입력하신 문자는 '%c'입니다.\n", data);
		
		data = System.in.read();
		System.out.printf("입력하신 문자는 '%d'입니다.\n", data);
		System.out.printf("입력하신 문자는 '%c'입니다.\n", data);

		data = System.in.read();
		System.out.printf("입력하신 문자는 '%d'입니다.\n", data);
		System.out.printf("입력하신 문자는 '%c'입니다.\n", data);
		
		data = System.in.read();
		System.out.printf("입력하신 문자는 '%d'입니다.\n", data);
		System.out.printf("입력하신 문자는 '%c'입니다.\n", data);
		
		
		System.out.println("프로그램 종료");
				
		//	문자 입력 : A
		//	입력하신 문자는 '65'입니다.
		//	입력하신 문자는 'A'입니다.
		//	입력하신 문자는 '13'입니다.
		//	'입니다.
		//	입력하신 문자는 '10'입니다.
		//	입력하신 문자는 '
		//	'입니다.
		//	B
		//	입력하신 문자는 '66'입니다.
		//	입력하신 문자는 'B'입니다.
		//	입력하신 문자는 '13'입니다.
		//	'입니다.
		//	프로그램 종료
		
		// A를 입력한뒤 값은 왜 13과 10이 나올까?
		// 그다음 B
		// --> A 값을 받은 뒤, \r\n(엔터)값이 남아있기 때문에 \r = 13, \n = 10 출력됨.
		// 또 B를 입력 받은뒤 남은 \r\n(엔터)값 중, \r = 13 만 출력이 된다.
		
		
	}
}
