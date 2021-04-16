package com.test.java.obj;

// *** main 메소드를 소유한 클래스 > 스스로 실행을 할 수 있는 클래스!

//자바 파일의 이름은 반드시 class명과 동일해야 한다.



public class Ex30_Class {

	public static void main(String[] args) {
		
		//Ex30_Class.java
		
		/*
		 *  클래스 사용
		 *  1. 클래스 선언하기(정의)				-> int 정의(사람X, 이미 정의되어 있음)
		 *  2. 객체 생성하기(인스턴스 생성하기)		-> 변수 생성하기 
		 *  3. 객체 사용하기(주 목적)				-> 변수 사용하기
		 *  
		 *  클래스 -> 객체
		 *  
		 *  붕어빵틀(설계도:클래스) -> 붕어빵틀에서 찍어낸 붕어빵(제품:객체) 
		 *  
		 *  
		 *  		 
		 */
		
		
		
		AAA a1 = new AAA();
		a1.a = 10;
		System.out.println(a1.a);
		
		BBB b1 = new BBB();
		b1.b = 20;
		System.out.println(b1.b);
		
		CCC c1 = new CCC();
		c1.c = 30;
		System.out.println(c1.c);
		
		
		//책상 크기
		Size s1 = new Size(); //객체의 상태(State), 특성(Property), 특징, 속성(Attribute)
		s1.name = "책상";
		s1.width = 1000;
		s1.height = 500;
		
		//노트 크기
		Size s2 = new Size();
		s2.name = "노트";
		s2.width = 30;
		s2.height = 25;
		
		//휴대폰 크기
		Size s3 = new Size();
		s3.name = "아이폰";
		s3.width = 25;
		s3.height = 12;

		//휴대폰 크기
		Size s4 = new Size();
		s4.name = "Galaxy S 21";
		s4.width = 25;
		s4.height = 12;
		
		// s3와 s4는 같은 휴대폰(객체) 인가? 같은 종류의 휴대폰인가? 같은 핸드폰인가?
		// --> 같다? 다르다? > 쌍둥이를 생각해보자, 같지만 성격은 다르다.
		
		// ** 객체는 유일하다. > 객체는 유일성을 보장받는다.
		
		
		
		//사람(클래스)
		// -> 홍길동(객체)
		// -> 아무개(객체)
		// -> 유재석(객체) -->말랐다? 얼굴이작다? 70kg
		// -> 강호동(객체) -->뚱뚱하다? 얼굴이크다? 90kg
		
		// -> 특징 -> 특성 -> 객체의 상태(state *** ) : 객체 자신만이 가지고 있는 데이터
		
		
		
		
	}
	
}



//클래스 선언하기 -> 붕어빵 틀 만들기
class AAA {
	public int a;
}

class BBB {
	public int b;
}
//파일(*.java) 1개 안에 2개의 클래스를 선언 했음
//파일(*.java) 1개 안에 N개의 클래스를 선언 했음

//하나의 파일에 여러개의 클래스를 정의
// -> 모든 클래스 중 딱 1개만이 public 키워드를 가질 수 있다.
// -> public 키워드를 가진 클래스가 해당 파일의 대표 클래스.
// -> 즉 대표 클래스(public)의 이름이 파일명이 된다.




//**** 결론
// - 자바 파일(*.java) 1개당 클래스는 1개만 정의
// --> 여기서 만든 AAA,BBB 클래스 처럼 X
// --> 여기서 만든 것이 아닌 CCC 클래스 처럼 O
// --> 나중에 ooo 클래스를 찾으려 할 때 main이 아닌 밖에 따로 만든것이 찾기 쉬움
// --> 클래스 1개당 라인 : 1000~ 3000라인
// --> 클래스 갯수 : 50~300개



//대상의 크기를 저장하기 위한 단위
class Size {
	
	public String name;
	public int width;
	public int height;
	
}