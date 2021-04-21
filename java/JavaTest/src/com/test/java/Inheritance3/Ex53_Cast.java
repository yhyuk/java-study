package com.test.java.Inheritance3;

public class Ex53_Cast {
	
	public static void main(String[] args) {
		
		//Ex32_Cast.java
		
		/*
		 *  형변환, Type Cast
		 *  1. 값형 형변환 : 값형끼리만 가능
		 *  2. 참조형 형변환 : 참조형끼리만 가능 > 클래간의 형변환
		 *  
		 *  값형 형변환
		 *  - 숫자형끼리 가능(boolean 불가능)
		 *  - 작은형 -> 큰형 : 암시적 (100% 안전)
		 *  - 큰형 -> 작은형 : 명시적 (Overflow 발생가능)
		 *  
		 *  참조형 형변환
		 *  - 클래스간의 형변환
		 *  - 상속 관계를 맺은 (직계)클래스간에만 가능
		 *  - 자식클래스 -> 부모클래스 : 업캐스팅(Up Casting)
		 *  - 부모클래스 -> 자식클래스 : 다운캐스팅(Down Casting), 100%불가능
		 * 
		 */
		
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		
		Parent p2; //복사본
		Child c2 = new Child(); //원본
		
		//Parent = Child
		//부모 = 자식(업캐스팅) : 암시적
		p2 = c2;
		
		
		/*
		 *  참조형 형변환의 확인 방법
		 *  -> 복사된 참조 변수(p2)를 올바르게 사용할 수 있는가? ****
		 */
		
		//p2로 할 수 있는 모든 행동 Test.. ****
		p2.a=10;
		p2.b=20;
		
		System.out.println(p2.a);
		System.out.println(p2.b);
		
		/*
		Parent p3 = new Parent(); //원본
		Child c3; //복사본
		
		//Child = Parent
		//자식 = 부모(다운캐스팅) : 명시적
		c3 = (Child) p3; 
		// 런타임 Error 발생
		//java.lang.ClassCastException: Parent cannot be cast to class Child
		
		c3.a = 10;
		c3.b = 20;
		c3.c = 30;
		c3.d = 40;
		
		System.out.println(c3.a); //O
		System.out.println(c3.b); //O
		System.out.println(c3.c); //X
		System.out.println(c3.d); //X
		*/
		
		
		
		Parent p4;
		Child c4 = new Child();
		
		//업캐스팅(안전) 
		p4 = c4; 
		
		
		
		
		
		Child c5;
		
		//다운캐스팅(100% 불가능) --> 가능한작업(**)
		//자식클래스 = 부모클래스
		c5 = (Child)p4; //실제(**) : Child -> Child 
		
		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
		
		
	}//main

}


class Parent {
	public int a;
	public int b;
}

class Child extends Parent {
	public int c;
	public int d;
}