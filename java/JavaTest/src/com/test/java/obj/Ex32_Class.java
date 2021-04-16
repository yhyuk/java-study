package com.test.java.obj;

import org.w3c.dom.css.Rect;

public class Ex32_Class {
	
	public static void main(String[] args) {
		
		//데이터 + 행동 = 클래스
		
		Student s1 = new Student();
		
		s1.name = "홍길동" ;
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		
		s1.hello();
		
		Student s2 = new Student();
		
		s2.name = "아무개";
		s2.kor = 90;
		s2.eng = 77;
		s2.math = 97;
		
		s2.hello();
		
		
		Rectangle r1 = new Rectangle();
		r1.name = "노트";
		r1.width = 35;
		r1.height = 23;
		
		Rectangle r2 = new Rectangle();
		r2.name = "아파트";
		r2.width = 5000;
		r2.height = 2800;
		
		
		r1.getArea();
		r2.getArea();
		
		
		
	}//main

}//Ex32.class

class Rectangle {
	
	//멤버 변수
	public String name;
	public int width;
	public int height;
	
	//멤버 메소드
	public void getArea() {
		
		// 면적 = 자신의 데이터를 활용
		System.out.printf("[%s] %,d㎤\n", name, width * height );
		
	}
}




//단축키 ctrl + 1 --> rename
//중복 키워드를 한꺼번에 수정해준다
class Student {
	
	//멤버 변수 : 객체의 상태(를 저장하는 공간)
	public String name;		//학생명
	public int kor; 		//국어
	public int eng; 		//영어
	public int math; 		//수학
	
	
	//멤버 메소드
	//잘못 만든 메소드 ! > 효용 가치가 전혀 없는 메소드 (메소드안에 println() 출력문 하나 밖에없다)
	//그렇다면 잘 만든 메소드 ? > 자신이 가지고 있는 데이터를 활용하는 행동을 구현한다(********)
	public void hello() {
		//System.out.println("ㅎㅇ");
		System.out.printf("안녕하세요 저는 %s 입니다.\n", name);
	}
	
}