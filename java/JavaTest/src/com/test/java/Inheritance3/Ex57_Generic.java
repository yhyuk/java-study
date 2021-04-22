package com.test.java.Inheritance3;


public class Ex57_Generic {
	
	public static void main(String[] args) {
		
		//Ex57_Generic.java
		
		/*
		 *  자료형
		 *  1. 값형(원시형)
		 *  	a. 정수(byte, short, int, long)
		 *  	b. 실수(float, double)
		 *  	c. 문자(char)
		 *  	d. 논리(boolean)
		 *  
		 *  2. 참조형
		 *  	- 모두 클래스
		 *  	a. String
		 *  	b. 배열
		 *  	c. 클래스 
		 *  		1) 일반 클래스
		 *  		2) 추상 클래스
		 *  		3) 인터페이스
		 *  		4) enum
		 *  		5) 제네릭 클래스
		 *  
		 *  
		 *  제네릭, Generic
		 *   - 클래스의 일종
		 *  
		 */
		
		System.out.println("===int 전용클래스===");
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		System.out.println("===object 범용클래스===");
		WrapperObject n2 = new WrapperObject(200);
		System.out.println(n2);
		System.out.println((int)n2.getData() * 2);
		System.out.println();
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);//전용(WrapperInt) + 범용(WrapperObject)
		System.out.println(n3);
		System.out.println(n3.getData() *2);
		System.out.println();

		
		System.out.println("===string 전용 클래스===");
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		
		System.out.println("===object 범용클래스===");
		WrapperObject s2 = new WrapperObject("안녕하세요");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length()); // String 형변환시 괄호 주의
		System.out.println();

		
		Wrapper<String> s3 = new Wrapper<String>("호잇");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		System.out.println("===boolean 전용클래스===");
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		System.out.println("===object 범용클래스===");
		WrapperObject b2 = new WrapperObject(false);
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓"); 
		
		
		
		/* 
		 *  제네릭 클래스의 장점 2가지
		 *  1. Object 처럼 모든 자료형을 제어할 수 있다.
		 *  2. 전용 클래스처럼 형변환없이 데이터를 바로 사용이 가능하다.
		 *  // -> object는 다운캐스팅이 필요하다.
		 */
		
		
		
		
	}//main

}

/*
 *  요구사항]
 *  1. int 값 1개를 중심으로 여러가지 작업을 하는 클래스를 선언하시요.
 *  2. String 값 1개를 중심으로 여러가지 작업흘 하는 클래스를 선언하시요.
 *  3. Boolean 값 1개를 중심으로 여러가지 작업흘 하는 클래스를 선언하시요.
 *  4. byte
 *  5. short
 *  6. long
 *  7. float
 *  8. double
 *  9. char
 *
 *  
 *  자료형
 *  10. Random 
 *  11. Calendar
 *  12. Student
 *  .....
 *  무한대			--> 클래스 계속 만들어야함
 *  
 */

class WrapperInt {
	
	private int data; //중심 데이터
	
	public WrapperInt(int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() {

		//int -> String
		//return (String)this.data; //error
		
		//return String.valueOf(this.data); 정석
		return this.data + ""; //편법 : 숫자+문자열=문자열
	}
}

class WrapperString {
	
	private String data; //중심 데이터
	
	public WrapperString(String data) {
		this.setData(data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data; 
	}
}

class WrapperBoolean {
	
	private Boolean data; //중심 데이터
	
	public WrapperBoolean(Boolean data) {
		this.setData(data);
	}

	public Boolean getData() {
		return data;
	}

	public void setData(Boolean data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data + ""; 
	}
}

class WrapperObject {
	
	private Object data; //중심 데이터
	
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data + ""; 
	}
}






class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	private void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		
		return this.data + "";
	}
}