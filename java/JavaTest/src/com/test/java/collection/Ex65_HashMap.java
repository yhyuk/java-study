package com.test.java.collection;

import java.util.HashMap;
import java.util.Scanner;

public class Ex65_HashMap {
	
	public static void main(String[] args) {
		
		//Ex65_HashMap.java
		
		/*
		 *  ArrayList vs HashMap 
		 *  
		 *  ArrayList
		 *  - 요소 접근 -> 첨자(index) 사용 -> 요소의 순서가 있음
		 *  - 스칼라 배열(Scalar Array)
		 *  - 루프 적용 가능(장점)
		 *  
		 *  HashMap
		 *  - 방 번호 없음 -> 요소의 순서가 없음
		 *  - 방 이름 있음
		 *  - 사전 구조(Dictionary), 맵(Map), 연관 배열
		 *  - 키(Key)와 값(Value)으로 요소 관리
		 *  - 루프 적용 불가능(단점은 아님) -> 애초에 루프를 돌릴 목적으로 만드는 배열이 아니다.
		 *  - 가독성 때문에 사용하는 배열 -> 방의 이름이 명확!!!
		 */
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m3() {
																    //가변 10칸부터 시작
		HashMap<String, Integer> map = new HashMap<String, Integer>(10);
		
		map.put("국어", 100);
		map.put("영어", 90);
		map.put("수학", 80);
		
		System.out.println(map.size());
		
		System.out.println(map.containsKey("국어")); //국어 점수 있니?
		System.out.println(map.containsValue(100));  //100점 맞은 과목이 있니?
		
		System.out.println(map.get("영어")); //90
		
		System.out.println(map.isEmpty()); //방이 비어 있니?
		
		map.remove("국어");
		System.out.println(map.get("국어"));
		
		System.out.println(map.size()); //2
		System.out.println(map.get("국어")); //null
		
	}

	private static void m2() {
		
		/*
		 *  데이터의 집합이 필요할 때(순수배열, 클래스, ArrayList, HashMap)
		 *  
		 *  1. 같은 자료형의 집합이 필요하다
		 *  	a. 순수 배열
		 *  	b. ArrayList
		 *  	c. HashMap
		 *  
		 *  2. 다른 자료형의 집합이 필요하다.
		 *  	a. 클래스
		 *  ----------------------------------------
		 *  1. 길이가 고정이다.
		 *  	a. 순수 배열
		 *  
		 *  2. 길이가 가변이다.
		 *  	a. ArrayList
		 *  	b. HashMAp
		 *  
		 *  ----------------------------------------
		 *  1. 데이터의 의미를 구분하기 쉽게 관리한다.
		 *  	a. 클래스(멤버 변수명)
		 *  	b. HashMap(Key)
		 *  
		 *  2. 일괄 처리를 한다.
		 *  	a. 순수 배열
		 *  	b. ArrayList
		 * 
		 */
		
		/***************************************************************************
		 *  예제>
		 *  학생 정보를 관리하고 싶다. > 데이터 집합 필요 > 학생 1명 단위의 데이터 자료형이 필요하다.
		 *  - 이름, 주소, 전화, 나이
		 *  1. 순수배열 -> X (의미 알기 힘듬)
		 *  
		 *  2. ArrayList -> X (의미 알기 힘듬)
		 *  
		 *  3. 클래스 -> O (의미 알기 쉬움)
		 *  - 반복되는 틀로서의 역할이 만족스럽다.
		 *  - 규칙을 컴퓨터가 제어한다(다르면 error)
		 *  - 클래스 선언 비용이 발생한다.
		 *  - 같은 형식의 객체를 여러개 만들때 사용한다.
		 *  
		 *  4. HashMap -> O (의미 알기 쉬움)
		 *  - 반복되는 틀로서의 역할이 부족하다.
		 *  - 규칙을 사람이 제어한다.(키 값이 달라도 error 발생안함)
		 *  - 선언 비용이 없다.
		 *  - 같은 형식의 객체를 1개 만들때 사용한다.
		 *  
		 *  
		 *  class와 HashMap를 만들어본결과... 차이점은 ..?
		 *  - HashMap은 반복되는 틀(변수명) 로서의 역할이 부족하다.
		 *  - 규칙을 사람이 제어한다.
		 *  
		 */
		
		//class 만들기
		Student2 s1 = new Student2();
		s1.name = "홍길동";
		s1.address = "서울시";
		s1.tel = "010-1234-5678";
		s1.age = 20;
		
		Student2 s2 = new Student2();
		s2.name = "아무개";
		s2.address = "인천시";
		s2.tel = "010-1111-2222";
		s2.age = 27;
		
		//HashMap 만들기
		HashMap<String, String> s3 = new HashMap<String, String>();
		s3.put("name", "하하하");
		s3.put("address", "부산시");
		s3.put("tel", "010-9999-9999");
		s3.put("age", "23");
		
		System.out.println(s2.name);
		System.out.println(s3.get("name"));
		
		HashMap<String, String> s4 = new HashMap<String, String>();
		s4.put("name", "호호호");
		s3.put("address", "대전시");
		s3.put("tel", "010-5555-5555");
		s3.put("age", "29");
		
		
		
		
	}//main

	private static void m1() {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		//요소 추가
		//put- Associates the specified value with the specified key in this map.
		map.put("국어", 100);
		map.put("영어", 90);
		map.put("수학", 80); //키(수학), 데이터(80) -> 키:방의이름
		
		//강의실로 ArrayList <---> HashMap 비교
		// -> 1강의실, 2강의실, 3강의실 -> ArrayList : 방을 번호 순서로 할때..
		// -> 햇님반, 달님반, 별님반 -> HashMap : 방을 이름으로 할때..
		
		//요소 개수
		//size - Returns the number of key-value mappings in this map.
		System.out.println(map.size());
		
		//System.out.println(list.get(0));
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		
		map.put("국어", 60); //수정(기존값에 덮어쓰기)
		System.out.println(map.get("국어"));
		
		//-------------------------------------------------------------------

		//String, String 예제
		HashMap<String, String> group = new HashMap<String, String>();
		
		group.put("반장", "홍길동");
		group.put("부반장", "임꺽정");
		group.put("체육부장", "허준");
		
		System.out.println(group.get("반장"));
		
		//-------------------------------------------------------------------
		//String, Boolean 예제
		//합격 유무?
		HashMap<String, Boolean> result = new HashMap<String,Boolean>();
		
		result.put("홍길동", true);
		result.put("임꺽정", false);
		result.put("허준", true);
		
		System.out.println(result.get("홍길동"));
		System.out.println(result.get("세종대왕")); //없는값은 null 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("응시자명: ");
		String name = scan.nextLine();
		
		if (result.get(name) != null) {
			if (result.get(name)) {
				System.out.println("합격하셨습니다.");
			} else {
				System.out.println("불합격하셨습니다.");
			}
		} else {
			System.out.println("응시자 명단에 없습니다.");
		}
		//-------------------------------------------------------------------
		//Boolean, String 에제
		//요소의 최대 개수는 2개이다.
		
		/*
		 *  HashMap
		 *  - key : String. 다른 자료형은 잘 사용 안함
		 *  - value : Integer, Double, String, Boolean
		 */
		
		HashMap<Boolean, String> map2 = new HashMap<Boolean, String>();
		map2.put(true, "홍길동");
		map2.put(false, "아무개");
		map2.put(false, "하하하");
		
		//-------------------------------------------------------------------
		//Integer, String 에제
		//사용하지 말것
		//1. 키의 의미를 알기가 힘들다. (굳이 순서로 지정함.....)
		//2. 루프용으로 사용하지말 것 (ArrayList or Array 쓰면됨... 뻘짓임..)
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "빨강");
		map3.put(2, "노랑");
		map3.put(3, "파랑");
		
		
	}

}

class Student2 {
	
	public String name;
	public String address;
	public String tel;
	public int age;
	
}
