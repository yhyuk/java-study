package com.test.java.obj;

import java.util.Calendar;

public class Ex34_Class {
	
	public static void main(String[] args) {
		
		
		//Ex34_Class.java
		
		/*
		 * 	Setter, Getter의 목적
		 *  1. 유효성 검사
		 *  2. 읽기, 쓰기 전용 멤버 구현
		 * 
		 */
		
		Baby b1 = new Baby();
		
		//읽기,쓰기 멤버
		b1.setName("홍길동"); 
		System.out.println(b1.getName());
		
		//쓰기 전용 멤버
		b1.setHeight(50); 
		//System.out.println(b1.getHeight);
		
		//읽기 전용 멤버
		System.out.println(b1.getWeight());
		
		b1.setFather("홍아빠");
		b1.setMother("김엄마");
		
		System.out.println(b1.getFather());
		System.out.println(b1.getMother());
		
		//부모 -> 엄마,아빠 따로 작업
		b1.setFather("홍아빠");
		b1.setMother("김엄마");
		
		System.out.println(b1.getFather());
		System.out.println(b1.getMother());
		
		
		
		//부모 -> 엄마,아빠 같이 작업
		String[] parent = new String[] { "홍파더", "김마더" };
		b1.setParent(parent);
		
		b1.setParent(new String[] { "홍파더", "김마더" });
		
		
		String[] = tmep b1.prarent;
		System.out.println(temp(0) + "," + temp1);
		
		System.out.println(b1.parent()[0]);
		System.out.println(b1.parent()[1]);
		
		
		b1.setFather("홍가가");
		//b1.setMother2("둘리");
		
		
		Calendar c = Calendar.getInstance();
		c.set(2021, 0, 10);
		
		b1.setBirthday(c);
		
		System.out.printf("%tF\n", b1.getBirthday());
		
		
		
		b1.setBirthday2(2021, 1, 20);
		
		System.out.println("나이 : " + b1.getAge());

		//b1.getName()				-> private String name 반환
		//b1.getWeight()			-> private int weight 반환 
		//b1.getAge()				-> private int age 반환
		
	}

}

class Baby {
	
	//이름, 키, 몸무게
	private String name;
	private int height;
	private int weight = 5;
	
	// 부모(아빠,엄마) 어떻게 만들까?
	
	//-1
	private String father;
	private String mother;
	
	//-2
	private String[] parent;
	
	//생일
	private Calendar birthday;
	
	//Setter, Getter
	public void setName(String name) {
		//유효성 검사(한글, 글자수 등등..)
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	//Setter, Getter(x)
	public void setHeight(int height) {
		this.height = height;
	}
	
	//Setter(x), Getter
	public int getWeight() {
		return this.weight;
	}
	
	//Getter
	public int getAge() {
		
		Calendar now = Calendar.getInstance();
		
		long gap = now.getTimeInMillis() - this.birthday.getTimeInMillis();
		
		gap = gap / 1000 / 60 / 60 / 24 / 365;
		
		return (int)gap;
		
	}
	
	
	
	
	
	//Setter, Getter
	public void setFather(String father) {
		this.father = father;
	}
	
	public String getFather() {
		return this.father;
	}
	
	
	public void setMother(String mother) {
		this.mother = mother;
	}
	
	public String getMother() {
		return this.mother;
	}
	
	
	
	public void setParent(String[] parent) {
		//String[] = String[]
		this.parent = parent;
	}
	
	public String[] getParent() {
		return this.parent;
	}
	
	
	
	public void setFather2(String father) {
		this.parent[0] = father;
	}
	
	public void setMother2(String mother) {
		this.parent[1] = mother;
	}
	
	public String getFather2() {
		return this.parent[0];
	}
	
	public String getMother2() {
		return this.parent[1];
	}
	
	
	
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	
	public Calendar getBirthday() {
		return this.birthday;
	}
	
	
	
	public void setBirthday2(int year, int month, int date) {
		
		Calendar c = Calendar.getInstance();
		
		c.set(year, month-1, date);
		
		this.birthday = c;
		
	}
	
}