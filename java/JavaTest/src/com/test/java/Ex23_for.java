package com.test.java;

public class Ex23_for {
	
	public static void main(String[] args) {
		
		
		//m1();
		//m2();
		//m3();
		m4();
		
	} //main

	private static void m4() {
		
		//별찍기 -> 루프 연습
		
		//예제1
		for (int i=0; i<10; i++) { //행 출력(증감)
			for (int j=0; j<5; j++) { //열 출력(증감
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//예제2
		for (int i=0; i<5; i++) { //행 출력(증감)
			for (int j=0; j<=i; j++) { //열 출력(증감
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//예제3
		for (int i=0; i<5; i++) { //행 출력(증감)
			for (int j=i; j<5; j++) { //열 출력(증감
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//예제4
		for (int i=0; i<5; i++) { //행 출력(증감)
			for (int j=0; j<(4-i); j++) { //열 출력(증감
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) { //열 출력(증감
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}

	private static void m3() {
		
		//1. 루프 변수 제어
		//2. 분기문 개입
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				
				if (i==5) {
					//자신이 직접 포함된 제어문만 빠져나감
					//--> j for문 탈출
					break;
					//continue;
				}
				
				System.out.printf("i : %d, j : %d\n", i, j);
			}
		}
		
	}

	private static void m2() {
		
		//2중 for문 -> 구구단 (2단~9단)
		
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		
		
	}

	private static void m1() {
		
		// 2중 for문
		// - 바깥쪽 회전수 x 안쪽 회전수
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				System.out.printf("i : %d, j : %d\n", i, j);
			}
		}
		
		System.out.println();
		
		for (int i=0; i<100; i++) {
			System.out.printf("i: %d\n", i);
		}
		
		System.out.println();
		System.out.println();
		//위 두 코드는 100번씩실행은 똑같다. 우리가 배운 밑에가 더 간결한데...
		//2중 for문은 왜, 어떨때 쓸까?
		
		//A. 시계(시침, 초침)
		for (int i=0; i<24; i++) { //시
			for (int j=0; j<60; j++) { //분
				System.out.printf("%02d:%2d\n", i, j);
			}
		}
		System.out.println();
		System.out.println();
	
		//B. 강의실(6개) + 학생(30)
		for (int i=1; i<=6; i++) { //강의실
			for (int j=1; j<=30; j++) { //학생
				System.out.printf("%d강의실 %02d번 학생\n", i, j);
			}
		}
		
		System.out.println();
		System.out.println();
		
		//C. 아파트 110동 -> 15층 -> 5세대(1호~5호)
		for (int i=1; i<=15; i++) {
			for (int j=1; j<=5; j++) {
				System.out.printf("%02d층에 사는 사람%d입니다.\n", i , j);
			}
			
		}
		
		System.out.println();
		System.out.println();

		//3중 for문 check
		for (int i=0; i<24; i++) {
			for (int j=0; j<60; j++) {
				for (int k=0; k<60; k++) {
					System.out.printf("2%d:2%d:2%d\n", i, j, k);
				}
				
			}
			
		}
		
	}

}
