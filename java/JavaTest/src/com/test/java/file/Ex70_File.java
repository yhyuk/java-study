package com.test.java.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Ex70_File {
	
	public final static String Q004;
	public final static String Q005;
	public final static String Q008;
	public final static String Q009;
	public final static String Q010;
	
	static {
		Q004 = "D:\\class\\java\\파일_디렉토리_문제\\음악 파일";
		Q005 = "D:\\class\\java\\파일_디렉토리_문제\\확장자별 카운트";
		Q008 = "D:\\class\\java\\파일_디렉토리_문제\\폴더 삭제\\delete";
		Q009 = "D:\\class\\java\\파일_디렉토리_문제\\크기 정렬";
		Q010 = "D:\\class\\java\\파일_디렉토리_문제\\직원";
	}
	public static void main(String[] args) {
	
		//Ex70_File.java
		//q27 file 문제풀이
		
		//q004();
		//q005();
		//q008();
		//q009();
		q010();
	}

	private static void q010() {
		
		File dir = new File(Q010);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				
				//아무개_2014__17.txt
				String[] temp = getName(file.getName());
				System.out.println(Arrays.toString(temp));
				
				//D:\class\java\file\직원\아무개\2014 만들기
				File subDir = new File(Q010 + "\\" + temp[0] + "\\" + temp[1]);
				subDir.mkdirs();
				
				//파일 이동
				file.renameTo(new File(subDir.getAbsoluteFile() + "\\" + file.getName()));
			}
		}
	}

	private static String[] getName(String name) {
		
		//아무개_2014__17.txt
		String[] temp = new String[2];
		
		int index = name.indexOf("_");
		temp[0] = name.substring(0, index); //직원
		
		int index2 = name.indexOf("_", index+1);
		temp[1] = name.substring(index+1, index2); //년도
		
		return temp;
	}

	private static void q009() {
		
		//폴더의 위치와 상관없이 모든 폴더 내의 파일 정보 가져오기
		File dir = new File(Q009);
		ArrayList<File> flist = new ArrayList<File>();
		
		addFile(dir, flist);
		
		for (File file : flist) {
			System.out.printf("%s\t%s\n", file.getName(), file.getAbsolutePath());
		}
		
		
	}
	//Q009 재귀호출 메소드
	public static void addFile(File dir, ArrayList<File> flist) { 		
		
		File[] list= dir.listFiles();
		//현재 폴더가 가지는 모든 파일 삭제
		for (File file : list) {
			if (file.isFile()) {
				flist.add(file);
			}
		}
		
		
		//자식 폴더로 들어가서 동일한 일을 반복 -> 재귀 호출
		for (File sub : list) {
			if (sub.isDirectory()) {
				addFile(sub, flist);
			}
		}
		
		//현재 폴더에는 아무것도 없다.
		dir.delete();
	}
	
	private static void q008() {
		
		//'delete'폴더 삭제하기
		// -> 내용물이 있는 폴더는 삭제를 못한다.
		// -> 내용물? -> 파일(빈폴더)
		
		//모든 파일 지우기
		File dir = new File(Q008);
		
		deleteFile(dir);
	}

	public static void deleteFile(File dir) { //Q008에 쓰일 재귀호출 메소드
		
		File[] list= dir.listFiles();
		//현재 폴더가 가지는 모든 파일 삭제
		for (File file : list) {
			if (file.isFile()) {
				file.delete();
			}
		}
		
		
		//자식 폴더로 들어가서 동일한 일을 반복 -> 재귀 호출
		for (File sub : list) {
			if (sub.isDirectory()) {
				deleteFile(sub);
			}
		}
		
		//현재 폴더에는 아무것도 없다.
		dir.delete();
	}

	private static void q005() {
		
		//이미지파일 확장자별로 구분, 개수 세기
		File dir = new File(Q005);
		File[] list= dir.listFiles();
		
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for (File file : list) {
			//System.out.println(file.getName());
			String ext = file.getName().substring(file.getName().lastIndexOf(".")+1);
			//System.out.println(ext);
			
			if (count.containsKey(ext)) {
				count.put(ext, count.get(ext) + 1); //count = count + 1
			} else {
				count.put(ext, 1);
			}
		}
		
		//출력 
		//사용자가 확장자가 몇개인지 알고있을때..
		//확장자 추가 될때마다 사용자가 직접 입력해야함.. 불편..?
		System.out.printf(".gif : %d개\n", count.get("gif"));
		System.out.printf(".jpg : %d개\n", count.get("jpg"));
		System.out.printf(".png : %d개\n", count.get("png"));
		
		//HashMap -> 루프
		Set<String> keys = count.keySet();
		
		for (String key : keys) {
			//System.out.println(key);
			System.out.printf(".%s : %d개\n", key, count.get(key));
		}
		
	}

	private static void q004() {
		
		//음악이 100개가 있다. 파일명 앞에 일련번호 붙이기
		//listFiles() + renameTo()
		
		File dir = new File(Q004);
		File[] list = dir.listFiles();
		int temp = 0;
		for (int i=0; i<list.length; i++) {
			
			//System.out.println(list[i].getName());
			
			String fileName = list[i].getName();
			
			if (fileName.toLowerCase().endsWith(".mp3")) {
				//mp3파일
				//System.out.println(fileName);
				fileName = String.format(" [%03d]%s", temp+1, fileName);
				System.out.println(fileName);
				temp++;
				
				list[i].renameTo(new File(Q004 + "\\" + fileName));
			}
		}
	}

}
