package com.test.java;

public class Ex13_Method {

	//main(); ?????
	
	/*
	  
	  main 메소드
	  - 특수 메소드
	  - 이름이 예약어이다.(main) : 통상 프로그램을 통틀어 유일해야 한다.
	  - 개발자(사용자,사람)가 호출하는 메소드가 아니라, JVM에 의해서 호출한다. (시스템이 호출) -> 해당 프로그램이 실행될 때 가장 먼저 main() 호출한다. -> 콜백 메소드(Callback Method)
	  - 프로그램의 시작점(Entry Point) ~ 프로그램의 종착점(End Point)
	  
	*/
	
	public static void main(String[] args) {
		
		// Ex13_Method.java
		
		/*
		 
		  메소드(Method)
		  - 메소드(Method), 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine)
		  - 코드의 집합
		  - 특정 목적을 가지고 행동하는 코드의 집합
		  - 재사용 가능한 코드 단위(***)
		  - 유지 보수성 높음(수정하기가 쉽다.) -> 반복적인 작업에 한해서..
		  - 코드를 성격에 따라 구분지어 관리 -> 관리 용이(물리적인 구분)
		  - 재사용(****) -> 다량의 코드도 1번의 호출로 재사용 가능
		  
		  # 메소드 사용법
		  1. 메소드 선언하기(정의) * 1회
		  	- ex) 
		  		public static void 메소드명() -----> 메소드 헤더, 시그니처(Signature)
		  		{  -----> 메소드 바디, 구현부
		  			실행코드;
		  		}
		  	- public : 접근지정자 / static: 정적키워드 / void: 반환 자료형 / 메소드명(인자리스트)
		  
		  2. 메소드 호출하기(사용) * N회
		  
		  
		*/
		
		
		/*
		 
	 		요구사항: "안녕하세요." * 5회 출력
			수정사항: "안녕하세요." --> "반갑습니다.
		  
		*/
		
		// 밑 5줄의 코드는 하드 코딩
		// 프로그래밍 기술 -> 한번 짠 코드를 어떻게 하면 다시 안짜고 재사용할 수 있을까?
				
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		System.out.println("반갑습니다.");
		
		
		
		// 이 안에서는 메소드 선언 불가능 (선언은 밑 참조)
		
		/* 
		 
		  2. 메소드 호출하기
		  	- 선언한 메소드의 이름을 부른다.
		
		*/
		hello(); // 제어가 hello() 메소드 정의한 곳으로 이동한다. -> hello(); 실행을 마치고 이곳으로 제어가 돌아온다.
		hello();
		hello();
		hello();
		hello();
		
		calc();
		
	} // main
	
	/*
	  
	  여기서 매소드 선언 가능
	  - 클래스 내부에서 작성 가능
	  - 클래스 외부에서 작성 불가능
	  - 매소드 내에서 매소드 선언 불가능
	  - 매소드 끼리 선언 순서는 무관
	    
	*/
	
	/*
	 
	  1. 메소드 선언
	  	- hello : 메소드 명
	 
	*/ 
	public static void hello() {
		
		// 인사 하는 코드
		System.out.println("반갑습니다^^");
		
	}
	
	public static void calc() {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a + b);
		
	}
	
}// Ex13_Method



// 이곳은? 메소드 선언 불가능
