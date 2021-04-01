package com.test.java;

public class Input_Ex01 {
	
	public static void main(String[] args) {
			
		// 요구사항 : 주어진 데이터를 변수를 만들어 아래와 같은 문장을 출력하시오.
		// 조건 : 이름,나이,성별,주소

		String name = "김영혁";
		int age = 27;
		String gender = "남자";
		String home = "인천광역시 남동구 논현동";
		
		System.out.printf("안녕하세요. 제 이름은 '%s'입니다.\n", name);
		System.out.printf("나이는 %d살이고 %s입니다.\n", age, gender);
		System.out.printf("저는 '%s'에 살고 있습니다.\n", home);
		
	}
}
