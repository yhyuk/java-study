package com.test.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;
import com.test.util.MyFile;

public class Ex69_File {
	
	private static int count = 0; //폴더 count
	private static int dcount = 0; //폴더 count
	private static long size = 0;
	
	public static void main(String[] args) {
		
		//Ex69_File.java
		
		//파일 & 디렉토리 조작

		
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		
	}//main

	private static void m13() {

		//- 크기: 747MB (784,330,273 바이트)
		//- 내용: 파일 11,979, 폴더 2,598	
		
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			countFile(dir);
			System.out.printf("총 파일 개수: %,d개\n", count);
			System.out.printf("총 폴더 개수: %,d개\n", dcount);
			System.out.printf("폴더 크기: %,dB\n", size);
			System.out.printf("폴더 크기: %,.0fMB\n"
								, (double)size/1024/1024);
		}
	}

	public static void countFile(File dir) {
		
		File[] list = dir.listFiles();
		for (File sub : list) {
			if (sub.isFile()) {
				count++;
				size += sub.length();
			}
		}
		
		for (File sub : list) {
			if (sub.isDirectory()) {
				countFile(sub); //재귀 호출
			}
		}
		dcount++;
	}
	

	private static void m12() {
		
		/*
		 *  재귀 메소드
		 *  - 팩토리얼
		 *  - 디렉토리 구조(****)
		 */
		
		//특정 폴더에 들어있는 파일의 개수?
		//- 크기: 747MB (784,330,273 바이트)
		//- 내용: 파일 11,979, 폴더 2,598		
		
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		int count = 0; //누적변수
		if (dir.exists()) {
			
			File[] list = dir.listFiles();
			for (File sub : list) {
				if (sub.isFile()) {
					count++;
				}
			}
			
			for (File sub : list) {
				if (sub.isDirectory()) {
					File[] sublist = sub.listFiles();
					for (File subsub : sublist) {
						if (subsub.isFile()) {
							count++;
						}
					}
					
					for (File subsub : sublist) {
						if (sub.isDirectory()) {
							File[] subsublist = subsub.listFiles();
							
							for(File subsubsub : subsublist) {
								if (subsubsub.isFile()) {
									count++;
								}
							}
							
							for(File subsubsub : subsublist) {
								if (subsubsub.isDirectory()) {
									count++;
								}
							} //폴더안의 파일, 폴더안의 파일 ..폴더안의 파일......
							  //반복해서 계속 for문 작성해야함
							  //그렇다면 어떻게해야할까..?
							  //재귀호출 써야함 --> m13() gogo
						}
					}
				}
			}
			
			System.out.printf("총 파일 개수: %d개\n", count);
		}
		
	}

	private static void m11() {
		
		/*
		 *  폴더의 내용보기
		 *  - 자식 폴더 + 자식 파일 목록
		 */
		
		String path = "C:\\eclipse";
		File dir = new File(path);
		
		if (dir.exists()) {
			
			//list()
			//- 사용 빈도 낮음.
			//- File클래스 객체 다시 만들어서 써야함.. 
			
			/*
			String[] list = dir.list();
			
			for (String name : list) { 
				
				//System.out.println(name); 
				//그 폴더에 속한 이름을 전부 알 수 있다.
				//but. 속한 이름이 폴더인지 파일인지 알 수 없다..
				
				//이름 -> 파일객체 -> 정보얻어오기
				File file = new File(path + "\\" + name);
				System.out.printf("%s - %s\n"
							,file.getName()
							,file.isFile() ? "파일" : "폴더");
			}
			*/
			
			//listFiles() 
			//- 사용빈도 높음(바로바로 사용가능)
			File[] list = dir.listFiles();
			
			/*
			//방법1. 폴더, 파일출력
			for (File file : list) {
				System.out.printf("%s - %s\n"
						,file.getName()
						,file.isFile() ? "파일" : "폴더");
			}
			*/
			
			//방법2. 폴더, 파일출력 -> 탐색기처럼 출력
			for (File sub : list) {
				if (sub.isDirectory()) { //폴더
					System.out.printf("[%s]\n", sub.getName());
				}
			}
			for (File sub : list) {
				if (sub.isFile()) { //파일
					System.out.println(sub.getName());
				}
			}
			
			
		}
	}

	private static void m10() {
		
		/*
		 *  파일 복사 
		 *  - m9()와 동일이지만,
		 *  - 직접 MyUtil 프로젝트 만듦
		 *  - 클래스 - 메소드 작성
		 *  
		 *  myutil.jar - 라이브러리
		 *  
		 */
		
		MyFile file = new MyFile();
		
		String orgPath = "D:\\class\\java\\file\\JavaTest.zip";
		String copyPath = "D:\\class\\java\\file\\BBB\\JavaTest.zip";
		
		
		if (file.copy(orgPath, copyPath)) {
			System.out.println("복사 성공");
		} else {
			System.out.println("복사 실패");
		}
		
	}

	private static void m9() {
		
		/*
		 *  파일 복사
		 *  - D:\class\java\file\JavaTest.zip
		 *  - D:\class\java\file\AAA\JavaTest.zip
		 */

		File org = new File("D:\\class\\java\\file\\JavaTest.zip");
		File copy = new File("D:\\class\\java\\file\\AAA\\JavaTest.zip");
		
		/*
		 *  파일 복사 -> 바이트 단위 복사
		 *  1. FileInputStream : 파일의 내용을 바이트 단위 읽기
		 *  2. FileOutputStream : 파일의 내용을 바이트 단위 쓰기
		 */
		
		try {
			FileInputStream fis = new FileInputStream(org);
			FileOutputStream fos = new FileOutputStream(copy);
			
			//버퍼(512KB ~ 1KB 내외)
			byte[] buffer = new byte[1024];
			
			int length = 0;
			
			//복사
			while ((length = fis.read(buffer)) > 0) {
				//System.out.println(length);
				fos.write(buffer, 0, length); // 0~length까지 읽는다.
			}
			System.out.println("파일 복사 완료");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//try-catch문의 코드 내용은 깊게 알필요 X (복붙하면됨)
		//중요한건 org, copy 경로만 알면됨.
		
	}

	private static void m8() {
		
		/*
		 *  폴더 삭제하기
		 *  
		 *  - 파일삭제하기 delete() 메소드는 같지만, 다르다.
		 *  - 이유는 빈폴더만 삭제 가능. (내용물이 있으면.. 삭제안됨.)
		 *  - 개발자가 그안의 모든 내용물을 각각 직접 삭제한뒤 (코드 구현)
		 *  - 빈폴더로 만든 뒤 삭제 가능하다.
		 */
		
		String path = "D:\\class\\java\\file\\member"; //원본
		File dir = new File(path);
		
		if (dir.exists()) {
			
			System.out.println(dir.delete());
			
		}
		
	}

	private static void m7() {
		
		/* 
		 *  폴더, 파일명 둘다 renameTo()로 가능하다.(둘 다 동일)
		 *  
		 *  - 폴더명 바꾸기 + 폴더 이동하기 
		 *  - 파일명 바꾸기 + 파일명 이동하기
		 */
		String path = "D:\\class\\java\\file\\GGG"; //원본
		File dir = new File(path);
		
		String path2 = "D:\\class\\java\\file\\AAA\\GGG"; //결과
		File dir2 = new File(path2);
		
		if (dir.exists()) {
			dir.renameTo(dir2);
			System.out.println("완료");
		}
		
		
	}

	private static void m6() {
		
		/*
		 *  1. 폴더 생성 (1개)
		 *  - 현재는 java\file\CCC 내에 CCC폴더 없음
		 *  - dir.mkdir() 실행 시 CCC폴더 생성완료.
		 */
		String path = "D:\\class\\java\\file\\CCC"; //희망하는 폴더의 경로
		File dir = new File(path);
		if (!dir.exists()) {
			//생성
			dir.mkdir(); //make directory -> path와 동일한 경로에 폴더를 생성한다.
			System.out.println("생성 완료");
		} else {
			//이미 있음 
			System.out.println(dir.mkdirs());
			System.out.println("같은 이름의 폴더가 이미 존재합니다.");
		}
		
		/*
		 *  2. 다중 폴더 생성 (새로운 폴더안의 새로운 폴더 생성)
		 *  - dir.mkdir()은 폴더 1개씩
		 *  - dir.mkdirs()는 여러폴더(폴더안에 폴더) 만들 때 사용가능
		 */
		String path2 = "D:\\class\\java\\file\\DDD\\EEE\\FFF"; //희망하는 폴더의 경로
		File dir2 = new File(path2);
		
		if (!dir2.exists()) {
			System.out.println(dir2.mkdirs());
			System.out.println("생성 완료");
		} else {
			System.out.println(dir2.mkdirs());
			System.out.println("같은 이름의 폴더가 이미 존재합니다.");
		}
		System.out.println();
		
		
		/* 
		 *  요구사항] 회원 > 회원별 개인 폴더 작성하기
		 *  - D:\class\java\file\member\[개인폴더]홍길동
		 */
		String[] member = { "홍길동", "아무개", "하하하", "호호호" };
		
		for (String name : member) {
			path = String.format("D:\\class\\java\\file\\member\\[개인폴더]%s", name);
			dir = new File(path);

			System.out.println(dir.mkdir());
			System.out.println(name + ". 개인폴더 생성완료.");
		}
		System.out.println();
		/* 
		 * 이 처럼 File클래스만 잘 활용하게되면 
		 * 프로그래밍업무가 아닌, 사무업무에 많은 도움이 된다.
		 */

		
		/*
		 *  요구사항] 2021년 날짜별 폴더 생성
		 *  - D:\class\java\file\date\2021-01-01
		 *  - D:\class\java\file\date\2021-12-31
		 *  - Calendar 사용
		 */
		
		Calendar c = Calendar.getInstance();
		c.set(2021,0, 1); //2021-01-01 setting
		
		//System.out.println(c.getActualMaximum(Calendar.DATE));
		//System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		//System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		for (int i=0; i<c.getActualMaximum(Calendar.DAY_OF_YEAR); i++) {
			
			path = String.format("D:\\class\\java\\file\\date\\%tF", c);
			dir = new File(path);
			
			System.out.println(dir.mkdirs());
			System.out.printf("%tF\n", c);
			c.add(Calendar.DATE, 1);
		}
		
		
	}

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
