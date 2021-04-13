package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex25_String {
	
	public static void main(String[] args) throws IOException {
		
		// Ex25_String.java ( 중요 )
		
		// 문자열, String
		// - 문자열 관련된 여러가지 기능을 자바가 제공
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		//m1();
		//m2(reader);
		//m3(reader);
		//m4(reader);
		//m5(reader); ---- start
		//m6(reader);
		//m7(reader);
		//m8(reader);
		//m9(reader);
		//m10(reader);
		//m11(reader);
		//m12(reader);
		//m13(reader);
		m14(reader);
		//m15(reader);
	
		
	}//main

	private static void m15(BufferedReader reader) {
		
		// 문자열 치환(바꾸기)
		// - 문자열의 일부를 교체
		// - String replace(Stirng old, String new)
		
		String txt = "안녕하세요. 홍길동님.";
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String oldValue = "홍길동";
		String newValue = "아무개";
		
		// "안녕하세요. 홍길동님"
		// "안녕하세요. "
		// "홍길동" -> "아무개"
		// "님."
		int index = txt.indexOf(oldValue);
		
		if (index > -1) {
			String str1 = txt.substring(0, index); //"안녕하세요"
			String str3 = txt.substring(index + oldValue.length()); // "님."
			
			System.out.println(str1 + newValue + str3);
		}
		
		txt = "안녕하세요. 홍길동님. 반갑습니다. 홍길동님. 잘가세요. 홍길동님";
		
		System.out.println(txt.replace("홍길동","아무개"));
		
		System.out.println(txt.replace(" ", "")); // *****
		
		
		
		txt = "우리는 Java Class 입니다.";
		String word = "JavaClass";
		
		if (txt.replace(" ", "")
				.toUpperCase()
				.indexOf((word.replace(" ", "")
				.toUpperCase())) > -1) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
		
	}

	private static void m14(BufferedReader reader) {
		
		// 문자열 추출 
		// - char charAt(int index) : 1문자 추출
		// - String substring(int beginIndex, int endIndex) : 여러문자 추출
		
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3, 8)); //3부터시작, 8부터시작, 라마바사아
		//System.out.println(txt.substring(3, 100));
		System.out.println(txt.substring(3)); //라마바사아자차카타파하
		System.out.println();
		
		String jumin = "954213-1234567";
		
		System.out.println(jumin.charAt(6) == '-');
		System.out.println(jumin.indexOf("-") == 6);
		System.out.println(jumin.substring (6, 7).equals("-"));
		System.out.println();
		
		//남자-여자 구분
		System.out.println(jumin.substring(7, 8).equals("1") ? "남자" : "여자");
		
		//charAt() && substring()
		// --> 추출한 글자수에 따라서..
		// 1글자 추출 -> charAt() or substring() -> 문자코드 필요
		// N글자 추출 -> substring()
		
