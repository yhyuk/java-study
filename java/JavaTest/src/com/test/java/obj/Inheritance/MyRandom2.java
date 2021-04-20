package com.test.java.obj.Inheritance;

import java.util.Random;

public class MyRandom2 extends Random { //Random클래스를 부모로 모든기능을 상속받는다.
	
	//nextInt()
	//nextBoolean()
	
	public int nextTinyInt() {
		Random rnd = new Random();
		return rnd.nextInt(10) + 1;
	}
	
	public String nextColor() {
		Random rnd = new Random();
		String[] color = {"red", "yellow", "blue", "orange", "green"};
		return color[rnd.nextInt(color.length)];
	}
	
	
}
