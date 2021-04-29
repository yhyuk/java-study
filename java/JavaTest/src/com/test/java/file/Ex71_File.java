package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Ex71_File {

	public static void main(String[] args) {

		// Ex71_File.java

		/*
		 * 파일 입출력 - 자바 프로그램 > 데이터 > 메모리(주기억장치) > 휘발성(전원 공급 + 데이터 유지) - HDD, SSD, USB
		 * Memory (보조기억장치) > 영구성(전원 공급 무관 + 데이터 유지) - 자바 프로그램 <--> (데이터) <--> 보조 기억장치
		 * 
		 * 1. 텍스트 입출력 - 문자(열) 입출력 - 메모장 - ex) - "홍길동" -> (변환) ->
		 * 100100101011101011100011 //파일쓰기 - 100100101011101011100011 -> (변환) -> "홍길동"
		 * //파일읽기
		 * 
		 * 2. 바이너리 입출력 - 이미지, 동영상, 압축파일, 실행파일 등(비 텍스트 데이터)
		 * 
		 * 
		 * 인코딩, Encoding - 문자 코드를 부호화(0,1)하는 작업 - 내보내기(쓰기)
		 * 
		 * 디코딩, Decoding - 부호 데이터를 문자 코드 변환하는 작업 - 복호화 - 가져오기(읽기)
		 * 
		 * 
		 * 인코딩 / 디코딩 규칙? (알고있어야함) 1. ISO-8859-1 2. EUC-KR 3. ANSI 4. UTF-8 5. UTF-16 6.
		 * MS949
		 * 
		 * ANSI, ISO-8895-1, EUC-KR, MS949 (이 4가지는 똑같다고 생각하면됨) 1. 영어: 1byte 2. 한글: 2byte
		 * 
		 * 
		 * UTF-8 <--> UTF-16 (서로다름, 외워야함)
		 * 
		 * UTF-8(국제 표준) 1. 영어: 1byte 2. 한글: 3byte
		 * 
		 * UTF-16 1. 영어: 2byte 2. 한글: 2byte
		 * 
		 * 
		 * 인코딩 방식 사용 + 파일 입출력
		 * 
		 * 
		 * 
		 */

		// m1();
		// m2();
		// m3();
		// m4();
		// m5();
		// m6();
		// m7();
		m8();
	}// main

	private static void m8() {
		try {

			BufferedReader reader = new BufferedReader(
					new FileReader("D:\\class\\java\\JavaTest\\src\\com\\test\\java\\Ex05_DataType.java"));
			
			String line = "";
			int n = 1;
			
			while ((line = reader.readLine()) != null) {
				System.out.printf("%03d: %s\n", n,  line);
				n++;
			}
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void m7() {

		// 앞으로 모든 파일 읽기는 이렇게한다.
		// 이게 제일편함
		// 읽기

		try {

			// 키보드 읽기
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			// 파일 읽기
			BufferedReader reader2 = new BufferedReader(new FileReader("D:\\class\\java\\file\\data2.txt"));

			String line = reader2.readLine();

			System.out.println(line);

			reader.close();
			reader2.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void m6() {

		/*
		 * 쓰기 FileOutputStream > FileWriter > BufferedWriter FileInputStream >
		 * FileReader > BufferedReader
		 * 
		 */

		try {

			// Wrapper Class > 사용법 향상, 기능 추가 ...등등
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\class\\java\\file\\data2.txt"));

			writer.write("안녕하세요");
			writer.newLine();
			writer.write("홍길동입니다.");
			writer.newLine();

			writer.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void m5() { // check 할것

		try {

			FileReader reader = new FileReader("D:\\class\\java\\파일_디렉토리_문제\\직원\\하하하\\2014");

			int code = -1;

			while ((code = reader.read()) != -1) {
				System.out.print((char) code);
			}

			reader.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void m4() {

		/*
		 * 읽기 - 문자 단위 읽기(2byte) - 한글 읽기 가능
		 * 
		 */
		try {
			// FileOutputStream -> FileWriter
			// FileInputStream -> FileReader

			FileReader reader = new FileReader("D:\\class\\java\\file\\data2.txt");

			/*
			 * int code = reader.read(); System.out.println((char)code);
			 * 
			 * code = reader.read(); System.out.println((char)code);
			 * 
			 * code = reader.read(); System.out.println((char)code);
			 */

			int code = -1;

			while ((code = reader.read()) != -1) {
				System.out.print((char) code);
			}

			reader.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void m3() {

		/*
		 * 쓰기 - 문자 단위 쓰기(2byte) - 한글 쓰기 가능
		 */

		try {

			// FileOutputStream -> FileWriter
			FileWriter writer = new FileWriter("D:\\class\\java\\file\\data2.txt", true);

			// writer.write("홍길동");
			// writer.write("\r\n");
			// writer.write("안녕하삼");

			Scanner scan = new Scanner(System.in);
			System.out.print("입력: ");

			String line = scan.nextLine();

			writer.write(line);
			writer.write("\r\n");

			writer.close();

			System.out.println("종료");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void m2() {

		/*
		 * 읽기 - 바이트 단위 읽기 - 1byte 단위만 읽는다. (한글 불가능) - System.in.read()
		 */

		try {

			// 1. 읽기 전용 스트림 객체 만들기
			FileInputStream stream = new FileInputStream("D:\\class\\java\\file\\data.txt");

			// 2. 사용
			/*
			 * int code = stream.read(); System.out.println(code);
			 * 
			 * code = stream.read(); System.out.println(code);
			 * 
			 * code = stream.read(); System.out.println(code);
			 */

			// 이 루프 암기하기 (무조건!!)
			int code = -1;
			while ((code = stream.read()) != -1) {
				System.out.print((char) code);
			}

			// 3. 닫기
			stream.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void m1() {

		/*
		 * 쓰기 - 바이트 단위 쓰기 - 1byte 단위만 저장한다. (한글 불가능)
		 * 
		 * 파일에 데이터 저장하기(쓰기) 1. 스트림 객체 생성하기(스트림 열기) - 빨대를 음료컵에 꽂기 2. 스트림 객체 사용하기(쓰기) 3.
		 * 스트림 객체 닫기(스트림 닫기) - 마무리 작업
		 * 
		 */

		try {

			/*
			 * 쓰기 전용 스트림 - FileOutputStream - 파일이 존재하지 않으면 해당 파일을 생성 후 기록한다. - 쓰기 모드 a. 생성
			 * 모드, Create Mode(****) - 기본 모드 - 기존에 있어도 무조건 덮어쓰기를 한다.
			 * 
			 * b. 추가 모드, Append Mode - 기존에 있는 데이터에 추가로 쓰기를 한다.
			 */

			// 1. 스트림 생성 + 열기
			FileOutputStream stream = new FileOutputStream("D:\\class\\java\\file\\data.txt", true);

			// 2. 데이터 쓰기
			/*
			 * stream.write(13); //\r stream.write(10); //\n stream.write(65); //문자 코드 사용
			 * stream.write(66); stream.write(67);
			 */

			Scanner scan = new Scanner(System.in);
			System.out.print("문장: ");
			String line = scan.nextLine();

			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);

				stream.write(c); // 암시적 형변환 char -> int
			}
			stream.write('\r');
			stream.write('\n');

			// 3. 스트림 닫기
			stream.close();

			System.out.println("완료");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
