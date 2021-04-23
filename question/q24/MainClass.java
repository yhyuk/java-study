package com.test.question.q24;

public class MainClass {

	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();

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
		
		System.out.println("====[탐색+읽기]===");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		
		System.out.println("======[수정]======");
		list.set(0, "홍길동_수정");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		
		System.out.println("======[삭제]======");
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}
		
		System.out.println("======[삽입]======");
		list.add(2, "홍길동_삽입");
		list.add("홍길동_삽입");
		list.add(6, "김영혁");
		for (int i=0; i<list.size(); i++) {
		    System.out.println(list.get(i));
		}

		System.out.println("======[앞부터 검색]");
		if (list.indexOf("홍길동_삽입") > -1) {
		    System.out.printf("홍길동 %d 위치에 있음\n", list.indexOf("홍길동_삽입"));
		} else {
		    System.out.println("홍길동 없음");
		}
		
		System.out.println("======[뒤부터 검색]");
		if(list.lastIndexOf("홍길동_삽입") > -1) {
		    System.out.printf("홍길동 %d 위치에 있음\n", list.lastIndexOf("홍길동_삽입"));
		} else {
			System.out.println("아무개 없음");
		}

		System.out.println("======[초기화]======");
		list.clear();
		System.out.println(list.size());
		
	}
}
