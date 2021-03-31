package com.test.java;

import java.security.PublicKey;

public class Ex03_DataType {
	public static void main(String[] args) {
		
		/* 변수 p20~41
		자료형, Data Type p55~85
		- 데이터의 형태, 길이(범위) 등을 미리 정의하고 분류한 규칙(약속) 
		- 숫자:1,2,3,4,5 / 문자:홍길동,ㄱ,ㄴ,ㄷ,ㄹ,아무개
		
		자바 언어의 자료형
		1. 원시형(Primitive Type), 값형(Value Type)
			- 숫자형(양수 + 음수)
				- 정수형
					- byte : 	1byte(8bit)
					- short : 	2byte(16bit)
					- int : 	4byte(32bit)
					- long : 	8byte(64bit)
					
				- 실수형(부동소수점)
					- -무한대 ~ +무한대
					- float:	4byte(32bit) 범위?(X) ->단정도형(정도: 정밀도, 정확도)
					- double:	8byte(64bit) 범위?(X) ->배정도형(정밀도가 배나 높음)
				
			- 문자형
				- char : 2byte
				- 다른 언어(옛날 언어) : char(1byte)
				- 1byte(256) - > 2byte(Unicode)(65536)
			- 논리형
				- boolean : 1byte
				- 명제(참, 거짓) -> true, false
				
				
		2. 참조형(Reference Type)
			- 나중에 수업(2~3주차)
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		성적 처리 프로그램
		- 데이터 : 학생 성적 -> 메모리 등록
		
		1.내가 취급하려는 데이터를 선택
		- 국어 점수
		
		2. 데이터의 형태와 길이를 선택
		- 국어 점수 : 형태(숫자) + 길이(0~100)
		
		3. 자바의 자료형을 선택
		- byte 선택(-128 ~ 127)
		
		4. 메모리에 3번의 자료형에 해당하는 공간은 얻어오기
		- 변수
		
		5. 얻은 공간에 데이터 입출력하기
		
		*/
		
//		byte ku; //변수값 선언하기
//		ku = 10; // 초기화
//		System.out.println(ku); //변수(변하는 수)값 호출 , 화면 출력(println)
//		System.out.println(100);
//		ku = 20;
//		System.out.println(ku);
//		System.out.println(100); // 10 -> 상수(변하지 않는 수) = 데이터 = 리터럴(Literal)
//		
//		byte a = 10;
//		byte b;
//		b = 20;
//		b = a;
//		System.out.println(b);
//		//자바는 변수가 초기화되지 않은 상태에서 사용이 불가능		
		int x = 10;
		int y = 20;
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.println(x);
		System.out.println(y);
	
	}
	
}
