package com.test.java.Inheritance;

import java.util.Random;

public class MyRandom {

	public int nextInt() {
		Random rnd = new Random();
		
		return rnd.nextInt();
	}
	
	public int nextTinyInt() {
		
		Random rnd = new Random();
		
		return rnd.nextInt(10) + 1;
	}
	
	public String nextColor() {
		
		Random rnd = new Random();
		
		String[] color = {"red", "yellow", "blue", "orange", "green"};
		return color[rnd.nextInt(color.length)];
	}
	
	public boolean nextBoolean() {
		Random rnd = new Random();
		
		return rnd.nextBoolean();
	}
	
}
