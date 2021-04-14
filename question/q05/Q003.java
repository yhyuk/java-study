package com.test.question.q05;

public class Q003 {
	
	public static void main(String[] args) {
		
		/*
		 
		  3번 Question
		  
		  요구사항 : 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드 선언 -> 호출 하시오
		  
		  메소드 : 	int positive(int)
		 		 	int positive(int, int)
		 		 	int positive(int, int, int)
		 		 	int positive(int, int, int, int)
		 		 	int positive(int, int, int, int, int)
		 
		*/
		
		int count = positive(-10);
		System.out.printf("양수 : %d개\n", count);
		
		count = positive(50,76);
		System.out.printf("양수 : %d개\n", count);
		
		count = positive(-10,-20,-10);
		System.out.printf("양수 : %d개\n", count);
		
		count = positive(123,245,234, 1, 2);
		System.out.printf("양수 : %d개\n", count);
	}
	
	
	public static int positive(int num1) {
		
		int count_number1 = (num1 > 0) ? 1 : 0; 
		
		return count_number1;
	}
	
	public static int positive(int num1 , int num2) {
		
		int count_number1 = (num1 > 0) ? 1 : 0; 
		int count_number2 = (num2 > 0) ? 1 : 0; 
		
		return count_number1 + count_number2;
		
		/*
			
			- 방법2
			- 변수 result에 대입연산자 풀이
			int result=0;
		      
		    result += (n1 > 0) ? 1 : 0; // 1
		    result += (n2 > 0) ? 1 : 0; // 1+1 = 2
		      
		    return result;
		    
	    */
		
	}
	
	public static int positive(int num1, int num2, int num3) {
		
		int count_number1 = (num1 > 0) ? 1 : 0; 
		int count_number2 = (num2 > 0) ? 1 : 0; 
		int count_number3 = (num3 > 0) ? 1 : 0; 
		
		return count_number1 + count_number2 + count_number3;
		
	}
	
	public static int positive(int num1, int num2, int num3, int num4) {
		
		int count_number1 = (num1 > 0) ? 1 : 0; 
		int count_number2 = (num2 > 0) ? 1 : 0; 
		int count_number3 = (num3 > 0) ? 1 : 0; 
		int count_number4 = (num4 > 0) ? 1 : 0; 
		
		return count_number1 + count_number2 + count_number3 + 
				count_number4;
		
	}
	
	public static int positive(int num1, int num2, int num3, int num4, int num5) {
		
		int count_number1 = (num1 > 0) ? 1 : 0; 
		int count_number2 = (num2 > 0) ? 1 : 0; 
		int count_number3 = (num3 > 0) ? 1 : 0; 
		int count_number4 = (num4 > 0) ? 1 : 0; 
		int count_number5 = (num5 > 0) ? 1 : 0; 
		
		return count_number1 + count_number2 + count_number3 + 
				count_number4 + count_number5;
		
	}
	
}
