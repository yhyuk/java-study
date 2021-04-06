package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		
		// Ex16_Method.java
		
		/*
		
		  자바 변수 종류
		  1. 클래스 멤버 변수
		  2. 지역 변수(Local Variable)
		  - 변수는 자신의 영역이 존재한다.(자신이 활동할 수 있는 지역) > Scope
		  - 지역을 벗어나면 사용이 불가능(접근이 불가능)하다.
		  
		  변수 생명 주기(Life Cycle)
		   - 변수는 언제 태우나고.. 언제 죽는지?
		   - 변수가 언제 메모리에 할당이 되고.. 언제 메모리에서 해제가 되는지?
		   - 변수는 변수 선언문이 실행되는 시점에 태어난다(메모리에 할당 된다.)
		   - 변수는 자신이 속한 블럭에서 제어가 벗어나는 순간 없어진다.(메모리에서 소멸 된다)
		 
		  Local Variable, 로컬변수(지역변수)
		  - 여태 수업했던 모든 변수는 지역 변수이다.
		
		*/
		int a = 10; // main() 메소드를 자신의 영역으로 하는 지역변수이다.
		
					
		m1(); // 호출문에 Ctrl + 1 --> 메소드 자동생성
		
		System.out.println(a);
		//System.out.println(b); // Error : m1 지역 변수를 main 지역에서는 접근 불가능
		String name = "홍길동";
	
	
	}

	private static void m1() {

		 String name = "아무개";
		
		// System.out.println(a); // 34번줄에 있는 코드는 되고 이건 왜 안될까? --> 지역 변수 라서..
		
		int b = 20; // m1()을 자기 영역으로 가지는 지역 변수		
		
		System.out.println(b);
		
		
	}

	
	
	
}
