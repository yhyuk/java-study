package com.test.java.collection;

import java.util.ArrayList;

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
	}
	
}
