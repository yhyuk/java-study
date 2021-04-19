package com.test.java.obj;

public class Ex35_Class {
	
	public static void main(String[] args) {
		
		//Ex35_Class.java
		
		Glass g1 = new Glass();
		
		
		g1.setColor("dd");
		System.out.println(g1.getColor());
		
	}
	
}

class Desk {
	/* 
	 *  Getter, Setter -> 누가 만들어도 동일한 코드
	 *  자주 반복되는 코드 -> Boilerplate Code -> 생산성문제? -> 자동화? -> 발전 ~
	 *  
	 *  1. 이클립스 기능 
	 *  - Context Menu > Source
	 *  - Code Template(syso, main, reader ...) or Code Sniper(코드조각)
	 *  2. 외부 기능 > Lombok(롬복) Library > 설치
	 *  
	 *  
	 */  
	
	
	private String color;
	private int weight;
	private String name;
	private String model;
	private int size;
	private String brand;
	private int price;


}
