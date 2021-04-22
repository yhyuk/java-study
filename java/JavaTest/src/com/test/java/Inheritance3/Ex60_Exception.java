package com.test.java.Inheritance3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex60_Exception {
	
	//더이상 책임져줄 메소드가 없기 때문에 main메소드는 예외 미루기를 하면 안된다.
	//--> 최후의 보루
	public static void main(String[] args) throws IOException {
		
		//Ex60_Exception.java
		
		/*
		 *  예외, Exception
		 *  - 컴파일X, 런타임O
		 *  - 개발자 예측O, X -> 예측을 하더라도 부활할 수 있다.
		 *  - 나중에 일어날 수 있는 여러가지 예외상황을 미리 예측해서 그에 따른 대비를 하는 작업
		 *  - -> 예외처리
		 * 
		 */
		
		
		/*
		 *  예외처리, Excpetion Handling
		 *  1. 전통적인 방법
		 *  - 제어문(조건문) 사용
		 *  
		 *  2. 예외처리 구문
		 *  - try, catch
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		try {
			m7();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		m8();
		
	}//main
	
	private static void m8() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		//Java는 모든 외부 입출력은 예외 미루기 선언
		// -> 외부 입출력은 개발자의 의도와 상관없이 Error 발생할 가능성이 있기 때문이다.
		// -> 반드시 try catch를 준비해라!!
		String line = reader.readLine();
		
		
	}

	private static void m7() throws Exception {  // throws Exception : 예외 미루기
		
		//try의 영역은 최소화하는 것을 추천한다.
		//예외 미루기 , throws Exception
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		//try {
			System.out.println(100/num);
		//} catch (Exception e) { System.out.println("예외 처리"); }
		
	}

	private static void m6() {
		
		/*
		 *  예외 던지기
		 * 
		 *  업무] 숫자입력 > 3의 배수 	O > 진행
		 *  							X > 예외처리
		 *  
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("업무 진행..");
		} else {
			System.out.println("예외 처리..");
		}
		
		try {
			
			if(num % 3 !=0) {
				Exception e = new Exception();
				throw e; //예외 던지기 - 문법적인 오류가 아닌 상황에서 예외를 강제로 발생시킬 때 사용하는 도구
			}
			
			System.out.println("업무 진행..");
		} catch (Exception e) {
			System.out.println("예외 처리..");
		}
	}

	private static void m5() {  
		
		
		try {
			
			//업무 1.
			int[] num = { 100, 200, 300 };
			num[5] = 500;
			System.out.println("업무1");
			
			//업무 2.
			Random rnd = new Random();//null;
			System.out.println(rnd.nextInt());
			System.out.println("업무2");
			
			//업무 3.
			int n = 10; //사용자 입력
			System.out.println(100/n);
			System.out.println("업무3");
			
		} 	
		catch (ArrayIndexOutOfBoundsException e) { System.out.println("배열 오류"); }
		catch (NullPointerException e) { System.out.println("널참조"); }
		catch (ArithmeticException e) { System.out.println("산술 연산 오류"); }
		catch (Exception e) { System.out.println("오류"); }
		
		
		System.out.println("프로그램 종료");
		
	}

	
	private static void m4() { // m3()보다 try가 하나밖에없지만 어떤구문이 예외됬는지 모름 
		
		//업무 1.
		try {
			
			int[] num = { 100, 200, 300 };
			num[5] = 500;
			System.out.println("업무1");
			
			//업무 2.
			Random rnd = null;
			System.out.println(rnd.nextInt());
			System.out.println("업무2");
			
			//업무 3.
			int n = 0; //사용자 입력
			System.out.println(100/n);
			System.out.println("업무3");
			
		} catch (Exception e) {
			System.out.println("예외를 처리했습니다.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료");
		
	}

	private static void m3() { // try-catch 문이 너무 많음 > 비경제적
		
		//업무 1.
		try {
			int[] num = { 100, 200, 300 };
			num[5] = 500;
		} catch (Exception e) {
			System.out.println("방번호가 올바르지 않습니다.");
		}
		
		
		//업무 2.
		try {
			Random rnd = null;
			System.out.println(rnd.nextInt());
		} catch (Exception e) {
			System.out.println("Random 객체를 생성하지 않았습니다.");
		}
		
		
		//업무 3.
		try {
			int n = 0; //사용자 입력
			System.out.println(100/n);
		} catch (Exception e) {
			System.out.println("0으로 나누려고 했습니다.");
		}
		
		
		System.out.println("프로그램 종료");
		
	}

	private static void m2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		if(num!=0) {
			//업무 코드(비지니스 코드)
			System.out.printf("100 / %d = %d\n", num, 100/num);
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		
		//예외 조건???
		//-> 일단 에러 발생시키고 -> catch절로 이동 -> 마무리를한다
		try {
			
			System.out.printf("100 / %d = %d\n", num, 100/num); // new Exception() 발생

		} catch(Exception e) {
			
			//Exception e
			// - 에러 발생과 관련된 일련의 정보를 담고 있는 객체
			
			System.out.println("0을 입력하면 안됩니다.");
			System.out.println(e.getMessage()); // by zero
			System.out.println(e.toString()); // java.lang.ArithmeticException: / by zero
		}
		
		System.out.println("프로그램 종료");
		
		
	}

	private static void m1() {
		
		//Scanner : 자료형별로 입력 메소드가 각각 존재한다. > parseXXX 필요없음
		
		Scanner scan = new Scanner(System.in); //System.in.read() 메소드 사용 -> Wrapper Class;
		
		System.out.print("입력: ");
		String line = scan.nextLine(); // reader.readLine() 동일
		System.out.println(line);
		
		int num = scan.nextInt();
		System.out.println(num + 100);
	}
		
	
}
