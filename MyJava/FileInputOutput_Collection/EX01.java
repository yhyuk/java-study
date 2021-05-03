package FileInputOutput_Collection;

import java.io.*;
import java.util.*;


public class EX01 {
	
	private final static String DATA;
	private static Scanner scan;
	private static ArrayList<Memo> list;
	
	static {
		scan = new Scanner(System.in);
		DATA = "dat\\memo.dat";
		list = new ArrayList<Memo>();
	}
	
	public static void main(String[] args) {
		
		load();
		System.out.println("\t[메모장]");
		boolean loop = true;
		while (loop) {
			
			String sel = menu();
			
			if (sel.equals("1")) add();
			else if (sel.equals("2")) list();
			else if (sel.equals("3")) delete();
			else loop = false;
			
		}
		
		System.out.println("메모장을 종료합니다.");
		
		save();
		
	}
	
	private static void save() {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(DATA));
			
			for (Memo memo : list) {
				writer.write(String.format("%s,%s,%s,%s\n%s============\n"
											, memo.getSeq()
											, memo.getName()
											, memo.getRegdate()
											, memo.getPriority()
											, memo.getContent()));
			}
			
			writer.close();
		} catch (Exception e) {}
		
	}

	private static void load() {
		
		try { 
			
			BufferedReader reader = new BufferedReader(new FileReader(DATA));
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
				Memo memo = new Memo();
				String[] temp = line.split(",");
				
				memo.setSeq(temp[0]);
				memo.setName(temp[1]);
				memo.setRegdate(temp[2]);
				memo.setPriority(temp[3]);
				
				String tempContent = "";
				while(!(line = reader.readLine()).equals("============")); {
					tempContent = line + "\r\n";
				}
				memo.setContent(tempContent);
				
				list.add(memo);
				
			}
			
			reader.close();
			
		} catch (Exception e) {}
		
	}

	private static void delete() {
		
		System.out.println("         [메모 삭제]");
		System.out.println("[번호]\t[이름]\t[내용(일부분)]");
		
		part();
		System.out.print("삭제할 번호: ");
		String seq = scan.nextLine();
		
		
		for (int i=0; i<list.size(); i++) {
			if (list.get(i).getSeq().equals(seq)) {
				list.remove(i);
			}
		}
		
		pause();
		
	}

	private static void part() {
		for (Memo memo : list) {
			
			String content = memo.getContent().replace("\r\n", " ");
			if (content.length() > 10) {
				content = content.substring(0, 10) + "..";
			}
			
			System.out.printf("    %s\t%s\t%s\n"
								, memo.getSeq()
								, memo.getName()
								, content);
		}
		
	}

	private static void list() {
		
		System.out.println("         [메모 읽기]");
		System.out.println("[번호]\t[이름]\t[내용(일부분)]");
		
		for (Memo memo : list) {
			
			String content = memo.getContent().replace("\r\n", " ");
			if (content.length() > 10) {
				content = content.substring(0, 10) + "..";
			}
			
			System.out.printf("    %s\t%s\t%s\n"
								, memo.getSeq()
								, memo.getName()
								, content);
		}
		System.out.println("   0:\t목록 끝내기");
		System.out.print("메모장 상세보기 선택(번호): ");
		
		String seq = scan.nextLine();
		if (seq != "") {
			if (!seq.equals("0")) {
				
				Memo memo = getMemo(seq);
				System.out.println("     [메모 상세보기]");
				System.out.println("번호: " + memo.getSeq());
				System.out.println("이름: " + memo.getName());
				System.out.println("날짜: " + memo.getRegdate());
				System.out.println("중요도: " + memo.getPriority());
				System.out.println("내용: " + memo.getContent());
				
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
		
		System.out.print("중요도(A, B, C): ");
		String priority = scan.nextLine();
		
		System.out.print("내용(exit:입력끝): ");
		String content = "";
		
		while (true) {
			String temp = scan.nextLine();
			if(temp.equals("exit")) {
				break;
			}
			content += temp + "\r\n";
		}
		
		Memo memo = new Memo();
		Calendar now = Calendar.getInstance();
		
		memo.setSeq(getseq());
		memo.setName(name);
		memo.setPriority(priority);
		memo.setContent(content);
		memo.setRegdate(String.format("%tF %tT", now, now));
		
		list.add(memo); //컬렉션(ArrayList)배열에 저장
		
		pause();
		
	}

	private static String getseq() {
		
		//고유번호:가장큰번호에서 +1 (각 고유번호는 절대 중복될수없음)
		int max = 0;
		for(Memo temp : list) {
			if(Integer.parseInt(temp.getSeq()) > max) {
				max = Integer.parseInt(temp.getSeq());
			}
		}
		
		return (max+1) + "";
		
	}

	private static String menu() {
		
		System.out.println("============================");
		System.out.println("         1.메모 쓰기");
		System.out.println("         2.메모 읽기");
		System.out.println("         3.메모 삭제");
		System.out.println("         4.종료");
		System.out.println("============================");
		System.out.print("선택: ");
		
		String sel = scan.nextLine(); 
		
		return sel;
	}
	
	private static void pause() {
		System.out.println("엔터를 누르시면 다음으로 진행합니다.");
		scan.nextLine();
	}

}
