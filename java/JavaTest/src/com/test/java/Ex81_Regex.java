package com.test.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex81_Regex {
	
	public static void main(String[] args) {
		
		//Ex81_Regex
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
	}

	private static void m6() {
		
		String txt = "안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. 그리고 집 전화는 02-434-4444입니다. 연락주세요.";
		
		Pattern p = Pattern.compile("\\d{2,3}-(\\d{3,4})-(\\d{4})");
		Matcher m = p.matcher(txt);
		
		while (m.find()) {
			System.out.println(m.group());
			System.out.println(m.group(1)); //group(int) -> 오버로딩 된것을 이용하면 해당 번째에 있는 값을 출력 해줌(부분 추출)
			System.out.println(m.group(2));
		}

		
		
		
	}

	private static void m5() {
		
		//프로젝트 -> 유효성 검사
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String input = scan.nextLine();
		
		//1. 영문자, 숫자, _ 		-> for + charAt + 코드값 비교
		//2. 숫자 시작 금지			-> if + charAt(0) + 코드값 비교
		//3. 4자 ~ 12자 이내		-> if + length
		//만약 위 조건으로 코드를 작성한다면 못해도 20~30 linees 작성해야함
		//정규식으로 한다면? 10줄이내로 유효성 체크를 할 수 있음..
		
		//String regex = "[A-Za-z_][A-Za-z0-9_]{3,11}";
		String regex = "^[A-Za-z_]\\w{3,11}$"; //위 아래 똑같음. 위에 코드를 간략화 한것이 밑에 코드
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		if (m.find()) System.out.println("통과");
		else System.out.println("실패ㅋ");
	}

	private static void m4() {
		//프로젝트 -> 유효성 검사
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력: ");
		String input = scan.nextLine();
		
		//숫자만 입력됬는지 검사
		//charAt(i) -> '0' > c && '0' < c...
		
		String regex = "^[0-9]{1,3}$"; // ^: 숫자(0~9)부터 시작해라~ , %: 1자리~3자리 숫자로 끝나라~
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(input);
		
		if (m.find()) {
			System.out.println("올바른 나이입니다.");
		} else {
			System.out.println("숫자로 다시 작성하세요.");
		}
	}

	private static void m3() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("dat\\naver.txt"));
			
			String wholeText = "";
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				wholeText += line + "\r\n";
			}
			reader.close();
			//System.out.println(wholeText);
			
			//네이버 시작 페이지 > 모든 URL를 수집
			Pattern p = Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");
			Matcher m = p.matcher(wholeText);
			
			while (m.find()) {
				System.out.println(m.group());
			}
		
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

	private static void m2() {
		
		/*
		 * Pattern 클래스
		 * - 정규식 지원
		 */
		
		//txt -> 전화번호 있는지? 없는지?
		String txt = "안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. 그리고 집 전화는 02-434-4444입니다. 연락주세요.";
		
		//정규식 객체 생성 - Pattern
		Pattern p = Pattern.compile("\\d{2,3}-\\d{3,4}-\\d{4}");
		
		//검색 - Matcher > boolean 반환
		//어떤 내용이 검색이 됬는지 출력? -> group();
		Matcher m = p.matcher(txt);
		//System.out.println(m.find());
		if(m.find()) {
			System.out.println("게시물 작성 금지!!");
			System.out.println(m.group());
		} else {
			System.out.println("게시물 작성 완료..");
		}
		
		//게시물 작성 > 금지어
		txt = "글을 쓰고잇씁니다.바보";
		
		p = Pattern.compile("(바보|멍청이)");
		m = p.matcher(txt);
		
		if (m.find()) {
			System.out.println("금지어 사용!!");
			System.out.println(m.group());
		} else {
			System.out.println("ㅇㅋ");
		}
		
		//------------------------------------------
		//숫자만 골라내기
		txt = "안녕하세요. 제 몸무게는 70kg, 키는 180cm, 나이는 27살이다!";
		
		p = Pattern.compile("\\d{1,}"); //숫자 1자리~ 모든숫자자리
		m = p.matcher(txt);
		
		while (m.find()) { 					//m.find ?? --> iter.hasNext() 같은 느낌..
			System.out.println(m.group()); 	//m.group ?? --> iter.next() 같은 느낌..
		}
		
		
	}

	private static void m1() {
		
		/*
		 * 자바 + 정규식
		 * - 자바의 일부 메소드가 정규식을 지원
		 */

		//게시판 정책 > 연락처 작성 금지 > 마스킹 처리
		//System.out.println(txt.replace("010-1234-5678","XXX-XXXX-XXXX"));
		String txt = "안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. 그리고 집 전화는 02-434-4444입니다. 연락주세요.";
		
		//replace(CharSequence target, CharSequence replacement)
		//CharSequence -> String 클래스의 부모 인터페이스, 문자열(String)이라고 생각하자
		System.out.println(txt.replaceAll("[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
		
		
		
		/*
		 * split() 분할메소드
		 * - 구분자를 기준으로 문자를 자르는 기능
		 */
		String name = "홍길동,,아무개.하하하,호호호,헤헤헤";
		
		
		/*
		 * 홍길동,,아무개,,하하하,,호호호,헤헤헤
		 * 만약 콤마(,)가 한번 더 찍힌다면? 공백으로 처리되서 빈방이 생김!!
		 * -> split메소드에서 콤마를 1개 또는 2개로 받는다. {1,2}
		 */
		//String[] result = name.split(",{1,2}");
		
		//만약 콤마(,)가 아니라 점(.)이 찍혀있다면?
		String[] result = name.split("[,\\.]");
		
		for (int i=0; i<result.length; i++) {
			System.out.printf("result[%d] = %s\n", i, result[i]);
		}
		
	}

}
