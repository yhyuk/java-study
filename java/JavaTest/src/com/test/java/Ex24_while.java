package com.test.java;

public class Ex24_while {
	
	public static void main(String[] args) {
		
		//Ex24_while.java
		
		/*
		 *  반복문
		 *  1. for (중요)
		 *  2. while (중요)
		 *  3. do while (잘 안쓰임)
		 * 
		 */
		
		
		
		//m1();
		m2();
	}

	private static void m2() {
		
		/*
		 *  do while문
		 *  
		 *  //선조건 후실행
		 *  while (조건식) {
		 *  	실행코드;
		 *  }
		 *  
		 *  
		 *  
		 *  //선실행 후조건 -> 무조건 1회 실행 보장(while과의 가장 큰 특징)
		 *  
		 *  do
		 *  {
		 *  	실행코드;
		 *  }
		 *  while (조건식);
		 * 
		 */
		
		
		int n = 20;
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
	}

	private static void m1() {
		
		/*
		 *  while문
		 *  - for문과 유사
		 *  - 조건에 따라 반복 제어
		 *  
		 *  while (조건식) {
		 *  	실행문;
		 *  }
		 *  
		 *  if (조건식) {
		 *  	실행문;
		 *  }
		 *  
		 */
		
		
		//숫자 1~10까지 출력
		//for <--> while 비교
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int n = 1; //초기식
		while (n<=10) { //조건식
			System.out.println(n);
			n++; //증감식
			
		}
		System.out.println();
		
		
		//for문제를 while로 풀어보기
		//누적값이 1000 -> 출력
		
		//예시 for 1
		int sum = 0;
		
		for (int i=1; true; i++) {
			sum += i;
			
			if(sum >= 1000) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(sum);
		
		//예시 while 2
		sum = 0;
		n = 1;
		
		while(sum < 1000) {
			sum += n;
			n++;
		}
		System.out.println(sum);
		
		//예시 for 3
		sum = 0;
		
		for (int i=1; sum<=1000; i++) {
			sum += i;

		}
		System.out.println(sum);
	}


}
