package com.test.java.Inheritance2;

public class Ex48_Interface {
	
	public static void main(String[] args) {
		
		// Ex48_Interface.java
		
		/*
		 *  인터페이스, interface
		 *  - 클래스의 일종(자료형)
		 *  - 클래스와 구조/목적이 다르다 
		 *  - 인터페이스는 객체를 생성할 수 없다.
		 *  	-> 추상 메소드 때문에..
		 *  	-> 실체화된 객체가 구현부를 가지지 못한 메소드를 호출할 수 없기 때문이다.
		 *  	-> 그럼 어따 쓰지..?
		 *  	-> 클래스의 부모 역할
		 *  	-> 상속 관계에서 사용 *****
		 *  
		 */
		
		
		/* 
		 *  상속 키워드 2가지
		 *  1. extends : 클래스 -> 클래스
		 *  2. implements : 클래스 -> 인터페이스
		 */
		
		
		Test t = new Test();
		//t.test();
		//t.aaa();
		//t.bbb();
		
		
		
		//Phone p = new Phone(); // Error 
		//p.test(); // 이 작업이 불가능하기 때문에 인터페이스는 객체를 생성할 수 없다.
		
		
		S21 s = new S21();
		s.test();
		
	}//main

}//Ex48




//인터페이스 선언하기
interface Phone {
	
	//인터페이스 멤버
	
	//public void test(); // { } 없음 ..? 
	/*
	 * 	구현부가 없는 메소드
	 * -> 실체화가 되지 않은 메소드 
	 * -> 추상 메소드(Abstract Method)
	 * -> 호출해도 사용이 불가능하다.
	 */
	public abstract void test(); // 정석
	
	//public int a; //error
	//public void test() { //error
	//}
}



//public void test()를 지우면? 
//Error : The type S21 must implement the inherited abstract method Phone.test().
class S21 implements Phone {

	@Override
	public void test() {
		System.out.println("테스트입니다.");
	}
	
	
	//public abstract void test();  //-> error
	
	/*
	 *  오버라이드? -> 구현부 생성
	 *  인터페이스가 물려준 추상 메소드를 물려받고 + 재정의 -> ******
	 *   
	 *   
	 *   1. 일반 상속? 
	 *   - 오버라이드 -> 개발자의 선택
	 *   
	 *   2. 인터페이스 상속? 
	 *   -> 오버라이드 
	 *   -> 개발자의 선택X 
	 *   -> 무조건 필수 !!
	 *   -> 안하면 컴파일 오류
	 *   -> 강제!!
	 */
	
	//public void test() {
		
		//System.out.println("테스트입니다.");
		
	//}
	
}





// 네가(I12)가 내(Phone) 자식이 되려면 내가 "시키는걸" 반드시 해라
// 시키는일 : 추상메소드를 구현하는 것 -> 추상메소드 밖에 없는 몸통을 만드는 것 -> 오버 라이드
class I12 implements Phone{

	@Override
	public void test() {
	
	}
}




// 일반 클래스는 추상 메소드를 가질 수 없다. (****)
class Test {
	
	// public abstract void test();
	
	public void aaa() {
		
	}
	
	public void bbb() {
	}
}