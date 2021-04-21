package com.test.java.Inheritance2;

//모니터 제품 - 실제 제품
public class HP200 implements Monitor{
	
	//모니터 특성
	private String name;
	private int power;
	private String color;

	//모니터 행동 
	
	public void begin() {
		System.out.println("HP200 Power on");
	}
	
	public void end() {
		System.out.println("HP200 Power off");
	}
	

	@Override
	public void PowerOn() {
		System.out.println("HP200 Power on");
		
	}

	@Override
	public void PowerOff() {
		System.out.println("HP200 Power off");
		
	}
}
