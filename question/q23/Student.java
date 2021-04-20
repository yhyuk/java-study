package com.test.question.q23;

public class Student {
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this("미정",0,0,0,0);
	}

	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public Student(String name, int age) {
		this(name,age, 0, 0, 0);
	}
	
	public Student(int grade, int classNumber, int number) {
		this("미정", 0, grade, classNumber, number);
	}
	
	public String info() {
		
		/*********************************************************
		 *  방법1
		 *  
		 *  입력값이 없으면 "미정"으로 출력
		 *  입력값 없을때마다 "미정" if문 조건 추가
		 * 
		String tmp;
		
		if(	this.name == "미정" && this.age==0 && this.grade==0 && 
			this.classNumber==0 && this.number==0) {
			tmp = String.format("미정 (나이: 미정, 학년: 미정, 반: 미정, 번호: 미정)");
			
		} else if (this.grade==0 && this.classNumber==0 && this.number==0) {
			tmp = String.format("%s (나이: %d세, 학년: 미정, 반: 미정, 번호: 미정)", 
					this.name, this.age);
			
		} else if (this.name == "미정" && this.age == 0) {
			tmp = String.format("미정 (나이: 미정, 학년: %d, 반: %d, 번호: %d)", 
					this.grade, this.classNumber, this.number);
			
		} else {
			tmp = String.format("%s (나이: %d세, 학년: %d, 반: %d, 번호: %d)", 
			this.name, this.age, this.grade, this.classNumber, this.number); 
		}
		
		return tmp;
		********************************************************/
		/*
		 *  방법2
		 *  
		 *  조건없이 바로 리턴값 출력
		 *  format에 삼항연산자 이용해서 입력값 없을 시 "미정" 출력 
		 * 	format에서 전부 문자열로 반환
		 */
		
		
		return String.format("%s (나이: %s, 학년: %s, 반: %s, 번호: %s)", 
								this.name, 
								this.age == 0 ? "미정" : this.age+"세", 
								this.grade == 0 ? "미정" : this.grade+"", 
								this.classNumber == 0 ? "미정" : this.classNumber+"", 
								this.number == 0 ? "미정" : this.number+"");
	}
}
