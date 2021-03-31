package com.test.java;

public class Ex08_Output {

	public static void main(String[] args) {
		
		//콘솔 입출력, Console Input Output, Console IO
		// - 입력 장치 : 키보드
		// - 출력 장치 : 모니터
		
		//콘솔 출력
		//콘솔 입력
		
		//콘솔에서 데이터를 모니터(화면)에 출력하는 방법
		//System.out.println()
		//클래스 . 필드 . 메소드()
		
		
		//1. System.out.println()
		// - 데이터를 출력한 뒤 엔터를 추가로 출력(줄바꿈)
		
		//2. System.out.print()
		// - 데이터를 출력한 뒤 끝.. (줄바꿈 하지않음)

		//3. System.out.printf()
		// - print format
		// - 형식 문자열 지원
		// - 출력할 문자열을 보다 쉽게 구성할 수 있도록 도와주는 출력문
		
		System.out.println(100);
		System.out.println(200);
		System.out.println(300);
		
		System.out.print(100);
		System.out.print(200);
		System.out.print(300);
		
		
		System.out.println();
		System.out.println();
		
		String name1 = "홍길동";
		int kor1 = 90;
		int eng1 = 95;
		int math1 = 85;
		
		String name2 = "아무개";
		int kor2 = 81;
		int eng2 = 79;
		int math2 = 88;
		
		System.out.println("=============================");
		System.out.println("             성적표");
		System.out.println("=============================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]"); //테이블 머리말, table header
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\n");
		
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		System.out.println();
		System.out.println();

		
		//printf()
		//- %s : 형식 문자, place holder
		
		
		// 요구사항] "안녕하세요. 홍길동님" --> 출력
		String name = "홍길동";
		System.out.println("안녕하세요. " + name + "님");
		
		System.out.printf("안녕하세요. %s님\n", name);
		
		System.out.printf("안녕하세요. %s님\n", name2);
		System.out.println();
		
		
		
		// 수정사항] "안녕하세요. 홍길동님. 반갑습니다. 홍길동님" --> 출력
		System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name +"님");
		System.out.printf("안녕하세요. %s님. 반갑습니다. %s님\n", name, name);
		
		//Oracle > SQL 언어 구문
		//insert into tblMember (seq, name, age, address, tel) values (10, '홍길동', 20, '서울시 강남구 역삼동', '010-1234-5678')
		
		String seq = "10";
		name = "홍길동";
		String age = "20";
		String address = "서울시 강남구 역삼동";
		String tel = "010-1234-5678";		
		
		System.out.println("insert into tblMember (seq, name, age, address, tel) values (" + seq + ",'" + name + "', " + age + ",'" + address + "','" + tel + "')");
		
		System.out.printf("insert into tblMember (seq, name, age, address, tel) values (%s,'%s', %s,'%s','%s')"
				                                  ,seq, name, age, address, tel);
		System.out.println();
		
		//printf()
		//- 형식 문자
		// 1. %s : String
		// 2. %d : Decimal(byte, short, int, long)
		// 3. %f : Float(float, double)
		// 4. %b : Boolean
		// 5. %c : Char
		
		System.out.printf("문자열 : %s\n", "문자열");
		System.out.printf("정수 : %d\n", 100);
		System.out.printf("실수 : %f\n", 3.14);
		System.out.printf("논리 : %b\n", true);
		System.out.printf("문자 : %c\n", 'A');
		
		
		
		
		
	}
}
