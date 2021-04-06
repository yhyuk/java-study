package com.test.java;

public class Ex18_Recursive {

	public static void main(String[] args) {
		
		// Ex18_Recursive.java
		
		/*
		 
		  재귀 메소드(Recursive Method)
		  - 메소드가 자신의 구현부에서(body) 자신을 호출하는 구문을 가지는 메소드
		  - 자기가 자기를 호출하는 메소드
		
		  test();
			
		  팩토리얼
		  4! = 4 * 3 * 2 * 1
		  4! = 24
		  
		*/
		int n = 4;
		
		int result = factorial(n);
		
		System.out.printf("%d! = %d\n", n, result);
		
		
	} // main
	
	
	private static int factorial(int n) {
		
		int temp = (n == 1) ? 1 : n * factorial(n - 1);
		
		return temp;
	}


	//test() 메소드의 호출 횟수 : 무한대
	public static void test() {
		
		
		// Error 발생 : StackOverflowError
		// - 메모리가 꽉차서 더이상 아무것도 못합니다..
		System.out.println("This is Test");
		
		test(); // ?? test() 자기 메소드를 자기가 부른다 ?? why ??
		
	}
	
}
