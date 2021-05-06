package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex77_HashSet {
	
	public static void main(String[] args) {
		
		//Ex77_HashSet
		
		/*
		 *  memo) 면접때 list, set 차이? 물어볼 수 있음
		 * 
		 *  List 인터페이스
		 *  - Collection 인터페이스의 자식
		 *  - 순서가 있는 배열(***) 
		 *  - why? 순수배열, ArrayList, LinkedList > 방 번호 존재 > index를 사용해서 요소를 관리
		 *  - 요소가 중복값을 가질 수 있다.(***)
		 *  
		 *  Set 인터페이스
		 *  - Collection 인터페이스의 자식
		 *  - 순서가 없는 배열(***) 
		 *  - why? 방 번호 존재X > index를 사용X > 순서가 없다.
		 *  - 요소가 중복값을 가질 수 없다.(***)
		 * 
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main
	private static void m4() {
		//값형
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		boolean f1 = true;
		boolean f2 = true;
		System.out.println(f1 == f2);
		
		/*
		 *  참조형
		 *  1. 문자열은 불변이다 (Immutable)
		 *  2. 모든 참조형 변수의 비교는 주소값을 비교한다.
		 *  
		 *  '==' 절대로 하지말 것
		 *  -> 문자열 비교는 반드시 equals로 할 것
		 *  
		 */
		String s1 = "홍길동";
		String s2 = "홍길동";
		s1 = "홍길동님";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1 == s2); 		//true 나오지만 하지말 것.
		System.out.println(s1.equals(s2)); 	//String.equals(Object anObject)
		
		System.out.println(s1 == s3);		//false
		System.out.println(s1.equals(s3));	//true
		System.out.println();
		
		//참조형 객체의 비교
		Keyboard k1 = new Keyboard("K810", 200000);
		Keyboard k2 = new Keyboard("K810", 200000);
		Keyboard k3 = k1;
		Keyboard k4 = new Keyboard("K990", 350000);
		
		System.out.println(k1 == k2);		//false
		System.out.println(k1.equals(k2)); 	//false, 주소값 비교(Object.equals)
		System.out.println(k1.equals(k3));	//true
		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		
		System.out.println(k1.hashCode());	//객체의 위치(메모리 주소값)
		System.out.println(k2.hashCode());
		System.out.println(k4.hashCode());
		
		//hashCode와 euqals 둘 다 오버라이드(재정의) 한 후 --------
		System.out.println(k1 == k2);		//false
		System.out.println(k1.equals(k2));	//true
		System.out.println(k1.equals(k4)); 	//true
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(k1.hashCode());
	}
	
	private static void m3() {
		
		/* 
		 *  단일값(원자값) 집합
		 *  - String[]
		 *  - int[]
		 *  - HashSet<String>
		 *  - HashSet<Integer>
		 *  
		 *  
		 *  복합값 집합 > 객체 배열
		 *  - Student[]
		 *  - HashSet<Student>
		 */
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		lotto.add(10);
		lotto.add(5);
		lotto.add(10); //허용X
		
		//Set > 중복값 허용 안함
		HashSet<Keyboard> set = new HashSet<Keyboard>();
		
		set.add(new Keyboard("K810", 200000)); 	//A
		set.add(new Keyboard("K310", 50000));	//B
		set.add(new Keyboard("K810", 200000));	//C
		/*
		 *  A와 C는 같은 키보드 아니냐?
		 *  - 모든 참조형(객체)는 아무리 상태(멤버 변수의 값)가 동일해도, 다른객체로 취급한다.
		 *  - 쌍둥이 개념
		 */
		
		System.out.println(set);
		
		
		
		
		
	}
	private static void m2() {
		
		//로또 번호 만들기 -> 중복값 X
		
		Random rnd = new Random();
		//List
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i=0; i<6; i++) {
			int n = rnd.nextInt(45) + 1;
			boolean flag = false;

			//같은 숫자 검사
			for (int j=0; j<i; j++) {
				if (n == lotto.get(j)) {
					flag = true;
					break;
				}
			}
			lotto.add(n);
		}
		Collections.sort(lotto);
		System.out.println(lotto);
		
		//Set
		HashSet lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) {
			int n = rnd.nextInt(45) + 1;
			System.out.println(lotto2.add(n));
		}
		
		System.out.println(lotto2);

		
		/*
		 *  로또번호로 보는 List와 Set의 차이점
		 *  List 
		 *  - 중복값이 존재O
		 *  
		 *  Set
		 *  - 중복값 존재X
		 *  - 코드간결..
		 * 
		 */
		
		
	}
	private static void m1() {
		
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		
		//추가
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("딸기"); //중복값OK, 방 번호가 달라서 구분 가능하기 때문..
		
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		set.add("딸기"); //중복값X, 방 번호가 없어서 데이터로 구분이 안되면 아예 구분이 불가능하기 때문..
		
		//개수
		System.out.println(list.size());
		System.out.println(set.size());
		
		//덤프(출력용으로 사용X -> 개발자만 보는 용도)
		System.out.println(list);
		System.out.println(set);
		
		//요소 접근/탐색
		//System.out.println(list.get(0));
		//........? set은 get이 없다..?

		for (String item : list) {
			System.out.println(item);
		}
		System.out.println();
		
		//Set에서는 get(), indexOf(), lastIndexOf(), remove() ... 없다.
		//but Iterator지원
		set.iterator();
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}

class Keyboard {
	
	private String model;
	private int price;
	
	public Keyboard(String model, int price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[model=" + model + ", price=" + price + "]";
	}
	
	//hashCode 오버라이딩 + equals 오버라이딩
	@Override
	public int hashCode() {
		
		//return 100; //고정상수 반환 금지
		//본인의 상태에 따라 달라지는 값을 반환하도록 재정의
		//k1: "K810", 200000 -> "K810200000"
		
		System.out.println((this.model + this.price).hashCode());
		return (this.model + this.price).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
}
