package com.test.java;

public class Ex06_Escape {

	public static void main(String[] args) {
		
		//특수 문자 > Escape Sequence
		// - 컴파일러와 미리 약속된 문자 > 소스에는 특정한 문자를 작성했지만, 실행 시 특정 행동을 하는 문자
		// - 자료형: char
		
		//1. \n
		// - new line
		// - 개행 문자 > 엔터
		// - 실행 중 \n 문자를 만나면 즉시 엔터를 쳐라(개행을 해라)
		
		char c1 = '\n';
		
		String str = "안녕하세요. \n김영혁입니다.";
		System.out.println(str);
		
		String str1 = "안녕하세요.";
		String str2 = "김영혁입니다.";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(); //빈줄 출력
		
		//문자열 리터널 내에는 엔터를 입력할 수 없다. > 문자열 리터럴은 단일 라인 이어야 한다.
		//String str3 = "안녕하세요.
		//             김영혁입니다."; //error
		
		//2. \r 
		// - carriage return
		
		str = "반갑습니다.\r김영혁";
		System.out.println(str); //김영혁니다
		System.out.println();
		
		// java.exe -jar ex06.jar
		
		//일반적으로 행을 바꿀때 > 엔터키누름
		// -> 엔터(\r + \n)
		
		// -> 엔터 -> "\r\n"
		// 운영체제(\r\n, \r, \n)
		//- 1. 윈도우 : CRLF(\r\n)
		//- 2. 유닉스(리눅스) : LF(\n)
		//- 3. 맥 : CR(\r)
		
		
		
		//3. \t	
		// - 탭 문자	
		// - 가장 가까운 탭의 위치로 이동
		
		str1 = "이름:\t김영혁";
		str2 = "나이:\t27세";
		String str3 = "휴대폰:\t010-3156-2841";
		
		System.out.println(str1);
		System.out.println(str3);
		System.out.println(str2);
		System.out.println();
		
		//4. \b
		// - backspace
		str = "김영혁\b입니다.";
		System.out.println(str); // 김영혁입니다. 김영입니다.
		System.out.println();
		
		//5. \", \', \\
		//화면에 김영혁 : "안녕하세요" 출력하기
		str = "김영혁 : \"안녕하세요\"";
		System.out.println(str);
		
		//현재 수업 폴더 경로 출력하기
		//D:\class\java
		//Error : Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		str = "D:\\class\\java";
		System.out.println(str);
		
		
	}	
	
}
