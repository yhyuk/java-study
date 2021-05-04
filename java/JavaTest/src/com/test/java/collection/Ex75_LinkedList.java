package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex75_LinkedList {
	
	public static void main(String[] args) {
		
		//Ex75_LinkedList
		
		/*
		 *  비슷한 무리의 클래스.. > 인터페이스 > 컬렉션
		 *  
		 *  1. Collection 인터페이스
		 *  2. List 인터페이스
		 *  	- Collection > List(상속관계)
		 *  	- ArrayList, Stack, Queue, LinkedList, (Properties)
		 *  3. Set 인터페이스
		 *  	- Collection > List(상속관계)
		 *  	- 아직배우지않음
		 *  	- HashSet, TreeSet
		 *  4. Map 인터페이스
		 *  	- Map(독립관계)
		 *  	- HashMap, TreeMap, (HashTable)
		 *  
		 *  <LinkedList>
		 *  - List 계열
		 *  - ArrayList와 사용법 유사(같은 추상메소드를 구현 > 사용법 동일)
		 *  - 내부 구조는 다르다. > 데이터 저장소의 사용 목적이 다르다. > 용도가 다름..
		 * 
		 * 	<LinkedList 종류> 1 -> 2 -> 3 (발전 순서, 3번이 가장 잘 쓰이는 방법)
		 *  1. LinkedList
		 *  	- 단방향 탐색
		 *  2. Double LinkedList
		 *  	- 양방향 탐색
		 *  3. Double Circular LinkedList
		 *  	- 자바의 LinkedList
		 * 
		 *  
		 *  <ArrayList vs LinkedList>
		 *  공통점 : 순서를 가지는 배열 > 방 번호 사용 > index
		 *  차이점 
		 *  - ArrayList
		 *  	- 장점: 모든 컬렉션을 통틀어 특정 요소에 졉근 요소가 가장 빠르다. (순수배열과 동일)
		 *  	- 단점: 요소의 추가(insert), 삭제 작업 비용이 많이 든다.
		 *  
		 *  - LikedList
		 *  	- 장점: ArrayList단점이 곧 장점. 요소의 추가(insert), 삭제 작업 비용이 저렴 하다.
		 *  	- 단점: ArrayList장점이 곧 단점. 특정 요소에 접근 속도가 느리다.
		 *  
		 *  ---> ArrayList와 LinkedList는 서로 상반된다.
		 *  ---> 읽기를 많이할꺼면 ArrayList..
		 *  ---> 쓰기를 많이할꺼면 LinkedList..
		 *  ---> 판단하기 실질적으로 힘들지만.. 보편적으로는 읽기작업이 많아서 ArrayList를 많이쓴다.
		 * 
		 * 
		 *  <정리>
		 *  순차적으로 	추가/삭제 작업: ArrayList > LinkedList
		 *  중간 		추가/삭제 작업: Linked >>>>> ArrayList
		 * 
		 */
		
		
		m1();
		
	}

	private static void m1() {
		
		//ArrayList vs LinkedList
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		//요소추가(Apppend)
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		//요소 접근
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		for (int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		//--> ArrayList와 LinkedList의 차이점이 눈으로 보이지않는다..
		//--> 메소드명도 똑같아서 비슷한점이 많다.. but 내부구조는 다르다.
		
		//장단점 테스트-------------------------------------------------------
		long begin = 0, end = 0;
		
		//1. 순차적으로 데이터를 추가하기, Append
		System.out.println("1. 순차적으로 데이터 추가하기, Append");
		
		//ArrayList
		begin = System.currentTimeMillis(); //tick

		for (int i=0; i<1000000; i++) {
			list1.add(i);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("ArrayList 작업시간: %,dms\n", end - begin);
		
		//LinkedList
		begin = System.currentTimeMillis(); //tick

		for (int i=0; i<1000000; i++) {
			list2.add(i);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("LinkedList 작업시간: %,dms\n", end - begin);
		//--> 작업시간이 ArrayList가 LinkedList보다 빠르다.
		//--------------------------------------------------------------------------------
		//2. 배열 중간에 데이터 추가하기, Insert(Right Shift 발생)
		System.out.println("2. 배열 중간에 데이터 추가하기, Insert");
		
		//ArrayList
		begin = System.currentTimeMillis(); //tick

		for (int i=0; i<10000; i++) {
			list1.add(0, i);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("ArrayList 작업시간: %,dms\n", end - begin);
		
		//LinkedList
		begin = System.currentTimeMillis(); //tick

		for (int i=0; i<10000; i++) {
			list2.add(0, i);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("LinkedList 작업시간: %,dms\n", end - begin);
		//--> 작업시간이 LinkedList가 ArrayList보다 압도적으로 빠르다.
		//--------------------------------------------------------------------------------
		//3. 배열 중간에 있는 데이터 삭제하기, Delete(Left Shift 발생)
		System.out.println("3. 배열 중간에 있는 데이터 삭제하기, Delete");
		
		//ArrayList
		begin = System.currentTimeMillis(); //tick

		for (int i=0; i<10000; i++) {
			list1.remove(0);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("ArrayList 작업시간: %,dms\n", end - begin);
		
		//LinkedList
		begin = System.currentTimeMillis(); //tick

		for (int i=0; i<10000; i++) {
			list2.remove(0);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("LinkedList 작업시간: %,dms\n", end - begin);
		//--------------------------------------------------------------------------------
		//4. 순차적으로 데이터 삭제하기. 끝 -> 처음 (Shift 발생 안함)
		System.out.println("4. 순차적으로 데이터 삭제하기. 끝 -> 처음");
		
		//ArrayList
		begin = System.currentTimeMillis(); //tick

		for (int i=list1.size()-1; i>=0; i--) {
			list1.remove(i);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("ArrayList 작업시간: %,dms\n", end - begin);
		
		//LinkedList
		begin = System.currentTimeMillis(); //tick

		for (int i=list2.size()-1; i>=0; i--) {
			list2.remove(i);
		}
		
		end = System.currentTimeMillis(); //tick
		System.out.printf("LinkedList 작업시간: %,dms\n", end - begin);
		
		
	}

}
