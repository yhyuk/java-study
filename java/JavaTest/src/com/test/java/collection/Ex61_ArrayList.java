package com.test.java.collection;

import java.util.*;

import com.sun.jmx.mbeanserver.Util;

public class Ex61_ArrayList {

	public static void main(String[] args) {
		
		// Ex61_ArrayList.java
		
		/*
		 *  컬렉션, Collection
		 *  - Java Collection Framework (JCF)
		 *  - 배열 > 향상된 배열
		 *  - 배열을 기반으로 특정한 사용 목적이나, 특정한 사용 방식을 구현해 놓은 클래스
		 *  - 자료구조 -> 이름 붙여 놓은 것들 -> 컬렉션
		 *  - 종류는 대략 10개정도.... 필요한건 + 직접구현
		 *  
		 *  
		 *  
		 *  
		 *  ArrayList 클래스
		 *  - 가장 많이 사용하는 컬렉션 클래스
		 *  - 가장 보편적인 구조를 가진다.
		 *  - 순수 배열과 구조가 거의 비슷하다. (************)
		 *  - 첨자(index)를 사용해서 요소(Element)에 접근/제어
		 * 
		 */
			
		
		
		//m1();
		//m2();
		m3();
		
		
	}//main

	private static void m3() {

		
		ArrayList<String> list = new ArrayList<String>();
		
		/*  
		 *  1. 요소 추가하기 
		 *  - boolean add(T value)
		 *  - 배열의 맨 마지막에 추가한다. (Append)
		 */
		list.add("빨강");
		list.add("노랑");
		list.add("파랑");
		list.add("연두");
		list.add("주황");
		
		
		/*
		 *  2. 요소의 갯수
		 *  - int size()
		 */
		System.out.println(list.size());
		
		
		/*
		 *  3. 요소의 접근
		 *  - T get(int index)
		 */
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.get(list.size()-1));
		
		
		/*
		 *  4. 요소의 수정
		 *  - list[0] = 100
		 *  - String set(int index, T value)
		 */
		System.out.println();
		System.out.println(list.get(2));
		String oldValue = list.set(2, "Blue");
		list.set(2, "Blue");
		System.out.println(list.get(2));
		
		
		/* 
		 *  5. 요소의 삭제
		 *  - 순수 배열의 요소는 삭제 불가능
		 *  - 컬렉션 요소의 삭제 기능
		 *  - T remove(int index);
		 *  - boolean remvoe(T Value)
		 */
		System.out.println();
		System.out.println(list.size());
		
		for (String color : list) {
			System.out.println(color);
		}
		
		System.out.println("3번방 : " + list.get(3));
		list.remove(2);
		System.out.println("3번방 : " + list.get(3));
		
		
		System.out.println();
		System.out.println(list.size());
		
		for (String color : list) {
			System.out.println(color);
		}
		
		
		/*
		 *  6. 요소 추가
		 *  - 삽입(Insert)
		 *  - 중간에 끼워 넣기
		 *  - void add(int index, T value)
		 */
		System.out.println();
		
		System.out.println("2번방: " + list.get(2));
		list.add(1, "오렌지");
		System.out.println("2번방: " + list.get(2));

		for (String color : list) {
			System.out.println(color);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("< 현재 상태 >");
		for (String color : list) {
			System.out.println(color);
		}
		System.out.println();
		System.out.println();
		
		
		/**
		 *  7. 검색
		 *  - 요소값 검색
		 *  - boolean contains(T Value) : 있다? 없다?
		 *  - int indexOf(T Value) : 몇번째? (방향 : -> )
		 *  - int lastIndexOf(T Value) : 몇번째? (방향 : <- )
		 *  
		 */
		System.out.println("< ArrayList 검색 >");
		System.out.println(list.contains("노랑"));
		System.out.println(list.indexOf("노랑")); 
		//-->시작위치를 따로 지정해주는 오버로딩은 없다. 
		//-->중복값이 있더라도 첫번째 값만 보여준다.
		System.out.println(list.lastIndexOf("노랑"));
		System.out.println();
		System.out.println();
		
		
		/*
		 *  8. 초기화
		 *  - 모든 방을 삭제 (처음상태로 만듬, 초기화)
		 */
		list.clear();	 					//원래 배열을 초기화
		//list = new ArrayList<String>(); 	//새로운 배열로 덮어쓰기
		
		System.out.println("< ArrayList 초기화");
		System.out.println(list.size());
		System.out.println();
		System.out.println();
		
		/*
		 *  9. 빈배열 확인
		 */
		System.out.println("< ArrayList 빈배열 확인 >");
		System.out.println(list.size() == 0); //비어있는지 확인(true, false)
		System.out.println(list.isEmpty());	  //비어있는지 확인(true, false) ArrayList전용
		
		
		//----------------------------------------------------------
		
		//List interface : java.util.List 인터페이스
		//ArrayList Class : java.util.classArrayList 클래스 
		
		ArrayList<String> a1 = new ArrayList<String>();
		//List<String> a2 = new List<String>();
		
		List<String> a2 = new ArrayList<String>(); //부모interface = 자식 객체 --> 업캐스팅 
		//** 결론 : 인터페이스를 상속받은 클래스의 객체는 인터페이스 변수에 담아서 사용하는 경우가 많다.
		
	}

	private static void m2() {

		ArrayList list1 = new ArrayList(); //일반(옛날) 방식(Object 버전)
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		System.out.println((int)list1.get(0) + 50);
		System.out.println(list1.size());
		
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //제네릭 버전
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		System.out.println(list2.get(0) + 50);
		System.out.println(list2.size());
		
		for (int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}

	private static void m1() {
		
		/*
		 *  순수 배열
		 *  
		 *  배열 선언
		 *  - 타입 명시(int)
		 *  - 길이 명시(3)
		 */
		int[] num1 = new int[3];
		
		//초기화 + 요소접근 -> 첨자(index) 사용
		num1[0] = 100;
		num1[1] = 200;
		num1[2] = 300;
		
		System.out.println(num1[0]);
		
		//탐색
		for (int i=0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
		
		for (int n : num1) {
			System.out.println(n);
		}
		System.out.println();
		System.out.println();
		
		
		
		/*
		 *  ArrayList
		 *  - 타입 없음(int) -> Object 배열
		 *  - 길이 없음(3) -> 가변(늘리거나 줄일 수 있다.)*****
		 */
		ArrayList num2 = new ArrayList();
		
		//초기화 
		//num2[0] = 100; //[0] : indexor -> 자바는 순수 배열만 인덱서를 지원한다.
		
		//add -> 순서대로 알아서 넣는 메소드(비어있는 방에 순서대로..)
		//Append
		num2.add(100); //0번방
		num2.add(200); //1번방
		num2.add(300); //2번방
		num2.add(400);
		num2.add(500);
		
		System.out.println(num2.size());
		
		//확인
		System.out.println(num2.get(0));
		
		//탐색
		for (int i=0; i<num2.size(); i++) {
			System.out.println(num2.get(i));
		}
		
		System.out.println((int)num2.get(0) * 2 );
		
		//향상된 for문 탐색
		for (Object n : num2) {
			System.out.println((int)n);
		}
		
		List<String> list = new ArrayList<String>();

		
	}
	
}
