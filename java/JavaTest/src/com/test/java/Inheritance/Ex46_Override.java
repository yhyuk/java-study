package com.test.java.Inheritance;

import java.util.Calendar;
import java.util.Date;

public class Ex46_Override {

	public static void main(String[] args) {

		// Ex46_Override.java

		Time t1 = new Time(10, 5, 30);

		System.out.println(t1);
		/*
		 * com.test.java.obj.Inheritance.Time@26f0a63f -
		 * com.test.java.obj.Inheritance.Time : 패지키, 클래스명 - @ - 26f0a63f :
		 * 해시코드(HashCode) > 해당 객체가 있는 메모리 주소값(Hex)
		 * 
		 * print(), println(), printf() -> 객체 변수를 출력하게 되면 자동으로 객체의 toString() 메소드를 호출하고
		 * 그 반환값을 출력한다.
		 */
		
		System.out.println(t1.toString()); 	// output : 10:5:30
		System.out.println(t1.info()); 		// output : 10:5:30 .. 그렇다면 왜 굳이 오버라이드 할까?
		/*
		 *  info() 메소드를 사용안하고 toString()을 재정의 하는 이유?
		 *  -> 많은 사람들의 공통된 경험
		 *  -> 대부분의 개발자들은 객체의 toString() 메소드가 객체 자신의 데이터를 문자열로 반환할거라는 많은 경험과 기대치를 가지고있다.
		 *  -> info()는 개발자가 직접 만든것이므로 번거롭고, 해당 메소드를 외워야함 
		 *  -> toString()으로 재정의 하면 해결됨
		 *  -> toString()의 목적? 
		 *  	- 반환된 문자열을 그대로 업무에 사용( X ) 
		 *		- 개발자가 객체의 상태를 확인하는 용도( O )
		 */

		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.toString()); 
		// Calendar.toString() -> 
		// Calendar 클래스가 Object 클래스가 물려준 toString()을 그대로 사용 안하고 재정의 했다. (*****)
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());

	}// main

}

class Time {

	private int hour;
	private int min;
	private int sec;

	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public String info() {
		return String.format("%d:%d:%d", this.hour, this.min, this.sec);
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}

//	@Override
//	public String toString() {
//		return String.format("%d:%d:%d", this.hour, this.min, this.sec);
//	}
	
	
	
}
