package com.test.java.Inheritance;

import java.util.Random;

public class Ex45_Overriding {

	public static void main(String[] args) {
		
		// Ex45_Overriding.java
	
		/*
		 *  메소드 오버라이드, Method Override
		 *  - 메소드 재정의(수정)
		 *  - 상속에서만 발생
		 *  
		 *  
		 */
		
		Phone p1 = new Phone();
		p1.dial();
		
		SmartPhone s1 = new SmartPhone();
		//s1.dial(); //물려받긴 했지만.. 사용하기엔.. 찜찜한 상황 > but 상속 거부 못함
		
		s1.dial(); 
		//무조건 자식이 선언한 dial() 메소드가 호출된다.(100%)
		//메소드가 하는일이 바뀌었다 -> 메소드 재정의
		
		MyRandom3 rnd = new MyRandom3();
		
		System.out.println(rnd.nextColor());
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextDouble());
		System.out.println(rnd.nextInt());
		//----------------------------------------------------------------------------------------
		//멤버6개
		CCC c = new CCC();
		
		System.out.println(c.a); // 타이핑중 c. 누르면 상속받은 클래스명이 나온다.
		System.out.println(c.b);
		System.out.println(c.c);
		c.aaa();
		c.bbb();
		c.ccc();
		
		
	}//main

	
}

//폴더폰
class Phone {
	
	public String model;
	
	public void dial() {
		System.out.println("버튼을 눌러 전화를 겁니다.");
	}
	
}

//스마트폰
class SmartPhone extends Phone{
	
	/*
	 *  Phone(전화기)
	 *  - model
	 *  - dial()
	 */

	//자신의 멤버
	public void gmae() {
		System.out.println("게임을 합니다.");
	}
	
	/*
	 * **** 상속관계에서 부모가 물려준 메소드와 동일한 시그니처로 메소드를 선언
	 * 		--> 자식의 메소드가 부모의 메소드보다 우선해서 노출된다.(호출한다)
	 * 		--> 메소드 재정의(수정)
	 * 		--> 메소드 오버라이드(Method Override)
	 */
	public void dial() {
		System.out.println("화면을 터치해서 전화를 겁니다.");
	}
	
}



/* 
 *  Random이 가지는 기능이 모두 필요 + 추가기능 필요 -> 확장
 *  - Random의 모든 기능을 필요!!
 *  - nextInt() 사용을 안함 or nextInt()의 범위 부담
 */
class MyRandom3 extends Random {
	
	
	//부모(Random)의 nextInt()를 자식이 재정의 -> 오버라이드
	public int nextInt() {
		
		Random rnd =new Random();
		return rnd.nextInt(10) + 1;
	}
	
	public String nextColor() {
		
		Random rnd = new Random();
		String[] color = {"red", "blue", "wwhite", "green"};
		
		return color[rnd.nextInt(color.length)];
	}
	
	
}


class AAA {
	public int a;
	public void aaa() {
		
	}
}

class BBB extends AAA{
	public int b;
	public void bbb() {
		
	}
	
	public int a; //변수 오버라이드 가능 ---> 사용안함(100% 절대!!) --> 의미 전혀 없다.
	
	@Override 
	//어노테이션
	//개발자가 해당 메소드 재정의 할때 컴파일 오류를 보여줌 으로써,
	//에러 나는것을 보여줌(편의성 때문에 쓰임)
	public void aaa() {
		
	}
}

class CCC extends BBB {
	public int c;
	public void ccc() {
		
	}
}