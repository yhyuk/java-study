package com.test.java;

public class Ex12_Casting {

	public static void main(String[] args) {
		
		//Ex12_Casting.java
		
		/*
		
		 (자료)형변환, (Data)Type Casting
		 - 자료형을 변환시키는 기술
		 - int -> float
		 - double -> byte
		 - 코드 유연
		 
		 암시적인 형변환, 자동 타입 변환
		 - 큰형 = 작은형
		 - 100% 안전
		 
		 - byte -> short
		 - byte -> int
		 - byte -> long
		 
		 
		 - short -> int
		 - short -> long
		 
		 - int -> long
		 		 
		*/
		
		
		
		// < = 연산자 >
		// - 변수 = 값;
		// - LValue(변수) = RValue(상수,변수)
		// - (중요) = 연산자는 반드시 LValue와 RValue의 자료형이 동일해야 한다.
		// -> 동일 하지 않으면 Error 발생
		// 개발자가 모르게 형변환이 발생한다 > 암시적인 형변환, 자동 형변환
		
		// short = byte ?
		// 2byte = 1byte
		// 큰형 = 작은형
		
		byte b1 = 10;
		short s1;
		
		//s1 = b1;
		//s1 = (short)b1; // 컴파일러가 컴파일을 할 때 윗줄을 현재줄과 같이 번역한다.
		// 위의 (short)에서 ()는 형변환 연산자 라고 한다.
		
		s1 = b1; // 익숙하다. 많이쓴다.
		s1 = (short)b1; // 가독성이 좋다.
		
		System.out.println("byte -> short 복사본: " + s1); // 원본확인 X
		
		
		b1 = Byte.MIN_VALUE;
		s1 = b1;
		System.out.println("byte -> short 복사본 : "+ s1); // 최솟값
		
		
		b1 = Byte.MAX_VALUE;
		s1 = b1;
		System.out.println("byte -> short 복사본 : "+ s1); // 최대값
		
		
		long l1;
		
		// long = byte
		// 4byte = 1byte
		// 큰형 = 작은형
		// *** 암시적 형변환 발생
		
		l1 = b1;
		l1 = (long)b1;
		
		System.out.println("byte -> long 복사본 : " + l1);
		
		
		/*
		 명시적인 형변환, 강제 타입 변환
		 - 작은형 = 큰형
		 - 경우에 따라 다르다. (작은형이 포함 할 수 있는 원본이면 안전하고, 포함할 수 없는 원본이면 불안전하다.)
		 - 결론 : 굉장히 위험한 작업이다. -> 정신을 바짝 차려라 -> 틀리면 죽는다.
		 - ------>> Error 메세지가 없다. 근데 값이 이상하다..*****
		
		*/
		
		
		// 컴파일 작업 vs 런타임 작업
		// - 컴파일 : 실제 프로그램이 실행하는것이 아니라, 단지 언어만 번역하는 작업만 한다. 단, 그 과정 중에 문법이 유효한지 검사를 한다.
		// --> 또한 밑의 예제로 컴파일은 b2=s2; 컴파일 작업을 할때, s2의 값인 10은 보지도 않고 문법만 본다고 생각하면 된다. 컴퓨터 입장에서 이 문법이 맞나? 확인 작업. byte b2 = short s2 생각하면 된다. 
		// 
		
		short s2 = 230;
		byte b2;
		
		//b2 = s2; // Error : Type mismatch: cannot convert from short to byte
		//해결방법?
		b2 = (byte)s2;
		System.out.println("short -> byte 복사본 : " + b2);
		
		s2 = 127;
		b2 = (byte)s2;
		System.out.println("short -> byte 복사본 : " + b2);
		
		s2 = 128;
		b2 = (byte)s2;
		System.out.println("short -> byte 복사본 : " + b2);
		
		s2 = 1000;
		b2 = (byte)s2;
		System.out.println("short -> byte 복사본 : " + b2);
		
		s2 = 10000;
		b2 = (byte)s2;
		System.out.println("short -> byte 복사본 : " + b2);
		// 위의 값은 쓰레기값을 예시로 든거기 떄문에 값이 왜 그렇게 나오는지 너무 매달리지말자
		
		
		// 다른 예제
		// 기업은행 계좌 : 20억
		int m1 = 2000000000;
		
		// 부산 -> 이체 -> 20억
		short m2;
		
		m2 = (short)m1;
		
		System.out.println("잔액 : " + m2); // 잔액 : -27648 
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		// Error가 안나서 굉장히 위험하니 주의하자
		
		
		
		// 정리
		
		// 암시적 형변환
		// -> 왜 암시적? -> 개발자가 이 사실을 알던 모르던.. 결과는 안전하니 생략
		// short = byte
		
		// 명시적 형변환
		// -> 왜 명시적? -> 이 작업은 잘못 될 가능성이 존재 -> 개발자 너는 이 사실을 명시적으로 책임지고 직접 형변환 해라 -> 책인은 본인 몫
		// byte = (byte)short
		
		
		s2 = 200;
		
		b2 = (byte)s2; // 오버플로우(Overflow) 발생 : 물이 넘치는걸 생각하면 쉬움
					   // 또는 언더플로우(Underflow) 발생
		
		
		
		// ----------------------- 정수형 끼리 형변환
		
		
		// 실수형
		// float, double
		
		// 암시적 예제
		float f1 = 3.14F;
		double d1;
		//8byte = 4byte
		d1 = f1;
		
		System.out.println("float -> double : " + d1);
		
		
		// 명시적 예제
		float f2;
		double d2 = 3.14;
		
		// 4byte = 8byte
		f2 = (float)d2;
		
		System.out.println("double -> float : " + d2);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		// 정수형 : byte, short, int, long -> 거의 int, long 만 사용 
		// 실수형 : float,double -> 거의 double 사용 (이유 : 정밀도)
		
		
		//-----------------------------------------------------
		
		// 정수 <--> 실수 변환
		
		// 예제1 암시적
		int a1;
		float a2;
		
		a1 = 100;
		//float = int
		//4byte = 4byte
		//무한대 = +-21억
		a2 = a1;
		System.out.println("int -> float : " + a2);
		
		// 예제2 명시적
		int a3;
		float a4;
		
		a4 = 3.14F;
		a3 = (int)a4;
		System.out.println("float -> int : " + a3); // 3.14 -> 3
		
		// 예제3 
		long a5;
		float a6;
		
		a5 = 10000000;
		
		//float = long
		//4byte = 8byte
		//무한대 = +-922경
		a6 = a5;
		
		System.out.println("long -> float : " + a6);
		
		// 숫자 자료형의 크기
		// byte(1) < short(2) < int(4) < long(8) <<<<< float(4) < double(8)
		// 실수가 정수보다 정말 많이 무한대로 크다. 정수 <<<< 실수
		
		
		// --------------------------------------------------------
		
		// char
		// - 문자형 
		// -> 문자코드로 저장 -> char 숫자자료형에 속한다. 단, 가감승제(+,-)를 안하는 숫자형
		// - char를 정수로 형변환 할 때는 반드시 int를 사용한다. (short(byte)는 사용금지)
		// - char는 위의 정수 예제와 다르게 명시적, 암시적 구분없이 전부 명시적으로 사용된다.
		
		
		char c5;
		short s5;
		s5 = 97;
		
		System.out.println(s5);
		
		c5 = (char)s5;
		System.out.println("short -> char : " + c5);
		
		
		char c6;
		short s6;
		
		c6 = 'A';
		
		s6 = (short)c6;
		
		System.out.println("char -> short : " + s6);
		
		
		
		// char <--> int
		System.out.println((int)'A');
		System.out.println((int)'가');
		System.out.println((short)'가');
		
	}
}
