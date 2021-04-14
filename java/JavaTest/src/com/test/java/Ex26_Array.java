package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex26_Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Ex26_Array.java
		
		/*
		 *  배열, Array
		 *  - 문자열 유사(문자 배열, char array)
		 *  - 같은 성격의 데이터 + 같은자료형 -> 모아놓은 집합
		 *  - 참조형(Reference Type)
		 *  
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();
		//m8();
		//m9();
		//m10();
		//m11();
		
		//m12();
		
		
		// 자료구조, 알고리즘
		// 자료구조 -> 배열(연습 + 제어문)
		
	}

	private static void m12() {

		/*
		 *  프로젝트에 적용
		 *  - 데이터 만들기
		 *  - 회원 정보 x 100명 만들기
		 *  - 회원정보
		 *  	1. 이름 : 문자열  
		 *  	2. 나이 : 숫자
		 *  	3. 성별 : 숫자(1.남자, 2.여자)
		 *     	4. 주소 : 문자열
		 *  
		 */
		
		//어떻게 만들까?? --> Math.random() + 배열 사용
		//단점 : 가상의 데이터이기 때문에 유효하지 않다.
		
		int count = 100;
		
		String[] name = new String[count];
		int[] age = new int[count];
		int[] gender = new int[count];
		String[] address = new String[count];
		
		//기초 데이터 필요 -> 임의의 회원정보를 생성하기 위한 기반 데이터
		
		//이름(성)
		String[] n1 = { "김", "이", "박", "장", "송", "신", "유", "조", "최", "정" };
		
		//이름(이름)
		String[] n2 = { "대", "영", "주", "미", "혜", "상", "혁", "환", "호", "민",
				"운", "서", "연", "만", "봉", "준", "철", "구", "은", "오"};
		
		//주소
		String[] a1 = { "서울시", "인천시", "부산시", "대전시", "광주시" };
		String[] a2 = { "동대문구", "남동구", "서대문구", "동구", "남구", "북구" };
		String[] a3 = { "역삼동", "대치동", "성내동", "논현동", "구월동", "부평동" };		
		
		//n1 [임의의 방번호]
		//System.out.println(n1[(int)(Math.random() * n1.length)]
		//					+ n2[(int)(Math.random() * n1.length)]
		//					+ n2[(int)(Math.random() * n1.length)]);
				
		for(int i=0; i<count; i++) {
			name[i] = n1[(int)(Math.random() * n1.length)]
					+ n2[(int)(Math.random() * n1.length)]
					+ n2[(int)(Math.random() * n1.length)];
			
			age[i] = (int)(Math.random() * 41) + 19; // 0~40 --> 19~59
			
			gender[i] = (int)(Math.random() * 2) + 1; // 0~1 --> 1~2
			
			address[i] = a1[(int)(Math.random() * a1.length)]
						+ " "
						+ a2[(int)(Math.random() * a2.length)]
						+ " "
						+ a3[(int)(Math.random() * a3.length)]
						+ " "
						+ ((int)(Math.random() * 330) + 1)
						+ "번지";
		}
		
		for(int i=0; i<count; i++) {
			System.out.printf("[%s] %d세, %s, %s\n"
								, name[i]
								, age[i]
								, gender[i] == 1 ? "남자" : "여자"
								, address[i]);
		}
	}

	private static void m11() {
		
		/*
		 *  배열 초기화 리스트, 배열 초기자(Initializer)
		 *  
		 */
		
		int[] num1 = new int[5];
		
		for(int i=0; i<num1.length; i++) {
			num1[i] = (i+1) * 100;
		}
		
		for(int n : num1) {
			System.out.println(n);
		}
		
		
		int[] num2 = new int[5]; // 152, 45, 36, 98, 354
		
		num2[0] = 152;
		num2[1] = 45;
		num2[2] = 36;
		num2[3] = 98;
		num2[4] = 354;
		
		// ---> 값을 하나하나 방에 넣어줘야함 불편..
		
		int[] num3 = new int[] {152, 45, 36, 98, 354}; // 방법1. 위의 불편사항 해결!
		
		int[] num4 = {152, 45, 36, 98, 354}; // 방법2. 위의 해결보다 더 간결
		
		String[] name = { "홍길동", "아무개", "하하하" };
		
		boolean[] flag = { true, false, false, true };
		
		char[] cs = { 'A', 'B', 'C' };
		
	}

	private static void m10() {
		
		// 값형 vs  참조형
		int n; //null
		String s; //null
		
		// 지역변수(***)는 초기화 하지 않으면 사용이 불가능하다.
		//System.out.println(n);
		//System.out.println(s);
		
		// 초기화 해야할 값이 정해지지 않았지만 일단 초기화를 해야 하는 경우....
		
		// 참조형(주소값) 변수는 null로 초기화를 할 수 있다.
		s = null;
		s = "";
		
		// 값형 변수는 절대로 null로 초기화를 할 수 없다.
		// n = null; Error
		n = 0;
		
		
		
		/*
		 *  배열의 특징(참조형의 특징) 중 하나
		 *  - 배열은 방을 만들면 개발자의 의도와 상관없이 모든방이 특정 값으로 초기화된다.
		 *  - ---> 나중에 배울 '생성자'
		 *  
		 *  - 어떤 값으로 초기화? (***)
		 *  1. 정수 배열 > 0
		 *  2. 실수 배열 > 0.0
		 *  3. 문자 배열 > '\0'(null 문자, 문자코드값(0))
		 *  4. 논리 배열 > false
		 *  5. 참조형 배열 > null
		 * 
		 */
		int[] num = new int[5];
		
		System.out.println(num[0]); // num[0] 자료형 -> int
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println();
		
		double[] num2 = new double[3];
		System.out.println(num2[0]);
		
		char[] list1 = new char[3];
		System.out.println(list1[0]);
		System.out.println((int)list1[0]);
		
		boolean[] list2 = new boolean[3];
		System.out.println(list2[0]);
		
		String[] list3 = new String[3];
		System.out.println(list3[0]);
		
		
	}

	private static void m9() {
		String[] name = new String[5];
		
		name[0] = "홍길동";
		name[1] = "아무개";
		name[2] = "신동엽";
		name[3] = "강호동";
		name[4] = "유재석";
		
		// 배열탐색 -> for문을 사용해서 배열의 요소(Element)에 접근하기
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
			name[i] += "님"; //수정 -> name[i] = name[i] + "님"
		}
		System.out.println();
		
		/*
		 *  제어문 -> 또 다른 for문 -> 향상된 for문(Enhanced for Statement)
		 *  - 배열이나 컬렉션을 대상으로만 사용이 가능하다.(iterator를 지원하는 자료형에 한해서...)
		 *  - 루프 변수가 없다. ==> 장점? 안정성 높음 + 코드 간결함
		 *  - 배열의 모든 요소를 순차적으로(***) 자동 탐색한다. => 다른 방식으로는 탐색 불가능
		 *  - 속도가 for문보다 빠르다.
		 *  - 읽기 전용 반복문 : 요소의 값을 수정 할 수 없다. -> 요소의 값을 수정하면 안된다!!
		 * 
		 *  <형식>
		 *  
		 *  for (변수 : 집합) {
		 * 
		 *  }
		 *  
		 */ 
		
		for (String temp : name) {
			System.out.println(temp);
			temp += "고객: " + name; //수정  -> 고객: 홍길동님
		}
		System.out.println();
		
		
		for (String temp : name) {
			System.out.println(temp);
		}
		System.out.println();
		System.out.println();
		
		
		int[] num = new int[10];
		
		//쓰기 -> 일반 for문
		for (int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1; // 1~100
		}
		
		//읽기 - 일반 for문 or 향상된 for문
		for (int n : num) {
			System.out.println(n);
		}
		
		
	}

	private static void m8() {

		/*
		 *  배열 복사(참조형 복사)
		 *  1. 얕은 복사, Shallow Copy
		 *  2. 깊은 복사, Deep Copy
		 *  
		 */
		
		int[] num1 = new int[3];
		
		num1[0] = 100;
		num1[1] = 200;
		num1[2] = 300;
		
		int[] num2; // = new int[3];
		
		//얕은 복사
		num2 = num1;
		
		int[] num3 = new int[3];
		
		num3[0] = 100;
		num3[1] = 200;
		num3[2] = 300;
		
		int[] num4 = new int[3]; // 배열은 꼭 만들어야 한다 .
		
		//깊은 복사
		for (int i=0; i<num3.length; i++) {
			// int = int
			// 값형 복사(데이터 복사)
			num4[i] = num3[i];
		}
		
		
		num3[0] = 500;
		output(num3);
		output(num4);
		
		
		// 참조형 복사
		// 1. 변수끼리 복사 -> 얕은 복사 -> 원본을 건드리면 복사본 수정
		// 2. 실제 공간끼리 복사 - > 깊은복사 -> 원본을 건드려도 복사본 수정X
		
	}

	private static void m7() {
		
		// 값형 복사 vs 참조형 복사
		
		// 값형 복사
		// - Side Effect가 없다
		int a = 10;
		int b;
		
		b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		a++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		System.out.println();
		
		// 배열 복사(참조형 복사)
		// - Side Effect가 있다.
		// - 복사된 변수가 있었을 때 그 중 하나를 조작하면 나머지도 영향을 받는다.(주의!!)
		int[] num1 = new int[3];
		
		num1[0] = 100;
		num1[1] = 200;
		num1[2] = 300;
		
		output(num1);
		
		int[] num2 = new int[3];
		
		// - int[] = int[]
		// - 모든 참조형 변수끼리의 복사는 데이터 복사가 아닌 참조 주소 복사가 일어난다.
		
		num2 = num1;
		output(num2);
		
		num1[0] = 500;
		
		output(num1);
		output(num2); // num[0] 수정이 왜 num2[0]도 수정됬을까?
	}
	public static void output(int[] num) {
		
		for (int i=0; i<num.length; i++) {
			System.out.printf("%d ", num[i]);
		}
		System.out.println();
	}
	
	private static void m6() {
		
		/* 
		 *  배열을 만드는 목적?
		 *  -> 한번에 변수를 여러개 만들기 위해서..(?)
		 *  -> 다량으로 저장하기 위한 공간필요 ==> 같은 자료형 + 같은 성격 데이터 
		 * 
		 */
		
		int[] kor = new int[3]; //int방 x 3개
		kor[0] = 100; //국어점수1
		kor[1] = 90; //국어점수2
		kor[2] = 80; //영어점수 (?) => 컴파일O, 런타임O, 데이터X
		
		
		
		
		
		/*
		 *  메모리구조
		 *  - 값형과 참조형(모든 자료형)은 메모리에 공간이 한번 할당되면 그 공간의 크기를 변경할 수 없다.
		 *  - 메모리에 잡힌 공간은 변경 X
		 *  - 모든 지역 변수는 값형, 참조형에 상관없이 무조건 Stack에 생성된다.
		 *  
		 *  1. 값형(8가지)
		 *  	- 데이터가 변해도 공간의 크기가 변하지 않는다.
		 *  
		 *  2. 참조형(String, Array, Calendar, Math, BufferedReader....)
		 *   	- 데이터에 따라 공간의 크기가 일정하지 않다.
		 *   	- 공간의 크기를 미리 예측 불가능하다.
		 *    
		 */
		
		//값형, 원시형
		//0000 0000 0000 0000 0000 0000 0000 1010
		//0000 0000 1001 1000 1001 0110 1000 0000
		
		int n = 10;
		
		boolean b = true;
		
		double c = 3.14;
		
		//참조형
		String s1 = "홍길동";
		String s2 = "안녕하세요";
		
		s1 = "반갑습니다";
		s2 = "하하";
		
		//s1 ??
		System.out.println(n); //값형
		System.out.println(s1); //참조형
		
		
		s1 = "홍길동";
		s1 = "홍길동.";
		
		String s3 = "a";
		s3 = "ab";
		s3 = "abc";
		
		int[] num = new int[3]; //int x 3 = 12byte
		num = new int[5]; //int x 5 = 20byte
		
		int[] num2 = new int[3];
			
		num2[0] = 100;
		num2[2] = 300;
		
		System.out.println(num2[2]);
		
		String[] name = new String[3];
		
		name[0] = "홍길동";
		name[1] = "아무개";
		name[2] = "하하하";
		
		
		System.out.println(name[2]);
	}

	private static void m5() throws NumberFormatException, IOException {
		
		// 배열의 성질
		// - 배열의 길이가 불변(Immutable)이다.
		// -> 한번 생성된 배열의 방 갯수는 수정이 불가
		// -> 방을 더 만들거나, 있는 방을 삭제 할 수 없다.
		// -> 배열에 들어갈 데이터의 갯수를 미리 충분히 예측해서 최대값에 근접한 길이로 잡는다.(조금 더 크게)
		// ex) int[] num = new int[5]; //방5개 --> 추후 변경 불가 !!!
		
		// - 자바의 배열은 동적할당이 가능하다. 
		// -> 자바 배열의 길이는 런타임에서 결정할 수 있다.
		// int[] num = new int[5]; //정적할당
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		int n = Integer.parseInt(reader.readLine());
		
		int[] list = new int[n]; //동적할당
		
		System.out.println(list.length);
		
		
		
		
	}

	private static void m4() {

		// 배열 + 여러 자료형
		
		// 정수형 배열(byte, short, int, long)
		byte[] list1 = new byte[3];
		list1[0] = 10;
		System.out.println(list1[0]);
		
		// 실수형 배열(float, double)
		double[] list2 = new double[3];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		// 문자형 배열(char)
		char[] list3 = new char[3];
		list3[0] = 'A';
		System.out.println(list3[0]);
		
		// 논리형 배열(boolean)
		boolean[] list4 = new boolean[3];
		list4[0] = true;
		System.out.println(list4[0]);
		
		// 참조형 타입 배열(****************어려움 but중요)
		// - 문자열은 참조형에 속하지만 사용법은 값형과 동일하다.
		String[] list5 = new String[3];
		list5[0] = "홍길동";
		System.out.println(list5[0]);
		
		
		// 모든 자료형으로 배열 생성 가능
		Calendar[] list6 = new Calendar[3];
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF\n", list6[0]);
		
		
		
		
		
	}

	private static void m3() {
		
		//요구사항] int 숫자 -> 1~10까지 저장
		
		int[] num = new int[10];	//int[] num 권장 --> 요즘 java포함 모든언어가 저 방식을 쓰기때문
		//int num2[] = new int[10];	//int num2[] 비권장 --> 요즘 언어가 지원을 안함
		
		//배열안의 방 10개 -> 숫자 대입
		//배열 탐색
		for (int i=0; i<num.length; i++) {
			num[i] = i + 1;
		}
		
		//출력
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		System.out.println(num[9]); //length -1
		System.out.println(num[10]); //존재안함
		//Error : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("num[%d] = %d\n", i, num[i]);
		}
		
		
	}

	private static void m2() {
		
		// 배열 사용
		// m1() -> 개선 -> m2()
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//수정사항] 학생 수 증가 > 500명 > 10000명
		
		
		/*
		 *  1. 배열 만들기(선언하기)
		 *  - 자료형[] 배열명 = new 자료형[길이];
		 *
		 */
		
		int[] kor = new int[10000]; //이득 발생
		
		kor[0] = 100; //경우에 따라 이득 발생
		kor[1] = 90;
		kor[2] = 80;
		// ....
		kor[499] = 100; 
		
		
		int total = 0;
		//int total = kor[0] + kor[1] + kor[2];
		
		
		for(int i=0; i<kor.length; i++) {
			total += kor[i];
		}
		
		double avg = (double) total / kor.length;	
		
		System.out.printf("총점 : %d점, 평균 : %.1f점", total, avg);
	}

	private static void m1() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//수정사항] 학생 수 증가 > 500명 ??
		
		
		int kor1;
		int kor2;
		int kor3;
		
		kor1 = 100; kor2 = 90; kor3 = 80;
		
		int total = kor1 + kor2 + kor3;
		double avg = total / 3.0;
		
		System.out.printf("총점 %d점, 평균: %.1f점\n", total, avg);
		
		
		
	}
	
}
