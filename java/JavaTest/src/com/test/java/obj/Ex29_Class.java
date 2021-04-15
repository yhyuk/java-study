package com.test.java.obj;

import java.net.Socket;

// 프로그램 실행 : 프로젝트 내의 모든 클래스 정의 읽기(인식 단계, Class Loading) 
// ------> main 메소드 실행


public class Ex29_Class {
	
	public static void main(String[] args) {
		
		// Ex29_Class.java
		
		/*
		 *  클래스, Class
		 *  - 객체 지향 프로그래밍
		 *  
		 *  1. 절차 지향 프로그래밍
		 *  	- C
		 *  
		 *  2. 객체 지향 프로그래밍
		 *  	- C++, Java, C# 등등...
		 * 	
		 *  3. 함수형 프로그래밍
		 *  	- F#, Kotlin, Java(일부 기술)
		 * 
		 *  
		 *  클래스
		 *  - 코드의 집합
		 *  
		 *  
		 *  클래스 사용 이유?
		 *  1. 데이터 집합이 필요해서
		 *  2. 행동 집합이 필요해서
		 *  3. 데이터 + 행동 집합이 필요해서
		 * 
		 * 
		 * 
		 */
		
		
		// 요구사항] 지도 -> 우리집 좌표 저장 + 관리
		
		//Case 1. 
		// - 대량으로 관리하기가 힘들다.
		// - 물리적 구조가 집합이 아니다.
		// - 식별자 관리하기가 힘들다.
		
		//우리집
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 (%d, %d)에 위치합니다.\n", x, y);
		
		//마트
		int x2 = 100;
		int y2 = 200;
		
		System.out.printf("우리집은 (%d, %d)에 위치합니다.\n", x2, y2);
		
		
		//Case 2.
		// - 배열 사용
		// - 물리적인 집합 구조를 제공한다. 
		// - 다량의 데이터 관리에 용이하다.
		// - 첨자로는 의미를 알기 힘들다.
		
		//우리집
		int[] a1 = new int[2];
		a1[0] = 100; //x좌표
		a1[1] = 200; //y좌표
		
		System.out.printf("우리집은 (%d, %d)에 위치합니다.\n", a1[0],a1[1]);
		
		//마트
		int[] a2 = new int[2];
		a2[0] = 300;
		a2[1] = 400;
		
		
		System.out.printf("우리집은 (%d, %d)에 위치합니다.\n", a2[0],a2[1]);
		
		int[][] alist = new int[2][2];
		
		alist[0][0] = 100;
		alist[0][1] = 100;
		
		alist[1][0] = 300;
		alist[1][1] = 400;
		
		int[][] alist2 = new int[2][2];
		
		alist2[0] = a1;
		alist2[0] = a2;
		
		//마트 y의 좌표는 ? --> alist2[1][1]
		
		System.out.println();
		System.out.println();
		
		//질문 	--> 어려우나 중요하다!!!! 그림 그리면서 이해 반복 복습!
		// 1. int a = 10;
		// - a의 자료형은 무엇인가? > int
		
		// 2. int[] a = new int[3];
		// - a의 자료형은 무엇인가? > int[] (int 1차형 배열입니다)
		// - a[0]의 자료형 ? -> int
		
		// 3. int[][] a = new int[3][3]
		// - a의 자료형? > int[][]
		// - a[0]의 자료형? > int[]
		// - a[0][0]의 자료형 > int
		
		
		
		//Case 3.
		// - 클래스 사용 > 객체 생성하기
		
		//클래스명 클래스변수명 = new 클래스명(); --> 이해하기 쉽게 쓴것임 
		 
		//자료형 변수명 = 객체생성자 생성자; --> 원래는 이렇게 생각해야함
		//Point p1 = new Point();
		
		//String s1 = "홍길동";
		
		//int[] n1 = new int[2];

		
		//참조형 > 클래스
		//Point -> 클래스
		//String -> 클래스
		//int[] -> 클래스
		
		
		// 자료형
		// - 데이터의 형식+길이를 정의해놓은 규칙
		
		// 왜 Point(클래스)를 자료형이라 부를까?
		// 1. 변수를 만들었으니까
		
		//Case 3.
		// - 클래스 사용
		// - 물리적인 집합 > 제공 > 관리 용이
		// - 다량의 데이터 > 순차 접근 의미 > 좋지않음(X) > 배열과 목적이 다르다.
		// - 의미(가독성) > 같은 클래스로부터 만들어진 객체내의 변수는 이름이 동일하다. > 접근 편의성!! 
		
		
		//우리집 좌표
		Point p1 = new Point(); //Point 클래스의 객체(인스턴스)를 생성
		
		//p1 = 집합(x, y)
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 (%d, %d)에 위치합니다.\n", p1.x, p1.y);
		
		
		//마트
		Point p2 = new Point();
		
		p2.x = 300;
		p2.y = 400;
		
		System.out.printf("우리집은 (%d, %d)에 위치합니다.\n", p2.x, p2.y);
		
		
		
		//데이터 -> 집합(단위)
		// 1. 배열
		// 		- 같은 자료형 + 같은 의미
		// 2. 클래스(=구조체)
		//		- 다른 자료형(다른 의미) + 하나의 집합(각각의 다른 데이터가 결론적으로 하나의 목적을 가지고있다.)
		
		//예시 1) 지도의 좌표를 저장하고 싶다. -> 클래스
		//예시 2) 학생의 국어 점수를 저장하고 싶다. -> 배열
		//예시 3) 학생 정보를 저장하고 싶다.(학생정보 : 학생명, 키, 몸무게) -> 클래스
		
		//예시3이 배열이 아닌 클래스인 이유)
		
		//int[] s1 = new int[3];
		//s1[0] = 170; //키
		//s1[1] = 70; //몸무게
		//s1[2] = "홍길동"; //이름 => error
		
		//String[] s1 = new String[3]; 
		//s1[0] = "170";  //사용 -> 형변환(Integer.parse();
		//s1[1] = "70"; 
		//s1[2] = "홍길동"; // 몇번쨰 방에 뭐가 들어있는지 모른다. >의미만 모르는게 아니라 자료형도 알 수 없다.
		
		
		//배열, 클래스 뭐로 쓸지 고민해서 잘 선택하자
		
		
		
		// s1.name ==> '.' 은 연산자라고 한다.
		// '.' 연산자 : 멤버 접근 연산자
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.height = 100;
		s1.weight = 80;
		
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);
		
		
	}
}
//class Point { //클래스 헤더 -> 식별자 + 규칙정의
//	
//	// 클래스 바디 -> 구현부
//	// 클래스 멤버를 구현한다. *******
//	// - 멤버 변수
//	// - 멤버 메소드

//	int a; 
//	public static void test() {
//		
//	}
//	
//	
//	
//	}

//1. 클래스 선언하기(정의)
//2. 객체 생성하기
//3. 객체 사용하기 


//설계도
class Point {
	
	public int x;
	public int y;
}

//학생 정보(학생명, 키, 몸무게) -> 클래스 설계
class Student {
	
	//학생 정보를 구성하는 개별 데이터를 저장할 변수를 클래스 멤버로 선언한다.
	public String name;
	public int height;
	public int weight;
	
}