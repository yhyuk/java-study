package com.test.java.Inheritance2;

public class Ex49_Interface {

	public static void main(String[] args) {
		
		//Ex49_Interface.java
		//Monitor.java  -> interface
		//LG100.java -> class
		//HP200.java -> class
		
		

		//홍길동
		//-> 모니터 구입 -> LG100 -> 수령 -> on()
		LG100 lg = new LG100(); //구입
	
		//lg.on(); //전원on
		//lg.off(); //전원off
		
		// 10년 지나고...
		// -> HP200 구입 -> 수령 ->
		HP200 hp = new HP200();
		
		//hp.on(); //경험에 기반된 행동
		hp.begin();
		
		//hp.off();
		hp.end();
		
		
		
		
		//LG100과 HP200은 같은 인터페이스를 상속받았다.(구현했다.)
		// -> 똑같은 이름의 메소드를 가지고 있다.(****************)
		// -> 사용법이 동일하다.(************)
		// -> 추가 학습없이 서로 다른 클래스의 객체를 동일한 사용법으로 조작이 가능하다.!!!!!
		
		LG100 lg2 = new LG100();
		
		lg2.PowerOn();
		lg2.PowerOff();
		
		//10년...
		
		HP200 hp2 = new HP200();
		
		hp2.PowerOn();
		hp2.PowerOff();
		
		
	}//main
	
}//Ex49
