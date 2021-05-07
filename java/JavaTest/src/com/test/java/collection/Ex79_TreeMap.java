package com.test.java.collection;

import java.util.TreeMap;

public class Ex79_TreeMap {
	
	public static void main(String[] args) {
		
		//Ex79_TreeMap.java
		
		/*
		 *  TreeMap
		 *  - 키를 자동정렬 
		 *  - 키: 이진트리
		 *  - 값: 리스트
		 *  
		 *  Tree -> 이진 트리 구조
		 *  Map -> key, value
		 */
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		map.put("four", "넷");
		map.put("five", "다섯");
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.get("three"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.firstEntry());
		System.out.println(map.lastEntry());
		System.out.println(map.headMap("o")); //알파벳 o부터 시작하는 값부터~ 
		System.out.println(map.tailMap("o")); //위의값 반대
		System.out.println(map.subMap("f", "o"));
		
		
		
		/*
		 *  이제껏 배운것 
		 *  List
		 *  - ArrayList(***), LinkedList, Stack, Queue
		 *  Set
		 *  - HashSet(***), TreeSet
		 *  Map
		 *  - HashMap(***), TreeMap
		 *  
		 *  ***한 3가지는 무조건 알아야함!
		 */
		
	}

}
