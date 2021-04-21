package com.test.java.Inheritance;

public class Ex43_Inheritance {
	
	public static void main(String[] args) {
		
		// Ex43_Inheritance.java
		
		/*
		 *  ex) 여행 패키지 상품 
		 *  A. 기본 패키지 -> 부모 클래스(Parent2)
		 *  	- 기차, 팬션
		 *  B. 기본 패키지 + 액티비티 -> 딸 클래스(Daughter)
		 *  	- A + 패러글라이딩
		 *  C. 기본패키지 + 힐링 -> 아들 클래스(Son)
		 *  	- A + 농장체험
		 * 
		 *  
		 *  # 부모 클래스를 2개 이상 가지는 상속
		 *  --> 다중 상속
		 *  --> Java는 다중 상속 클래스를 지원하지 않는다.(C++은 지원함) > 어려움
		 * 
		 * 
		 */
		
		
		
	}
}

class Parent2 {
	public int a = 10;
	public void aaa() {
		
	}
}

class Daughter extends Parent2 {
	public int b = 20;
	public void bbb() {
		
	}
}

class Son extends Parent2 {
	public int c = 30;
	public void ccc() {
		
	}
}
