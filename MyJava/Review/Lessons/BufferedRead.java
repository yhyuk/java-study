package Review.Lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {

	public static void main(String[] args) throws IOException{
		
		// BufferedReader복습
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.print("출생년도 입력 : ");
//		
//		int year = 2022 - Integer.parseInt(reader.readLine());
//		System.out.printf("제 나이는 %d살 입니다.", year);
		
		
		// 요구사항 : 
		// 숫자(정수)를 2개 입력받아 + 연산을 하시오.
		// 연산 과정과, 결과를 모두 출력 하시오.
		
		System.out.print("1번째 숫자: ");
		String num1 = reader.readLine(); // 입력
		int n1 = Integer.parseInt(num1); // 문자 -> 숫자
		
		System.out.print("2번째 숫자: ");
		String num2 = reader.readLine(); // 입력
		int n2 = Integer.parseInt(num2); // 문자 -> 숫자
		
		System.out.printf("%d + %d = %d", n1, n2, n1+n2);

		
	}
	
}