//		// 자주사용하는 예제
//		String path = "D:\\class\\java\\JavaTest\\src\\com\\test";
//				
//		// 파일명?? Hello.java
//		int index = path.lastIndexOf("\\");
//		String filename = path.substring((index + 1));
//		System.out.println(filename);
//		
//		// 확장자 없는 파일명 ? Hello
//		index = filename.lastIndexOf(".");
//		String filenameWithOutExt = filename.substring(index);
//		
//		// 확장자? .java
//		String ext = filename.substring(index);
//		System.out.println(ext);
		
	}

	private static void m13(BufferedReader reader) {
		
		// 검색
		// - int indexOf(String s)
		// - 시작부터 검색
		// - int lastIndexOf(Stinrg s)
		// - 끝에서부터 검색
		
		String txt = "안녕 홍길동. 잘가 홍길동.";
		
		System.out.println(txt.indexOf("홍길동")); // 3
		System.out.println(txt.lastIndexOf("홍길동")); // 11
		System.out.println(txt.lastIndexOf("홍길동", 10)); // 3
		
		
	}

	private static void m12(BufferedReader reader) {
		
		// 패턴 검색
		// - boolean startsWith(String word)
		// - boolean endWith(String word)
		
		String name = "홍길동";
		
		// 이름이 '홍'씨? -> boolean
		System.out.println(name.startsWith("홍"));
		System.out.println(name.startsWith("김"));
		// 하지만 잘안쓰인다..?
		// 이유는? -> 이전에 밑에서 배운것들로 충분히 활용가능
		// 하지만 startsWith를 되도록 쓰도록 하자. -> 가독성
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf("홍") == 0);
		
		
		// 이름이 '동'으로 끝나는가?
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf("동") == name.length()-1);
		
		
		
		
		// startsWith , endWith 어디에 쓰일까?
		
		// 해당파일의 이미지?
		String file = "cat.jpg";
		
		if (file.endsWith(".jpg")) {
			System.out.println("이미지 O");
		} else {
			System.out.println("이미지 X");
		}
		
		
		
	}

	private static void m11(BufferedReader reader) {
		
		// 대소문자 변경
		// - String toLowerCase() : 소문자
		// - String toUpperCase() : 대문자
		
		String txt = "Hello World";
		
		System.out.println(txt); // 원본
		System.out.println(txt.toLowerCase()); // all 소문자로 변환
		System.out.println(txt.toUpperCase()); // all 대문자로 변환 
		
		
		
		
		// 그렇다면 대소문자 변경은 어디에 쓰일까?
		// 검색
		// 1. 정확도
		// 2. 검색률
		String content = "우리가 배우는 과목은 Java입니다."; //DB
		String word = "java";
		
		//System.out.println(content.toUpperCase());
		//System.out.println(word.toUpperCase());
		
		if (content.indexOf(word) != -1) {
			System.out.println("검색 결과 있음");
		} else {
			System.out.println("검색 결과 없음");
		}
		// -> output : 검색 결과 없음  
		// 이유?: 찾는값 word의 "java"와 content "Java"는 대소문자가 틀리다.
		
		
		
		
		// 위 문제 해결법
		if (content.toUpperCase().indexOf(word.toUpperCase()) != -1) {
			System.out.println("검색결과 있음");
		} else {
			System.out.println("검색결과 없음");
		}
		// -> output : 검색 결과 있음
		
		// 메소드 체인
		// content.toUpperCase().indexOf()
		// "abc".toUpperCase().indexOf()
		// "ABC".indexOf()
		
		
	}

	private static void m10(BufferedReader reader) {
		
		// 문자열 검색(***)
		// - 문자열 내에서 원하는 문자(열)을 검색 > 위치변환
		// - int indexOf(char c)
		// - int indexOf(String s)
		// - int indexOf(char c, int index)
		// - int indexOf(String s, int index)		
		
		String txt = "안녕하세요. 홍길동님. 반갑습니다. 홍길동님";
		
		
		// - indexOf는 무조건 처음 만나는 검색어의 위치만 반환한다.
		System.out.println(txt.indexOf("홍길동")); // 7
		System.out.println(txt.indexOf("홍길동")); // 7

		System.out.println(txt.indexOf("홍길동", 10)); // 20
		
		
		
		// 그렇다면 txt.indexOf("홍길동", 10)에서 10값은 상수인데 어떻게 찾을까?
		// -->변수지정
		// -->찾은값을 length() 활용
		// -->그 다음 값 추출
		int index = txt.indexOf("홍길동");
		System.out.println(index); // 7
		
		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index); // 20

		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index); // -1 
		
		
		
		
		
		// 여기서 또, 그렇다면 찾을 문자가 몇개인지 어떻게 알까?
		// - 검색어를 모두 찾기 !
		// - 찾는값이 엄청 많더라도 가능
		
		index = 0; //찾기
		
		while (true) {
			
			index = txt.indexOf("홍길동", index);
			
			if (index == -1) {
				break;
			}
			
			System.out.printf("%d번째 발견\n", index);
			
			index += "홍길동".length();
			
		}
		
		
	}

	private static void m9(BufferedReader reader) {

		// 게시판 > 글쓰기
		// - 관리자 모드 : 금지어 설정
		
		
		String txt = "안녕하세요.  반갑습네다.";
		
		// 금지어 : 바보, 멍청이
		
		if(txt.indexOf("바보") == -1) {
			System.out.println("글쓰기 진행..");
			
		} else {
			System.out.println("금지어 사용금지!!!");
		}
		
		
		
	}

	private static void m8(BufferedReader reader) throws IOException {

		// 문자열 검색(***)
		// - 문자열 내에서 원하는 문자(열)을 검색 > 위치변환
		// - int indexOf(char c)
		// - int indexOf(String s)
		
		String txt = "안녕하세요. 홍길동입니다."; // 0~13 숫자출력
		
		int n = txt.indexOf('홍');
		System.out.println(n);
		
		
		n = txt.indexOf("홍길동");
		System.out.println(n);

		n = txt.indexOf("아무개"); // 값에 없는 값
		System.out.println(n); // 못찾으면 -1 출력
		
		txt = "도널드 트럼프 전 미국 대통령을 이어 올해 초 취임한 조 바이든 대통령 역시 중국의 '반도체 굴기'를 용납하지 않겠다는 의지를 확고하게 드러내고 있다. 바이든 정부는 최첨단 시스템반도체 장비 위주였던 제재를 메모리반도체까지 확대할 태세다. 메모리 시장을 장악하고 있는 한국 반도체 업계에는 비상이 걸렸다. 미국과 중국 사이에서 위험한 줄타기를 하다 큰 타격을 맞을 수 있어서다. 업계에선 현 상황을 유연하게 헤쳐나갈 재계·관계의 리더십 실종이 아쉽다는 반응이 나온다.\r\n"
				+ "\r\n"
				+ "트럼프 전 행정부는 중국에 대한 기술 유출 위협을 주요 명분 삼아 반도체 관련 제재에 시동을 걸었다. 2017년 트럼프 당시 대통령은 중국계 사모펀드 캐넌브리지의 미국 기업 래티스반도체 인수 승인 요청을 거부했다. 이듬해에는 중국 메모리 기업 푸젠진화반도체(JHICC)와 미국 기업의 거래를 끊었다. 현재 푸젠진화는 사실상 D램 생산을 접다시피 했다. 2019년에는 미 상무부가 중국 스마트폰 제조사 화웨이를 블랙리스트에 올려 삼성전자·SK하이닉스에서 반도체를 공급받는 길도 막았다.\r\n"
				+ "\r\n"
				+ "국내 반도체 업계 한 관계자는 \"반도체 장비는 장비 회사 홀로 만들 수 없다. ASML도 삼성전자·TSMC 같은 고객사들과 수년에 걸쳐 협력하며 EUV 기술을 끌어올린 것\"이라면서 \"중국이 수십조 원을 쏟아붓고 있지만 제재로 해외 장비 구입이 막힌 데다 자체 반도체 양산 역량도 부족한 형편인 만큼 기술 격차를 좁히기 쉽지 않다\"고 설명했다.\r\n"
				+ "\r\n"
				+ "바이든 정부는 EUV 금지에 이어 심자외선(DUV) 노광 장비를 중국에 수출하는 것도 막는 방안을 구상하고 있다. 미 국가안보회의(NSC) 산하 인공지능(AI)위원회는 지난달 초 연방의회에 제출한 보고서에서 \"네덜란드·일본과 협력해 중국에 대한 EUV·불화아르곤(ArF) 수출을 막아야 한다\"고 제안했다. 그러면서 \"이 같은 제재 정책이 미국 내 첨단 반도체 생산기지에 대한 투자 인센티브와 함께 실현되면 미국 정부는 2세대 이상 중국에 앞선 반도체 기술을 유지할 수 있다\"고 분석했다.\r\n"
				+ "\r\n"
				+ "노광 장비는 빛을 이용해 미세한 전자회로를 반도체 원판(웨이퍼)에 새기는 일종의 '사진기'다. 반도체는 회로가 미세할수록 성능과 생산성이 향상된다. 미세한 회로를 새기려면 노광 장비가 쏘는 빛의 파장도 짧아야 한다.\r\n"
				+ "";
		
		while (true) {
			
			System.out.print("검색어: ");
			String word = reader.readLine();
			
			if (txt.indexOf(word) > -1) {
				System.out.printf("txt의 %d번째 위치에서 발견함\n"
									, txt.indexOf(word)); //검색 O
			} else {
				break; // 없는값 : -1
			}
			
		} //while
		
		System.out.println("프로그램 종료");
	}

	private static void m7(BufferedReader reader) {
		
		// 공백제거
		// - String trim()
		// - 문자열 내의 시작과 끝에 존재하는 공백 제거
		
		String txt = "       하나    둘  셋   ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
		// 그렇다면 어디에 trim()이 쓰일까?
		// ex) 검색엔진에서 사용자가 실수로 띄어쓰기 할때 쓰임
		// 사용자의 편의성(서비스) 제공
		
		txt = "java";
		
		System.out.println(txt.equals("java")); //true
		System.out.println(txt.equals("    java")); //false
		
		
	}

	private static void m6(BufferedReader reader) throws IOException {

		// 주민등록번호 입력
		// - 반드시 '-'를 입력하세요.
		
		System.out.print("주민등록번호: ");
		String jumin = reader.readLine();
		
		//951128-1234567
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민등록번호");
			
			if (jumin.charAt(7) == '1') {
				System.out.println("남자");
			} else if (jumin.charAt(7) == '2') {
				System.out.println("여자");
			}
			
		} else {
			System.out.println("잘못된 주민등록번호");
		}
		
		
		
	}

	private static void m5(BufferedReader reader) throws IOException {
		
		
		/*
		 *  어제복습
		 *  1. length() : 문자열 길이(문자수)
		 *  2. charAt() : 특정 위치의 문자 추출
		 *  
		 */

		
		//**** 원시형과 참조형 간의 형변환 불가
		char c = 'A'; //값형, 원시형
		String s = "A"; //참조형
		
		System.out.println((int)c);
		//System.out.println((int)s); //Error : Cannot cast from String to int
		//-->문자열로부터는 형변환을 통해서 문자코드값을 얻어낼 수 없다.
		
		c = 'A'; // -> 정수 -> 1문자의 문자코드
		s = "A";
		
		c = s.charAt(0);
		System.out.println((int)c);
		
		
		
		
		System.out.print("입력 : ");
		String input = reader.readLine();
		
		//A. 영어 소문자만 입력
		// "hello" : 0 ~ 4
		// "hello123"
		
		for (int i=0; i<input.length(); i++) {
			
			c = input.charAt(i);
			//System.out.printf("%c(%d)\n", c, (int)c);
			// 'a' <= c <='z'
			
			//(int)c >= 97 && (int)c <= 122
			//(int)c < 97 || (int)c > 122
			//int)c < (int)'a' || (int)c 
			if (c < 'a' || c > 'z') { 
				System.out.println("유효하지 않음");
				break;
			}
			
			if (c < 'A' || c > 'Z') {
					System.out.println("유효하지 않음 ");
			
			}
			
			// C. 영어 대소문자만 입력
			if ((c < 'a' || c >'z') && (c < 'A' || c > 'Z')) {
				System.out.println("유효하지 않음");
				break;
				
			}

			// D. 숫자만 입력
			
			if (c < '0' || c > '9') {
				System.out.println("유효하지 않음");
				break;
			}
			
			// E. 영어대소문자 + 숫자
			if ((c < 'a' || c > 'z') 
				&& (c<'A' || c>'Z') 
				&& (c < '0' || c > '9')) {
				
				System.out.println("유효하지 않음");
				break;
			}
				
				
			// F. 한글만 입력
			// - 조합형 한글 : 자음, 모음조합 -> 한문자
			// - 완성형 한글 : 글자 자체를 등록
			
			
			if(c < '가' || c > '하') {
				System.out.println("유효하지 않음");
				break;
			}
			
			//G. 영어 대소문자 + 숫자 + '_' + 공백만 입력
			if ((c < 'a' || c > 'z')
					&& (c < 'A' || c > 'Z')
					&& (c < '0' || c > '9')
					&& (c != '_')
					&& (c != ' ')) {
				
				System.out.println("유효하지 않음");
				break;
				
			}
					
		}//for
		
		
		System.out.println("종료");
		
		
		
	}

	private static void m4(BufferedReader reader) {
		// 유효성
		// - 이름입력 > 2~5자 이내 + 한글만...
		
		//소문자로만 구성
		String id = "test";
		
		for (int i=0; i<id.length(); i++) {
			
			char c = id.charAt(i);
			int code = (int)c;
			
			
			//유효성 검사 -> 잘못된 경우를 찾는것이 좋다.
			if (code < 97 || code > 122) {
				System.out.println("잘못된 문자가 있습니다.");
				break; // 잘못된 문자 발견시 더이상 유효성검사 X
			}
			
			
		}
		System.out.println("종료");
	}

	private static void m3(BufferedReader reader) throws IOException {
		
		/*
		 *  문자열 추출 
		 *  - 원하는 위치의 문자를  추출
		 *  - char charAt(int index)
		 *  - index : 추출하고자 하는 문자의 위치(첨자, index, 서수)
		 *  - 서수를 0부터 센다. > Zero-based Index (자바)
		 * 
		 */
		String txt = "안녕하세요";
		
//		char c = txt.charAt(6);
//		System.out.println(c);
		
		for (int i=1; i<=10; i++) {
			//10회전(사용빈도 낮음)
		}
		
		for (int i=0; i<10; i++) {
			//10회전(사용빈도 높음)
			//이유:
			//- 컴퓨터는 숫자를 0부터 읽으며, int length()과 char charAt(index)
			//- 보통 문자열 추출할때 for문을 많이 쓰기때문
		}
		

		for (int i=0; i<txt.length(); i++) { 
			System.out.println(txt.charAt(i));
		}
	}

	private static void m2(BufferedReader reader) throws IOException {

		/*
		 *  길이 - 유효성검사
		 * 
		 *  예시>
		 *  회원 가입 -> 이름입력 -> [유효성 검사] -> DB저장(10글자)
		 *  -> 20자 입력 -> DB 에러 발생
		 * 
		 */
		
		
		

		//이름 입력 > 2~5자 이내
//		System.out.print("이름 입력 : "); 
//		String name = reader.readLine();
//		 
//		if (name.length() >= 2 && name.length() <= 5) {
//		System.out.println("회원가입 진행..."); } else {
//		System.out.println("이름은 2~5자 이내로 입력하세요."); }

		
		//올바른 이름을 입력할때 까지 위의 작업을 반복해보자.
		String name = "";
		
		while (true) {
			System.out.print("이름 : ");
			name = reader.readLine();
			
			if (name.length() >= 2 && name.length() <= 5) {
				break;
			} else {
				System.out.println("이름은 2~5자 이내로 입력하세요.");
			}
		} //while
		
		System.out.println("회원 가입..");
		
		
	
	}

	private static void m1() throws IOException {
		
		/*
		 *  문자열 길이
		 *  - 문자열을 구성하는 문자의 갯수(글자 수)
		 *  - int length();
		 * 
		 */
		
		String txt = "";
		
		txt = "ABCDEF"; //6글자
		
		System.out.println(txt.length()); //txt의 문자갯수? 6개
		System.out.println("ABCDEF".length()); //변수로 쓸수있는것은 상수로 사용ㄱ ㅏ능
		
		txt = "123 홍길동 !@#";
		System.out.println(txt.length()); // 숫자, 한글, 영어, 특수문자, 공백 -> 모두 1글자 취급
		
		System.out.println((int)' '); //스페이스(32)
		System.out.println((int)'	'); //탭(9)
		System.out.println((int)'\t');
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		txt = reader.readLine();
		
		//요구사항] 사용자 입력한 문장이 몇글자?
		System.out.printf("입력한 문장은 총 %d개의 문자로 구성되어어있습니다.", txt.length());
		
		
	}

}
