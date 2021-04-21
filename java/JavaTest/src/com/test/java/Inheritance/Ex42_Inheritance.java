package com.test.java.Inheritance;

import java.util.Random;

public class Ex42_Inheritance {
	
	public static void main(String[] args) {
		
		// Ex42_Inheritance.java
		
		//m1();
		
		/* 
		 *  상황] 개발자 담당업무 > 난수 발생 잦음 > 난수 발생 코드구현 장음
		 *	1. -21억 ~ 21억
		 *	2. 1 ~ 10
		 *  3. 색상 난수 : red, yellow, blue, orange, green
		 *	4. true, false
		 */
		
		//s1(); //하드한 방식
		//s2();
		//s3();
		s4();
	}

	private static void s4() {
		
		//Random을 베이스로해서 추가 기능을 넣은 클래스 -> 확장(Extends)
		MyRandom2 my = new MyRandom2();
		
		//1. -21억 ~21억
		for(int i=0; i<5; i++) {
			System.out.println(my.nextInt()); 
		}
		
		//2. 1 ~ 10
		for(int i=0; i<5; i++) {
			System.out.println(my.nextTinyInt());
		}
		
		//3. 색상 난수 : red, yellow, blue, orange, green
		for(int i=0; i<5; i++) {
			System.out.println(my.nextColor());
		}
		
		//4. true, false
		for(int i=0; i<5; i++) {
			System.out.println(my.nextBoolean());
		}
	}

	private static void s3() {
		
		MyRandom my = new MyRandom();
		
		//1. -21억 ~21억
		for(int i=0; i<5; i++) {
			System.out.println(my.nextInt()); 
		}

		//2. 1 ~ 10
		for(int i=0; i<5; i++) {
			System.out.println(my.nextTinyInt());
		}

		//3. 색상 난수 : red, yellow, blue, orange, green
		for(int i=0; i<5; i++) {
			System.out.println(my.nextColor());
		}
		
	}

	private static void s2() {
		
		Random rnd = new Random();
		MyRandom my = new MyRandom();
		
		//1. -21억 ~21억
		System.out.println(rnd.nextInt()); 
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		//2. 1 ~ 10
		System.out.println(my.nextTinyInt());
		System.out.println(my.nextTinyInt());
		System.out.println(my.nextTinyInt());
		System.out.println(my.nextTinyInt());
		System.out.println(my.nextTinyInt());

		//3. 색상 난수 : red, yellow, blue, orange, green
		System.out.println(my.nextColor());
		System.out.println(my.nextColor());
		System.out.println(my.nextColor());
		System.out.println(my.nextColor());
		System.out.println(my.nextColor());
		
		
	}

	private static void s1() {
		
		Random rnd = new Random();
		
		//1. -21억 ~21억
		System.out.println(rnd.nextInt()); //순수 random 기능
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		//2. 1 ~ 10
		System.out.println(rnd.nextInt(10)+1); //순수 random 기능 + 사용자
		System.out.println(rnd.nextInt(10)+1); 
		System.out.println(rnd.nextInt(10)+1); 
		System.out.println(rnd.nextInt(10)+1); 
		System.out.println(rnd.nextInt(10)+1); 
		
		//3. 색상 난수 : red, yellow, blue, orange, green
		String[] color = {"red", "yellow", "blue", "orange", "green"};
		System.out.println(color[rnd.nextInt(color.length)]); //순수 random 기능 + 사용자
		System.out.println(color[rnd.nextInt(color.length)]);
		System.out.println(color[rnd.nextInt(color.length)]);
		System.out.println(color[rnd.nextInt(color.length)]);
		System.out.println(color[rnd.nextInt(color.length)]);
		
	}

	private static void m1() {
		
		/*
		 *  난수 생성기
		 *  1. Math.random() 메소드
		 *  2. Random 클래스
		 *  	- nextInt(int)
		 *  	- nextDouble()
		 */
		
		Random rnd = new Random();
		
		for(int i=0; i<10; i++) {
			System.out.println(Math.random()); // 0~1
			System.out.println(rnd.nextInt()); // int 범위의 난수 반환 -21억 ~ 21억
			System.out.println(rnd.nextInt(9)+1); // 0~9 사이
			System.out.println(rnd.nextBoolean());
			System.out.println(rnd.nextDouble());
			System.out.println(rnd.nextLong());
			System.out.println();
		}
		
	}

}
