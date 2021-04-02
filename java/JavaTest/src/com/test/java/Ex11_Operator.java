package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_Operator {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Ex11_Operator.java
		
		// < 연산자, Operator >
		// - 피연산자(Operand)를 대상으로 미리 정해진 연산(계산, 행동)을 한 후에 결과값을 반환하는 구성 요소
		// - 주로 기호를 사용해서 표현
		
		// 1. 문장, Statement
		// 2. 표현식, Expression
		// 3. 연산자
		// 4. 피연산자
		// 5. 연산자 우선 순위
		// 6. 연산 방향
		
		// 자바의 연산자 종류
		// 1. 산술 연산자
		// - +, -, *, /, %(mod, 나머지)
		// - 2항 연산자(피연산자가 2개)
		// - 피연산자를 숫자로 가진다. (정수, 실수)
		
		int a = 10, b = 3;
		System.out.printf("%d + %d = %d\n", a, b, a+b); // 13
		System.out.printf("%d - %d = %d\n", a, b, a-b); // 7
		System.out.printf("%d * %d = %d\n", a, b, a*b); // 30
		System.out.printf("%d / %d = %d\n", a, b, a/b); // 3(몫), 정수 / 정수
		System.out.printf("%d %% %d = %d\n", a, b, a%b); // 1
		System.out.println(10 / 3.0); // 3.3333333333333335 -> 실수 / 실수
		
		// 나누기 연산자 ( 초급자가 이해하기 쉽게 규칙을 알려줌)
		// - 정수 / 정수 = 정수
		// - 정수 / 실수 = 실수
		// - 실수 / 정수 = 실수
		// - 실수 / 실수 = 실수
		System.out.println(10 / 3); // 3
		System.out.println(10 / 3.0); // 3.3333333333333335
		System.out.println(10.0 / 3); // 3.3333333333333335
		System.out.println(10.0 / 3.0); // 3.3333333333333335
		
		
		
		// 모든 산술 연산의 결과는 항상 자료형이 두 피연산자 중 더 큰 자료형으로 반환된다. (중요★★★★★)
		// 위에 것 보다 아래 규칙으로 이해 하도록 하자!! 이유는 밑에!!
		// 1. + : 오버플로우 신경 쓸 것
		// 2. - : 오버플로우 신경 쓸 것
		// 3. * : 오버플로우 더욱 신경 쓸 것
		// 4. / : 오버플로우 발생 X, 소수 이하를 남길지 말지?
		// 5. % : 신경 X
		
		
		System.out.println(10 / 3); // int / int = int
		System.out.println(10 / 3.0); // int / double = double 
		System.out.println(10.0 / 3); // double / int = double
		System.out.println(10.0 / 3.0); // double / double = double
		
		
		int money1 = 2000000000; // 20억
		int money2 = 1500000000; // 15억
		System.out.printf("잔액 : %d", money1+money2); // int + int = int ---> 35억이므로 Overflow 발생
		
		System.out.printf("잔액 : %d", money1+(long)money2); // int + long = long --> long으로 변환해서 정상 값 35억 출력됨.
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		// 2.비교 연산자
		// - >, >=, <, <=, ==, !=
		// - 2항 연산자
		// - 피연산자는 모두 숫자형
		// - 연산의 결과가 항상 boolean(true, false)
		// - 문자열의 비교는 동등 비교만 가능 
		// - 연산자(==, !=) 사용XXXX 
		// - 대신, equals() 매소드를 사옹해야 한다. (중요함★★★★★)
		
		a = 10;
		b = 5;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a != b);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		// 요구사항 : num이 양수 입니까?
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.print("숫자 입력: ");
//		
//		int num = Integer.parseInt(reader.readLine());
//		System.out.println("결과 : "+ (num > 0));
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "아무개";
		String str4 = "홍";
		str4 = str4 + "길동";
		
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		System.out.println(str1 == str4); // false
		
		System.out.println(str1.equals(str2)); // str1 == str2, true	
		System.out.println(str1.equals(str3)); // str1 != str3, false	
		System.out.println(str1.equals(str4)); // str1 == str4, true
		
		// 왜 str에서는 왜 == 는 사용 못하고 equals만 사용 해야되는지는 나중에 배운다고 함
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		/* 
		 
		 3. 논리 연산자
		  - &&(and), ||(or), !(not)
		  - 2항 연산자(&&, ||), 1항 연산자(!)
		  - 피연산자는 반드시 boolean을 가진다.
		  - 연산의 결과를 boolean으로 반환한다.
		  - 피연산자를 가지고 특정한 규칙에 따라 연산의 결과를 반환한다.
		  - page 114
	 	
		*/
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		
		System.out.println(b1 && b2); // true && false = false
		System.out.println(b1 && b3); // true && true = true
		System.out.println(b2 && b4); // false && false = false
		System.out.println("");
		
		
		
		System.out.println(b1 || b2); // true || false = true
		System.out.println(b1 || b3); // true || true = true
		System.out.println(b2 || b4); // false || false = false
		System.out.println("");
		
		// 예제) 소개팅 : 서울, 긴머리
		
		String address = "부산";
		String hair = "긴머리";
		
		System.out.println(address.equals("서울") && hair.equals("긴머리"));
		System.out.println(address.equals("서울") || hair.equals("긴머리"));
		System.out.println("");
		
		
		
		// 1항 연산자 : 피연산자가 1개
		System.out.println(!true);
		System.out.println(!false);
		
		boolean flag = true;
		System.out.println(!flag);
		
		
		/*
		 
		 4. 대입 연산자, 할당 연산자
		  - =(equal)
		  - +=, -=, *=, /=, %= : 복합 대입 연산자
		  - LValue = RValue
		  - n = n + 1 과 n += 1 은 똑같다.
		*/
		
		int n = 10;
		
		n = n + 1; // 누적
		System.out.println(n);
		
		n += 1; // n = n+1 동일
		System.out.println(n);
		
		
		n = 10;
		
		n = n - 1;
		n -= 1;
		System.out.println(n);
		
		
		n = 10;
		
		n = n * 2;
		n *= 2;
		System.out.println(n);
		
		
		n = 10;
		
		n = n / 2;
		n /= 2;
		System.out.println(n);
		
		
		n = 10;
		
		n = n % 3;
		n %= 3;
		System.out.println(n);
		
		
		n = 10;
		// -=, /=, %= 은 피연산자의 위치를 주의하자.
		
		n = 20 - n; // n = 20 - n
		n -= 20; 	// n = n - 20 위, 아래는 다른 코드다
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		/*
		 
		 5. 증감 연산자
		  - ++, --
		  - 1항 연산자
		  - 피연산자로 숫자
		  - 피연산자의 값을 +1, -1 누적 시키는 연산자
		  - 연산자과의 결과가 경우에 따라 달라진다.
		  - 연산자의 위치와 피연산자의 위치를 바꿀 수 있다.
		  - 	a. ++n : 전위(전치) 연산자. 우선 순위가 가장 높다.
		  - 	b. --n : 후위(후치) 연산자. 우선 순위가 가장 낮다.
		  
		*/
		
		
		n = 10;
		n = n + 1; // 11
		n += 1; // 12
		++n; // 13
		n++;
		System.out.println(n);
		
		n = n - 1;
		n -= 1;
		--n;
		n--;
		System.out.println(n);
		
		
		/*
		
		 연산자 우선순위
		  - 연산자들을 실행하는 순서
		  - 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자
		  - 증감 연산자 > 산술 연산자 > 비교 연산자 > 논리 연산자 > 대입 연산자 // 전위 ++n
		  - 산술 연산자 > 비교 안산자 > 논리 연산자 > 대입 연산자 > 증감 연산자 // 후위 n++
		  
		*/
		
		// boolean result = 10 > 5 + 1 && 8 < 2 * 3;
		// boolean result = 10 > 6 && 8 < 6;
		// boolean result = true && false;
		// boolean result = true && false;
		// boolean result = false
		
		int num = 10;
		int sum=0;
		
		sum = 20 + ++num;
		System.out.println(sum); // 31
		
		
		num = 10;
		sum = 0;
		
		sum = 20 + num++;
		System.out.println(sum); // 30
		System.out.println(num); // 11	
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//증감 연산자는 다른 연산자와 같은 문장에 작성하지 말것!!!!!!!
		num = 10;
		sum = 0;
		
		++num;
		sum = 20 + num;
		
		System.out.println(sum);
		System.out.println(num);
		
		
		
		num = 10;
		sum = 0;
		
		sum = 20 + num;
		num++;
		
		System.out.println(sum);
		System.out.println(num);
		
		int o = 10;
		System.out.println(--o-o--); //?
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		/*
		 
		 6. 조건 연산자
		 - ?:
		 - A ? B : C
		 - 3항 연산자
		 - A : 조건(boolean)
		 - B, C : 상수, 변수, 연산식 -> 값 -> 연산의 결과값
		 - B와 C는 반드시 자료형이 동일해야 한다.
		 
		 
		*/
		
		System.out.println(true ? "참" : "거짓");
		System.out.println(false ? "참" : "거짓");
		
		// 예제) 사이트 > 회원가입
		// 19세 이상 ~ 60세 미만 
		// > 입력하신 나이 25세는 회원가입 성공입니다.
		// > 입력하신 나이 12세는 회원가입 실패입니다.
		
		int age = 15;
		
		String result = ((age >= 19) && (age < 60)) ? "성공" : "실패"; // 성공 or 실패
		
		System.out.printf("입력하신 나이 %d세는 회원가입 %s입니다.\n", age, result);
		
	}

}
