package com.test.java.file;

import java.io.File;
import java.util.Calendar;

public class Ex69_File {
	
	public static void main(String[] args) {
		
		//Ex69_File.java
		
		/*
		 *  파일 & 디렉토리 조작
		 * 
		 */
		
		
		//m1();
		//m2();
		//m3();
		m4();
		//m5();
	}//main

	private static void m5() {
		
		//파일 조작
		// - 삭제
		// - ***진짜 삭제됨(휴지통 X)
		// - 복구 불가능
		String path = "D:\\class\\java\\file\\BBB\\m3.txt";
		File file = new File(path);
		
		if (file.exists()) {
			System.out.println(file.delete());
		}
		
	}

	private static void m4() {
		
		//파일 조작
		// - 이름바꾸기
		// - 이름바꾸기와 이동과 동일한 행동 -> renameTo() 이용
		// - 만든 path객체 주소값에 원하는 파일명만 바꾸면됨
		
		//D:\class\java\file\AAA\m3.txt
		//m3.txt -> (이름바꾸기) m4.txt
		
		String path = "D:\\class\\java\\file\\AAA\\m3.txt";
		File file = new File(path);
		
		String path2 = "D:\\class\\java\\file\\AAA\\m4.txt";
		File file2 = new File(path2);
		
		
		if (file.exists()) {
			
			//파일명 바꾸기
			file.renameTo(file2);
			System.out.println("완료");
		}
		
		
	}

	private static void m3() {
		
		/*
		 *  파일 조작
		 *  - 이동(O), 이름바꾸기(O), 삭제(O), 
		 *  - 복사(X), 생성(X)
		 */
		
		//파일 이동(m3.txt)
		//AAA -> (이동) -> BBB 
		
		//이동할 파일 참조 객체
		String path = "D:\\class\\java\\file\\AAA\\m3.txt";
		File file = new File(path);
		
		//이동이 끝난 뒤에 모습을 참조할 객체
		String path2 = "D:\\class\\java\\file\\BBB\\m3.txt";
		File file2 = new File(path2);
		
		if (file.exists()) {
			
			//이동하기 (boolean) : renameTo(index);
			//true : 성공
			//false : 실패(같은 파일이 이미 있을 경우)
			if (file2.exists()) {
				System.out.println("이미 동일한 파일이 존재합니다.");
				
				//추가업무 ?
				//1.덮어쓰기(명령어없음 따로 구현 해야함) : 기존파일삭제 -> 이동하기
				//2.그만두기
			} else {
				boolean result = file.renameTo(file2);
				System.out.println(result);
			}
			
			System.out.println("완료");
		}
		
	}

	private static void m2() {
		
		/*
		 *  운영체제
		 *   - 파일, 폴더 = 동일한 객체
		 *   - 더 정확히, 폴더는 파일의 한 종류/
		 *   - 폴더는 공간이 아니다(***)
		 */
		
		//특정 폴더 정보 얻어오기
		// - T:\class\java
		
		//경로
		String path = "D:\\class\\java";
		
		//참조 객체 생성
		File dir = new File(path);
		
		if (dir.exists()) {
			System.out.println("폴더가 존재합니다.");
			System.out.println();
			
			//....~~ 코드 작성
			//폴더 정보 가져오기
			System.out.println(dir.getName()); //폴더명
			System.out.println(dir.isFile()); //false
			System.out.println(dir.isDirectory()); //true
			//System.out.println(dir.length()); //length는 안쓰인다.
			
			System.out.println(dir.getPath()); //실제 경로
			System.out.println(dir.getAbsolutePath()); //실제 경로
			System.out.println(dir.lastModified()); //최종 수정 시간
			
			System.out.println(dir.canRead());//true
			System.out.println(dir.canWrite()); //true
			System.out.println(dir.isHidden()); //false
			
		} else { //폴더가 없을 때 예외처리
			System.out.println("폴더이 존재하지 않습니다.");
		}
		
	}

	private static void m1() { 
		
		/*
		 *  특정 파일 정보 얻어오기
		 * 	- D:\class\java\m1.txt
		 *  - 외부 파일 접근 > 파일에 대한 참조 객체(대리인) 생성
		 *  - > 참조 객체 조작 > 외부 파일 조작
		 */
		
		//경로
		String path = "D:\\class\\java\\m1.txt";
		
		//참조 객체 생성
		//path는 실제로 있는 파일인가? 없는파일인가?
		//---> 상관없이 객체가 만들어진다.
		File file = new File(path);
		
		//해당 경로의 파일이 실제로 존재합니까? file.exists();
		System.out.println(file.exists()); //true
		
		//파일의 존재할 때, 안할 때 조건문
		if (file.exists()) {
			System.out.println("파일이 존재합니다.");
			System.out.println();
			
			//....~~ 코드 작성
			//파일 정보 가져오기
			System.out.println(file.getName()); //m1.txt 파일명(***)
			System.out.println(file.isFile()); //파일이냐? true(***)
			System.out.println(file.isDirectory()); //폴더냐? false
			System.out.println(file.length()); //26, 파일크기(Byte)
			System.out.println(file.getPath()); //실제 경로
			System.out.println(file.getAbsolutePath()); //실제 경로
			//위 6개는 자주 쓰이니 꼭 기억할 것.
			//------------------------------------------------------------
			
			System.out.println(file.lastModified()); //1619499981271(Tick 값)
			//Tick -> Calendar
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(1619499981271L);
			System.out.printf("%tF %tT\n", c, c); //최종 수정 시간
			
			System.out.println(file.canRead());//true
			System.out.println(file.canWrite()); //true
			System.out.println(file.isHidden()); //false
			
		} else { //파일 없을 때 예외처리
			System.out.println("파일이 존재하지 않습니다.");
		}
		
	}//m1

}
