package com.test.java.file;
import java.io.*;
import java.util.*;

public class Ex73_File {
	
	private static Scanner scan;
	private final static String DATA;
	
	private static ArrayList<Memo> list; //memo.dat의 대리자
	
	static {
		scan = new Scanner(System.in);
		DATA = "dat\\memo.dat";
		list = new ArrayList<Memo>();
	}
	
	
	public static void main(String[] args) {
		
		/*
		 *  어제: 파일 입출력만 사용
		 *  1. 정보 쓰기
		 *  	- BufferedWriter
		 *  2. 정보 읽기
		 *  	- BufferedReader
		 *  3. 정보 삭제
		 *  	- BufferedReader > BufferedReader > BufferedWriter
		 *
		 *
		 *  오늘: 파일 입출력(백업장치) + 컬렉션 사용(주대상) 사용
		 *  - 프로그램 시작: 파일 모든 내용 읽기 > 메모리 저장(컬렉션)
		 *  - 프로그램 사용: 메모리 조작(컬렉션)
		 *  - 프로그램 종료: 메모리 저장(컬렉션) > 파일 모든 내용 쓰기
		 *  
		 *  [콘솔 메모장]
		 *  
		 *  기능
		 *  1. 메모 쓰기
		 *  2. 메모 읽기
		 *  3. 메모 삭제
		 *  
		 *   데이터
		 *   1. 메모
		 *   	a. 작성자(문자열)
		 *   	b. 메모내용(문자열)
		 *   		- 한줄 메모 : 어제방식..
		 *   		- 여러줄 메모 : ...?
		 *   	c. 날짜(2021-04-30 12:00:00)
		 *   	d. 중요도(A,B,C)
		 *   	e. 작성자 앞에 고유번호(숫자) - 유일한 값(식별자)
		 *   
		 *   2. 파일
		 *   	- memo.dat
		 *   3. 형식
		 *   	- < memo.dat >
		 *   	- 이름, 날짜, 중요도
		 *   	- 메모내용
		 *   	- ==================
		 *   
		 */
		
		load(); //텍스트파일 > 배열
		
		//System.out.println(list);
		
		
		System.out.println("\t[메모장]");
		
		boolean loop = true;
		
		while (loop) {
			
			//메뉴
			//선택
			//분기
			String sel = menu();
			
			if (sel.equals("1")) {
				add();
			} else if (sel.equals("2")) {
				list();
			} else if (sel.equals("3")) {
				delete();
			} else {
				loop = false;
			}
			
			
			
		}//while
		
		System.out.println("메모장을 종료합니다.");
		
		save();
		
	}//main
	
	private static void save() {
		
		/*
		 *  이 프로그램이 종료전에 기존 memo.dat 에 있는 파일은 전부 지우고,
		 *  우리가 ArrayList에 쓰기, 변경, 삭제등 햇던 모든것을 memo.dat 옮겨준다. (저장한다)
		 */
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(DATA));
			
			for (Memo memo : list) {
				
				writer.write(String.format("%s,%s,%s,%s\n%s==========\n"
											, memo.getSeq()
											, memo.getName()
											, memo.getRegdate()
											, memo.getPriority()
											, memo.getContent()));
				
			}
			
