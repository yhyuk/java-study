package com.test.question.q24;

public class MainClass {

	public static void main(String[] args) {
		
		//MyArrayList list = new MyArrayList();
		MyArrayList2 list = new MyArrayList2();
		
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		list.add("홍길동5");
		
		System.out.println("======[읽기]======");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}

		System.out.println("======[개수]======");
		System.out.println(list.size());
		
		System.out.println("======[수정]======");
		list.set(0, "홍길동1_수정");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		
		System.out.println("======[삭제]======");
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		
		System.out.println("======[삽입]======");
		list.add(2, "홍길동 쌍둥이");
		list.add("홍길동 쌍둥이");
		list.add(3, "김영혁");
		list.addStart("나는 처음이다"); 
		list.addEnd("나는 마지막이다");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}

		System.out.println("======[앞부터 검색]======");
		if (list.indexOf("홍길동 쌍둥이") > -1) {
		    System.out.printf("%d 위치에 있음\n", list.indexOf("홍길동 쌍둥이"));
		} else {
		    System.out.println("없음");
		}
		
		System.out.println("======[뒤부터 검색]======");
		if(list.lastIndexOf("홍길동 쌍둥이") > -1) {
		    System.out.printf("%d 위치에 있음\n", list.lastIndexOf("홍길동 쌍둥이"));
		} else {
			System.out.println("없음");
		}

		System.out.println("======[초기화]======");
		list.clear();
		System.out.println(list.size());
		
	}
}
