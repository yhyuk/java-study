package com.test.java.Inheritance3;

public class Ex56_Cast {
	
	public static void main(String[] args) {
		
		//Ex56_Cast.java
		
		/*
		 *  형변환 사례
		 *  - 상속, 참조형 형변환, 배열, 제어문, 추상클래스(추상메소드) or Interface(추상메소드)
		 */
		
		/*
		 *  상황]
		 *  1. 대리점 운영
		 *  2. 전자 제품 > 프린터 판매
		 *  3. LG300 x 5대, HP400 x 3대	
		 *  
		 *  운영방침]
		 *  1. 주기적으로 > 매장의 모든 제품이 정상적으로 동작하는지 체크 > 출력 체크	
		 *  
		 *  상황변경]
		 *  1. 프린터 재고 증가 > LG300(100대), HP400(50대)
		 *  2. 브랜드 증가 > Dell500, BenQ600, Epson700 ... 10개 종류 증가
		 *  3. 각 브랜드 제품별 고유 기능도 점검(LG300.call(), HP400.selfTest())
		 * 
		 * 
		 */
		
		//m1();
		//m2();
		m3();
		
	}//main

	private static void m1() {
		
		//가장 원시적인 방법
		
		LG300 lg1 = new LG300();
		LG300 lg2 = new LG300();
		LG300 lg3 = new LG300();
		LG300 lg4 = new LG300();
		LG300 lg5 = new LG300();
		
		HP400 hp1 = new HP400();
		HP400 hp2 = new HP400();
		HP400 hp3 = new HP400();
		
		
		//운영방침 > 매일 1회 점검
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
		//되긴 되지만 좋은 방법은 아님. > 상황변경시 하나씩 다바꿔야함
	}

	private static void m2() {
		
		//향상된 방법 - 배열 사용
		
		LG300[] lgs = new LG300[5];
		
		for(int i=0; i<lgs.length; i++) {
			lgs[i] = new LG300();
		}
		
		HP400[] hps = new HP400[3];
		
		for(int i=0; i<hps.length; i++) {
			hps[i] = new HP400();
		}
		
		//제어 확보 배열 생성 + for -> 10번 반복(브랜드 종류만큼 반복)
		
		
		
		//매일 반복 점검 > 브랜드 종류만큼 for 증가
		for(int i=0; i<lgs.length; i++) {
			lgs[i].print();
			lgs[i].call();
		}
		
		for(int i=0; i<hps.length; i++) {
			hps[i].print();
			hps[i].selfTest();
		}
	}

	private static void m3() {
		
		//더욱 향상된 방법: 
		// - 배열 + 형변환(업, 다운캐스팅)
		// - 실용적인 방법(실제 업무 많이 이용)
		
		//Printer <-> LG300, HP400
		Printer p1 = new LG300(); //부모=자식 : 업캐스팅
		Printer p2 = new HP400(); //부모=자식 : 업캐스팅
		
		Printer[] ps = new Printer[2];
		ps[0] = new LG300();
		ps[1] = new HP400();
		
		//***핵심 LG 5대 + HP 3대 -> 하나의 배열에 저장
		Printer[] list = new Printer[8];
		
		for (int i=0; i<list.length; i++) {
			if( i < 5 ) list[i] = new LG300();
			else list[i] = new HP400();
		}
		
		//매일 점검
		for (int i=0; i<list.length; i++) {
			//공통 기능 -> 추상 메소드 -> 겉으로는 동일해 보여도.. 실제로는 하는일이 각각 다르다.
			list[i].print();
			
			//공통 기능 -> 구현 상속 메소드
			list[i].info();
			
			//list[i]의 자료형 -> Printer -> call(), selfTest() 기능없음
			//-> 다운캐스팅해야됨
			
			//if( i < 5 ) {
			//	LG300 lg = (LG300)list[i];
			//	lg.call();
			//} else {
			//	HP400 hp = (HP400)list[i];
			//	hp.selfTest();
			//}
			
			// -> LG300 1~5, HP400 6~8
			// -> 만약 순서가 뒤죽박죽 섞인다면?
			// -> instanceof 이용
			
			//--------------------------------------------------------------
			/*
			 *  instanceof 연산자
			 *  - 2항 연산자
			 *  - 객체 instanceof 타입
			 *  - 앞의 객체를 뒤의 자료형으로 형변환이 가능합니까?
			 */
			// System.out.println(list[i] instanceof LG300);
			
			if (list[i] instanceof LG300) {
				LG300 lg = (LG300)list[i];
				lg.call();
			} else if (list[i] instanceof HP400) {
				HP400 hp = (HP400)list[i];
				hp.selfTest();
			}
			
			
		}
		
	}

}


/*
 *  LG300, HP400 -> 프린터
 *  1. 공통된 정보(데이터, 변수), 기능(행동, 메소드) -> 상속 -> (구현) -> 클래스 or 추상클래스
 *  2. 공통된 사용법(있으면 좋겠다.) -> 인터페이스 or 추상클래스 상속
 */

abstract class Printer {

	/*  
	 *  프린터로써 갖춰야할 
	 *  - 구현 멤버와 
	 *  - 추상 멤버를
	 *  물려주기 위해서 만든 부모 클래스(추상 클래스)
	 */
	
	//구현 멤버
	// - 회사나 모델에 상관없이 모든 프린터가 가져야할 공통 구현 가능
	public String model; 
	public int price;
	public int ink;
	
	
	public void info() {
		System.out.printf("모델명: %s,\n잉크량: %dml,\n가격: %,d원\n"
							, this.model, this.ink, this.price);
	}
	
	//추상 멤버 
	// - 회사나 모델에 상관없이 모든 프린터가 가져야할 공통적인 사용법
	// - 사용법은 동일해도, 그 내부의 구현 내용은 각자가 알아서 구현한다. ****
	public abstract void print();
	
	
}

class LG300 extends Printer{
	
	
	@Override //모든 프린터의 사용법을 통일시키기 위해서 만든 멤버
	public void print() {
		//내용만은 LG300 맘대로
		System.out.println("LG300으로 잉크젯을 사용해서 출력합니다.");
	}
	
	//LG300만이 가지는 유일한 기능
	public void call() {
		System.out.println("상담원과 연결합니다.");
	}
	
}

class HP400 extends Printer{
	
	@Override //모든 프린터의 사용법을 통일시키기 위해서 만든 멤버
	public void print() {
		//내용만은 HP400 맘대로
		System.out.println("HP400으로 레이저 출력을 합니다.");
	}
	
	//HP400만이 가지는 유일한 기능
	public void selfTest() {
		System.out.println("자가진단을 합니다.");
	}
}