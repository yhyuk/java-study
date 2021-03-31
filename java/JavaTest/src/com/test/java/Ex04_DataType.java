package com.test.java;

public class Ex04_DataType {
	
	public static void main(String[] args) {

		//전제조건 : 구문은 외우고.. 사용
		//1. 인텔리센스, 코드 어시스트 : Ctrl + Space
		//2. 코드 조각(템플릿) : 키워드 작성 -> [Ctrl + Space]
		//구문도 모르면서 편하다고 많이 이용하면 나중에 일할 때 이클립스가 아닌 다른것을 사용할 때 큰일남.
		
		//출력 명령어 syso . ctrl+space
		//System.out.println();
		//눈공부 X, 코드를 많이 쳐봐라!! 타이핑 속도 중요하다!!
		//나도 책보면서 눈으로 코드보고 이해하며, 쉬운코드라 생각되는것은,
		//코드를 안쳐봤는데, 아예 백지상태로 코드를 쓸 수 있게 해보자.
		//운동선수 처럼 반복작업이 중요하며, 그걸 몸이 익혀야한다.
		//공부시간을 타이핑시간8, 이론공부2 정도로 잡자.
		
		//window - preference - template - java밑의 template 클릭
		//내가 원하는 코드어시스트를 만들 수 있다.
		
		//자료형 + 변수 + 리터럴(상수)
		// 1. 자료형을 사용
		// 2. 변수를 만듦
		// 3. 변수에 리터럴을 사용해서 값을 넣는다.
		// - 모든 자료형에 대해서..(8가지)
		
		//정수형(byte, short, int, long)
		
		/*byte*/
		byte b1;
		
		b1 = 100; // 100을 정수형 리터럴 or 정수형 상수 or 정수형 데이터 라고 한다.
		
		System.out.println("byte : " + b1);
		
		b1 = -100;
		
		//Ctrl+Alt+방향키(아래) : 라인 복사
		//Alt+방향키(아래) : 라인 이동 (코드 드래그해서, 여러 문단도 가능)
		System.out.println("byte : " + b1);
		
		b1 = 127;
		
		System.out.println("byte : " + b1);
		
		//Error : Type mismatch: cannot convert from int to byte
		//b1 = 128; byte자료형의 허용범위 초과로 위 에러 발생		
		
		
		/*short*/
		short s1;
		
		s1 = 100;
		System.out.println("short : " + s1);
		
		s1 = 128;
		System.out.println("short : " + s1);
		
		s1 = 32767;
		System.out.println("short : " + s1);

		//s1 = 32768; short 범위초과로 에러
		s1 = -32768;
		//s1 = -32769; short 범위초과로 에러
		
		/*int 가장 많이 쓰므로 중요함*/
		
		int n1;
		
		n1 = 100;
		
		n1 = 2100000000;
		
		System.out.println("int : " + n1);
		
		n1 = -2100000000;
		
		System.out.println("int : " + n1);
		
		//각 자료형의 크기를 외워도 되지만, 책이 없거나 까먹었을때 확인이 가능하다.
		//자료형 -> 클래스
		//byte -> Byte
		//short -> Short
		//int -> Integer
		//long -> Long
		//float -> Float
		//double -> Double
		
		System.out.println(Byte.SIZE); //8bit
		System.out.println(Byte.BYTES); //1byte
		System.out.println(Byte.MAX_VALUE); //127
		System.out.println(Byte.MIN_VALUE); //-128
		
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		
		System.out.println(Long.MAX_VALUE); // 9223372036854775807
		
		
		
		/*long*/
		long l1;
		
		l1 = 100;
		System.out.println("long : " + l1);
		
		l1 = 1000000000;
		System.out.println("long : " + l1);
		
		//long의 크기는 9223372036854775807인데? 밑에는 왜 안될까?
		//Error : The literal 10000000000000 of type int is out of range 
		l1 = 10000000000000L; //접미어L을 붙여서 위 Error 해결
		System.out.println("long : " + l1);
		
		
		
		
		//상수의 자료형??
		//자바의 모든 정수형 상수의 자료형은 int 이다. (중요중요중요)
		//왜 int 일까?
		//CPU 관계 -> 오래전부터 어떤 언어의 int 자료형은 해당 CPU가 한번에 처리할 수 있는 데이터의 크기이다.
		//CPU -> 64bit, 32bit, 16bit, 8bit.... -> CPU가 한번에 처리하는 데이터 크기
		
		
		byte b2 = 100;
		short s2 = 100;
		int n2 = 100;
		long l2 = 100;
		
		System.out.println(b2); // byte값 
		System.out.println(l2); // long값 
		System.out.println(100); // 이 100 값은 어떤값일까? -> 답:int
		
		//정수형 상수는 int 범위를 벗어나서 사용할 수 없다.
		System.out.println(2100000000);
		//System.out.println(21000000000); //The literal 21000000000 of type int is out of range
		
		//정수형 상수를 int 범위 밖의 숫자를 표한 하고 싶을떄는 ?
		// - 접미어(L,l)을 사용 -> Long
		System.out.println(22000000000L); // 권장
		System.out.println(22000000000l); // 비권장, 대소문자 구분없지만 소문자는 1로 보일 가능성이 높음
		
		
		//실수형(float, double)
		
		/*float*/
		float f1;
		
		//실수형 리터럴 표기법
		//f1 = 3.14;
		//Error:Type mismatch: cannot convert from double to float 
		//왜 float은 F를 붙일까? --> 나중수업
		f1 = 3.14F;
		System.out.println("float : " + f1);
		
		/*double*/
		double d1;
		
		//float은 리터럴 뒤에 F를 붙였는데 double은 D를 붙여도 그만, 안해도 그만.
		//왜? 166 문단처럼 소수점의 기본 자료형은 double로 되기 때문.
		//정수의 자료형은 기본적으로 int랑 똑같은거랑 같음
		
		d1 = 3.14; //d1 = 3.14D;
		System.out.println("double : " + d1);
		
		System.out.println(3.14); // 실수형 상수 3.14의 자료형? > double
		
		//실수 사용시 주의점!! -> 정밀도
		float f2 = 1.2345678901234567890123456789F;
		double d2 = 1.2345678901234567890123456789D;
		
		System.out.println("f2 : " + f2); //출력 : f2 : 1.2345679
		System.out.println("d2 : " + d2); //출력 : d2 : 1.2345678901234567
		
		
		
		
		//문자형
		// - 한글자를 저장하는 자료형
		char c1;
		
		//A cannot be resolved to a variable
		//c1 = A;
		
		//문자형 리터럴 표기법
		c1 = 'A';
		System.out.println("char : " + c1);
		
		c1 = '가';
		System.out.println("char : " + c1);
		
		c1 = '5'; //아라비안 숫자 5하고 문자5는 다른 값이다.(중요중요)
		System.out.println("char : " + c1);
		
		// int 5, char 5는 다르다.
		int num1 = 5; //정수 -> 숫자5
		char num2 = '5'; //글자 -> 문자코드값 저장53
		
		//논리형
		/*boolean*/
		
		boolean flag;
		
		//논리형 리터럴 표기법
		flag = true;
		System.out.println("boolean : " + flag);
		
		flag = false;
		System.out.println("boolean : " + flag);
		
		// 어제수업복습
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		//자바 자료형
		//1. 원시형, 값형
		// - 정수형(4개), 실수형(2개), 문자형(1개), 논리형(1개)
		
		//2. 참조형
		// - 문자열(String) : 문자들이 열을 지어 있는 형태의 자료형
		
		//이름(홍길동) -> 변수 저장 -> 출력
		
		//char name = '홍길동'; //error 발생
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		System.out.println("이름 : " + name1 + name2 + name3);
		
		//char의 문자형으로는 여러단어, 문장을 쓸때 불편함이 있다??
		//char의 집합 -> 새로운 자료형 -> String
		//String은 정말 많이 쓰인다!!
		
		String name;
		
		//문자열 리터럴 표기법(쌍따옴표 ""를 쓴다.)
		name = "홍길동";
		
		System.out.println("이름 : " + name);
		
		//char m1 = ''; //문자형은 ''안에 반드시 무언가가 표현이 되야한다. 
		String m2 = ""; //빈문자열(Empty String) -> 주로 문자열 변수를 초기화 할 때 사용 or 그 외 등등...
		
		System.out.println("m2 : " + m2);
		
		
		
		
		
	}
	
}