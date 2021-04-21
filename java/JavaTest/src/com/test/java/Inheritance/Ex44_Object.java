package com.test.java.Inheritance;


public class Ex44_Object {

	public static void main(String[] args) {
		
		// Ex44_Object.java
		
		
		/*
		 *  Object 클래스
		 *  - java.lang 패키지(모든 패키지 중 기본 패키지 -> import를 안해도 사용 OK)
		 *  
		 *  - Class Object is the root of the class hierarchy.Every class has Object as a superclass. 
		 *  - Object 클래스는 클래스 계층 구조에서 최상위 클래스이다.
		 *  - 지구상의 모든 클래스는 부모 클래스로 Object를 가진다.
		 *  
		 *  - All objects,including arrays, implement the methods of this class.
		 *  - 배열을 포함한 모든 객체는 Object 클래스의 메소드를 구현한다.
		 */
		
		Object c;
		
		SubItem sitem = new SubItem();
		
		/*
		 *  sitem의 멤버 -> a,aaa(), b, bbb()
		 *  sitem.a
		 *  sitem.b
		 *  sitem.aaa();
		 *  sitem.bbb();
		 */
		
		// 지금은 Object의 존재만 알고있자!
		
		
	}
	
}


//모든 class는 extends(상속) 를 안붙이면 extends Object 자동생성
class Item extends Object { 
	
	public int a ;
	
	public void aaa() {
		
	}
}

class SubItem extends Item {
	
	public int b;
	
	public void bbb() {
		
	}
}