package com.test.java;

public class Ex20_if {

	public static void main(String[] args) {
		
		// Ex20_if.java
		
		/*
		
		 제어문
		 - 수많은 명령어들을 제어하는 도구
		 - 명령어들의 실행 순서 or 반복 등을 제어한다.
		 - 조건 제어, 반복 제어, 분기 제어
		 
		 1. 조건문
		 	a. if
		 	b. switch
		 
		 2. 반복문
		 	a. for
		 	b. while
		 	c. do while
		 	d. for
		 
		 3. 분기문
		 	a. break
		 	b. continue
		 	c. goto(JDK 1.5 폐지)
		 	
		 
		
		*/
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {
		
		// 조건식, Condition
		// - 반드시 boolean값을 가진다.(java)
		// - 다른 언어는 조건식의 결과로 boolean이 아닌 값을 가지기도 한다.
		// - 정수: 0(false), 그 이외의 숫자(true), 1(true)
		// - 실수: 0.0(false), 그 이외의 숫자(true)
		// - 문자: \0(문자코드값(0), null문자)(false), 그 이외의 모든 문자(true)
		// - 문자열: ""(빈문자열, false), "홍길동"(true)
		
		int n = 10;
		
		if (n > 0) {
			
		}
		
		
	}

	private static void m2() {
		
		// 입력 숫자 -> 짝수 or 홀수?
		int num = 2;
		
		if (num%2 == 0) {
			System.out.println("짝수입니다.");
		} else if (num%2 == 1){
			System.out.println("홀수입니다.");
		} else if (num == 0) {
			System.out.println("0 입니다.");
		}
		
		
		// 나이 입력 > 우리가 원하는 나이대?
		// - 19세 이상 ~ 60세 미만
		
		// if (19 <= age < 60)
		// Error : The operator < is undefined for the argument type(s) boolean, int
		// 19 <= age < 60
		// true < 60
		
		// 19 <= age < 60
		// 19 <= age && age <60 (이 방법이 괜찮긴한데, 나중에는 가독성이 떨어진다.)
		
		// 19 <= age --> 19가 age보다 작거나 같다. (상수가 앞으로 오는 것보다 뒤에 있는게 좋음)
		// age >= 19 --> age가 19보다 크거나 같다. (주최가 앞으로 오는게 좋음. 변수가 앞, 상수가 뒤가 가독성이 좋음)
		
		
		// 코드를 작성할 때는 항상 들여쓰기(tap) 중요..
		// 나중에 코딩 컨벤션.. -> 코드 작성하는 규칙
		
		int age = -20;
		
		// 중첩 if문(Nested if statement)
		// 예외 처리 코드(유효성 검사)
		if (age >= 1 && age <= 140) {		
			
			
			//업무 코드(비즈니스 코드)
			if (age >= 19 && age < 60) {
				System.out.println("회원가입 진행 OK");
			} else {
				System.out.println("회원가입 진행 X");
			}
			
		} else {
			System.out.println("나이가 올바르지 않습니다.");
		}
		
	}

	private static void m1() {
		
		/*
		
		 if문
		 - 조건을 제시한 후 조건의 결과에 따라서 실행문을 실행할지 결정 제어
		 - 조건식의 결과는 반드시 boolean(참true, 거짓false)
		 
		 
		 if (조건식) {
		 	실행문;
		 
		 }
		 
		 
		 if (조건식) {
		 	실행문;
		 } else {
		 	실행문;
		 }		 
		
		 
		 if (조건식) {
		 	실행문;
		 } else if (조건식) {
		 	실행문;
		 }
		 
		 
		 if (조건식) {
		 	실행문;
		 } else if (조건식) {
		 	실행문;
		 } else if (조건식) {
		 	실행문;
		 } else if (조건식) {
		 	실행문;
		 }
		 
		 
		 
		 if (조건식) {
		 	실행문;
		 } else if (조건식) {
		 	실행문;
		 } else {
		 	실행문;
		 }
		 
		 
		 if (조건식) {
		 	실행문;
		 } 
		 [else if (조건식) {
		 	실행문;
		 }] x N 
		 [else {
		 	실행문;
		 }]
		 
		 
		 
		 
		*/
		
		//예시1.
		if (true) {
			
		}
		
		//2.
		boolean flag = true;
		
		if (flag) {
			
		}
		
		//3.
		int num = 10;
		if (num > 0) {
			
		}
		
		//4. 
		if (test()) {
			
		}
		
		
		
		int n = -10;
		
		//n이 양수입니까?
		if (n > 0) {
			System.out.println("양수 입니다. ");
		}
		
		
		
		n = -10;
		
		if (n > 0) {
			System.out.println("양수 입니다. ");
		} else {
			System.out.println("양수가 아닙니다.");
		}
		
		
		n = 0;
		
		if (n > 0) {
			System.out.println("양수 입니다.");
		} else if(n < 0) {
			System.out.println("음수 입니다.");
		} else if (n == 0) {
			System.out.println("0 입니다.^^");
		}
		
		
		if (n > 0) {
			System.out.println("양수 입니다.");
		} else if(n < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0 입니다.^^");
		}
		
		
		
		
		
		System.out.println("프로그램 종료 ");
		
		
		// 기상 시각
		int hour = 7;
		
		if (hour < 8) {
			System.out.println("지하철 타고 출근합니다.");
		} else {
			System.out.println("택시를 타고 출근합니다.");
		}
		
		
		if (hour < 8) {
			System.out.println("지하철 타고 출근합니다.");
		} else if (hour < 9) { // 8~9시 기상 
			System.out.println("택시를 타고 출근합니다.");
		} else { // 9시 넘어서 기상
			System.out.println("결근한다.");
		}
		
		
		
		
	}//m1
	
	public static boolean test() {
		return true;
		
	}
	
}
