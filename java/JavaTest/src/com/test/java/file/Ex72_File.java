package com.test.java.file;

import java.io.*;
import java.util.Scanner;

public class Ex72_File {
	
	private static Scanner scan;
	private final static String DATA;
	
	static {
		scan = new Scanner(System.in);
		DATA = "dat\\student.dat"; //상대경로 
		//DATA = "D:\\java\\JavaTest\\dat\\studen.dat"; //절대경로
		//D:\\, C:\\ 지정안해주면 현재 JAVA가 실행중인 현재디렉토리를 기준으로 잡는다.
		
	}
	
	public static void main(String[] args) {
		
		//Ex72_File.java
		
		/*
		 *  학생 정보 관리
		 *  - 순수 파일 입출력 기반
		 *  - 데이터를 지속적으로 관리(*****) > 데이터구조 설계(저장할 파일 생성 + 저장할 구조(패턴))
		 *  
		 *  
		 *  
		 *  
		 *  - 데이터 정의
		 *  	a. 학생 정보?
		 *  		- 이름, 나이, 국어, 영어, 수학
		 *  		- 홍길동,27,100,90,100
		 *  
		 *  데이터 조작 > CRUD > Create, Read, Update, Delete
		 *  
		 *  기능
		 *  - 학생 정보 저장하기(C)
		 *  - 학생 정보 목록(R)
		 *  - 학생 정보 삭제하기(D)
		 */
		
		//코드 구현전에 dat폴더에 student.dat파일있는지 확인하기!
		//File file = new File(DATA);
		//System.out.println(file.exists());
		
		System.out.println("[학생 정보 관리]");
		
		boolean loop = true;
		
		while (loop) {
			
			//메뉴 출력
			//선택
			//분기
			
			String seq = menu();
			
			if (seq.equals("1")) {
				add();
			} else if (seq.equals("2")) {
				list();
			} else if (seq.equals("3")) {
				delete();
			} else {
				loop = false;
			}
		}
		
		
		
		System.out.println("[프로그램 종료]");
		
		
	}//main

	private static void pause() {
		System.out.println("엔터를 누르시면 다음으로 진행합니다.");
		scan.nextLine(); //Block
	}
	
	private static void delete() {
		
		//*** 중요
		/*
		 *  모든 파일 입출력은 읽기/쓰기만 가능하며 "수정"이란것이 없다.(불가능)
		 *  그렇다면 어떻게..?
		 *  수정 작업은 파일 전체가 삭제되며 다시 입력되서 저장이된다.
		 *  즉, 수정부분만 변하는것이 아닌, 전체삭제 -> 다시 붙여넣기
		 *  
		 */
		
		System.out.println("[학생 삭제]");
		
		Util util = new Util();
		try {
			
			//삭제할 리스트 이름만 보여주기
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			String line = "";
			System.out.println("[이름]");
			
			while ((line = reader.readLine()) != null) {
				
				//학생 1명 > 모든학생탐색
				//홍길동,13,100,90,80
				//System.out.println(line);
				
				String[] temp = line.split(",");
				System.out.printf("%s\n"
								, temp[0]);
				
			}
			reader.close();
			
			System.out.println("삭제할 학생을 선택하세요.");
			String name = util.get("선택(이름): ");
			
			//선택된(이름) line값을 result에 옮긴다.(reader)
			reader = new BufferedReader(new FileReader(DATA));
			line = "";
			String result = "";
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				if (!temp[0].equals(name)) {
					result += line + "\r\n";
				}
				
			}
			reader.close();
			
			//result에 저장된 값(나머지 학생)을 다시 붙여넣는다.(writer)
			BufferedWriter writer = new BufferedWriter(new FileWriter(DATA));
			
			writer.write(result);
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		pause();
	}

	private static void list() {
		
		System.out.println("[학생 목록]");
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			
			String line = "";
			
			System.out.println("[이름]\t[나이]\t[국어]\t[영어]\t[수학]");
			
			while ((line = reader.readLine()) != null) {
				
				//학생 1명 > 모든학생탐색
				//홍길동,13,100,90,80
				//System.out.println(line);
				
				String[] temp = line.split(",");
				System.out.printf("%s\t%5s\t%5s\t%5s\t%5s\n"
								, temp[0]
								, temp[1]
								, temp[2]
								, temp[3]
								, temp[4]);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		pause();
	}

	private static void add() {
		
		Util util = new Util();
		System.out.println("[학생 추가]");
		
		//매번 이렇게 print() Scanner() 쓰기엔 피곤하다..
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		//입출력 클래스로 따로 만들면 수월하다.
		String age = util.get("나이");
		String kor = util.get("국어");
		String eng = util.get("영어");
		String math = util.get("수학");
		
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(DATA, true));
			
			//홍길동,13,100,90,80 규칙으로 저장..
			writer.write(String.format("%s,%s,%s,%s,%s\n"
									,name , age, kor, eng, math));
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pause();
	}

	private static String menu() {
		
		System.out.println("===============================");
		System.out.println("1.    학생 정보 등록하기");
		System.out.println("2.    학생 정보 목록보기");
		System.out.println("3.    학생 정보 삭제하기");
		System.out.println("4.    종료");
		System.out.println("===============================");
		System.out.print("선택: ");
		
		String sel = scan.nextLine();
		
		return sel;
	}

}