			writer.close(); //******항상 쓰고나서 닫아주자 close, 백업종료!!
			
		} catch (Exception e) {}
		
	}

	private static void load() {
		
		//BufferedReader
		//	- memo.dat > ArrayList<Memo> list
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
				//Memo 객체 1개 생성
				Memo memo = new Memo(); //memo.dat에 넣을 4가지 (번호,이름,시간,중요도) 확보
				
				//2,김모씨,2021-03-26 17:15:05,B
				//김모씨 군입대 ....
				//팔각모 사나이 ....
				//==========
				
				//메모장의 정해직 형식(규칙)을 이미 알고있는 상태이다. 이제 구분해보자
				String[] temp = line.split(",");
				
				memo.setSeq(temp[0]);
				memo.setName(temp[1]);
				memo.setRegdate(temp[2]);
				memo.setPriority(temp[3]);
				
				//메모 내용 읽기
				String tempContent = ""; //메모 내용 저장 변수
				while (!(line = reader.readLine()).equals("==========")) {
					
					tempContent += line + "\r\n";
				}
				memo.setContent(tempContent);
				
				//메모 1건 -> Memo 객체 1개에 옮겨 담기
				
				list.add(memo);
			}//while
			
			reader.close();
		
		} catch (Exception e) {}
	}

	private static void delete() {
		
		System.out.println("[메모 삭제]");
		
		System.out.println("[번호]\t[이름]\t[내용(일부분)]");
		
		for (Memo memo : list) {
			
			String content = memo.getContent().replace("\r\n", " ");
			if (content.length() > 10) {
				content = content.substring(0,10) + "..";
			}
			
			System.out.printf("%4s\t%s\t%s\n"
								, memo.getSeq()
								, memo.getName()
								, content);
		}
		
		System.out.print("삭제할 번호: ");
		String seq = scan.nextLine();
		
		/*
		 *  어제와달리 오늘은 삭제(수정)이 쉽다. 왜 why?
		 *  입출력만 이용했을때는 수정이란것이 없고, 필요부분만 삭제하고 다시 덮어쓰는 방식이지만,
		 *  입출력+컬렉션을 이용할땐 ArrayList가 있어서 배열에 저장된 내용만 삭제하면 된다!!
		 *  remove() 이용
		 */
		

		//향상된 for문  -> 추가, 삭제 작업을 하면안된다. > 에러발생
		//				-> 읽기 전용임
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSeq().equals(seq)) {
				//메모삭제
				list.remove(i);
			}
		}
		pause();
		
	}

	private static void list() {
		
		System.out.println("[메모 읽기]");
		
		System.out.println("[번호]\t[이름]\t[내용(일부분)]");
		
		for (Memo memo : list) {
			
			String content = memo.getContent().replace("\r\n", " ");
			if (content.length() > 10) {
				content = content.substring(0,10) + "..";
			}
			
			System.out.printf("   %s\t%s\t%s\n"
								, memo.getSeq()
								, memo.getName()
								, content);
		}
		System.out.println("   0\t목록끝내기");
		System.out.print("자세한 메모 선택(번호): ");
		
		String seq = scan.nextLine();
		if(seq != "") {
			if (!seq.equals("0")) {
				System.out.println("[메모 상세보기]");
				Memo memo = getMemo(seq);
				System.out.println("번호: " + memo.getSeq());
				System.out.println("이름: " + memo.getName());
				System.out.println("날짜: " + memo.getRegdate());
				System.out.println("중요도: " + memo.getPriority());
				System.out.print("내용: " + memo.getContent());
			}
		}
		pause();
	}

	private static Memo getMemo(String seq) {
		
		//자세히 확인할 메모 찾기
		for (Memo memo : list) {
			if (memo.getSeq().equals(seq)) {
				return memo;
			}
		}
		
		return null;
	}

	private static void add() {
		
		System.out.println("[메모 쓰기]");
		
		System.out.print("이름: ");
		String name = scan.nextLine();

		System.out.print("중요도(A,B,C): ");
		String priority = scan.nextLine();
		
		System.out.print("내용(exit:입력종료): ");
		String content = "";
		
		while (true) {
			String temp = scan.nextLine();
			
			if (temp.equals("exit")) {
				break;
			}
			content += temp + "\r\n";
			
		}
		
		//입력 받은 내용 > memo.dat 			  --> 지금은 X
		//입력 받은 내용 > ArrayList<Memo>에 추가 --> 지금하고있는것
		
		Memo memo = new Memo();
		
		memo.setName(name);
		memo.setPriority(priority);
		memo.setContent(content);
		
		Calendar now = Calendar.getInstance();
		memo.setRegdate(String.format("%tF %tT", now, now));
		
		//일련번호(고유번호)는 어떻게할까?
		//가장 큰(마지막) 번호에서 +1을 하면 차례대로 가능
		memo.setSeq(getSeq());
		
		list.add(memo); //ArrayList에 저장
		
		//System.out.println(list);
		
		pause();
	}

	private static String getSeq() {

		//일련번호 구하기!
		int max =0;
		for (Memo m : list) {
			if(Integer.parseInt(m.getSeq()) > max) {
				max = Integer.parseInt(m.getSeq());
			}
		}
		
		return (max+1) + "";
	}

	private static String menu() {
		
		System.out.println("===============================");
		System.out.println("1.        메모 쓰기");
		System.out.println("2.        메모 읽기");
		System.out.println("3.        메모 삭제");
		System.out.println("4.        종료");
		System.out.println("===============================");
		System.out.print("선택: ");
		
		String sel = scan.nextLine();
		
		return sel;
	}
	
	private static void pause() {
		System.out.println("엔터를 누르시면 다음으로 진행합니다.");
		scan.nextLine(); //Block
	}
}
