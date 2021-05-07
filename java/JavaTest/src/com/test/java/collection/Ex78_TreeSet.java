package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex78_TreeSet {
	
	public static void main(String[] args) {
		
		//Ex78_TreeSet.java
		
		/*
		 *  인터페이스에 상속받는 컬렉션의 똑같은 패턴?
		 *  OOOXXX
		 *  - OOO : 자료구조(물리적인 공간의 형태)
		 *  - XXX : 인터페이스(사용법)
		 *  
		 *  
		 *  List
		 *  - ArrayList :  Array(배열형태의 공간) 	+ List(리스트 사용법 제공, index)
		 *  - LinkedList : Linked(링크 형태의 공간) + List(리스트 사용법 제공, index)
		 *  
		 *  Set
		 *  - HashSet : Hash(알고리즘, 구조) 	+ Set(사용법, 중복값X)
		 *  - TreeSet : Tree(트리 구조) 		+ Set(사용법, 중복값X)
		 * 
		 *  Map
		 *  - HashMap : Hash(알고리즘) + Map(Key,value)
		 *  - TreeMap : Tree(트리구조) + Map(Key,value)
		 * 
		 *******************************************************************************
		 *
		 *  오늘 배울것
		 * 
		 *  TreeSet
		 *  - Tree 구조를 가지는 Set
		 *  - 중복값 X, 순서(index) X, 정렬 X
		 *  - 이진 (검색) 트리 구조 기반의 자동 정렬이 되어있는 Set 
		 *  - 정렬 필요 + 중복값 X + 검색 자주
		 * 
		 */
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(30);
		set.add(50);
		set.add(10); //Set형태라서 중복값 X
		
		System.out.println(set.size());
		
		//어제도 배웠지만 set은 get메소드가 없다! -> 대신 Iterator제공
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//-->알아서 정렬이 완성됨. (이진트리구조)
		System.out.println();
		
		//메소드
		System.out.println(set.first()); //최솟값
		System.out.println(set.last()); //최댓값
		System.out.println();
		System.out.println(set.headSet(30)); //처음 ~ 30 전까지
		System.out.println(set.tailSet(30)); //30 ~ 끝까지
		System.out.println(set.subSet(30, 50)); //30 ~ 50까지
		
		
		//------------------------------------------------------------------
		//컬렉션별, 타입별 예시 중요하니깐 꼭 다시 정리할 것 *********************
		
		//배열안에 객체가 들었다. <-> 배열안에 원자값이 들어있다.(int, String...)
		ArrayList<Score> list = new ArrayList<Score>();
		list.add(new Score("홍길동", 100, 90, 80));
		list.add(new Score("아무개", 70, 80, 20));
		list.add(new Score("하하하", 40, 100, 50));
		
		System.out.println(list);
		
		//정렬
		//Collections.sort(list); //Error : 어떤데이터 기준으로 정렬할지 모르기 때문에...
		list.sort(new Comparator<Score>() {
			
			@Override
			public int compare(Score o1, Score o2) {
				//return o1.getKor() - o2.getKor(); //국어
				//return o1.getEng() - o2.getEng(); //영어
				return (o1.getKor() + o1.getEng() + o1.getMath()) -
						(o2.getKor() + o2.getEng() + o2.getMath());
			}
		});
		System.out.println(list);
		System.out.println();
		
		HashSet<Score> hset = new HashSet<Score>();
		hset.add(new Score("홍길동", 100, 92, 80));
		hset.add(new Score("아무개", 70, 80, 22));
		hset.add(new Score("하하하", 45, 100, 50));
		System.out.println(hset);
		
		hset.add(new Score("아무개", 70, 80, 22)); //동일 데이터 추가
		System.out.println(hset);
		//hashCode+equals 오버라이딩 전 -> 위 값 추가됨
		//hashCode+equals 오버라이딩 후 -> 위 값 추가안됨
		System.out.println();
		
		//객체를 비교 우위의 대상으로 사용할 수 있게 하는 방법
		//1. Comparator 구현(실명 구현, 익명 객체)
		//2. Comparable 구현
		TreeSet<Score> tset = new TreeSet<Score>();
		tset.add(new Score("홍길동", 100, 90, 80));
		tset.add(new Score("아무개", 70, 80, 20));
		tset.add(new Score("하하하", 40, 100, 50));
		
		System.out.println(tset);
		
	}//main

}

//학생성적
class Score implements Comparable<Score>{
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//생성자 오버로딩
	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	//모든 멤버의 상태가 똑같으면 -> 동일한 객체로 취급 하도록 하는법
	//1. hashCode() 오버라이딩
	//2. equals() 오버라이딩
	@Override
	public int hashCode() {
		return (this.name + this.kor + this.eng + this.math).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}

	@Override
	public int compareTo(Score o) {
		//comparator와 비슷하다. 어? 근데 비교대상이 한개(Score o) 밖에없다??
		//compareTo는 this 와 o 비교 --> comparator와의 차이점
		
		//return this.getKor() - o.getKor(); //국어 순서대로
		//return (this.getKor() + this.getEng() + this.getMath()) -
		//		(o.getKor() + o.getEng() + o.getMath()); //총합 순서대로
		return this.getName().compareTo(o.getName()); //이름 순서대로
	}
}
