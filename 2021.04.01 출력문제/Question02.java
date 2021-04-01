package com.test.java;

public class Input_Ex02 {
	
	public static void main(String[] args) {
		// 요구사항 : 주어진 데이터를 변수를 만들어 아래와 같은 문장을 출력하시오.
		// 조건 : 이름,국어,영어,수학 x 3개 변수 생성
		
		int kor1 = 80;
		int eng1 = 90;
		int math1 = 95;
		
		int kor2 = 76;
		int eng2 = 86; 
		int math2 = 79;
		
		int kor3 = 89;
		int eng3 = 92;
		int math3 = 85;
		
		System.out.println("[학생]  [국어]   [영어]   [수학]  [평균]");
		System.out.println("-----------------------------------");
		System.out.printf("홍길동\t%s\t%s\t%s\t%s\n", kor1,eng1,math1,(kor1+eng1+math1)/3);
		System.out.printf("아무개\t%s\t%s\t%s\t%s\n", kor2,eng2,math2,(kor2+eng2+math2)/3);
		System.out.printf("하하하\t%s\t%s\t%s\t%s\n", kor3,eng3,math3,(kor3+eng3+math3)/3);
		
		
	}
}
